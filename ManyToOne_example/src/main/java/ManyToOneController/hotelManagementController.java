package ManyToOneController;

import ManyToOneEntity.Hotel;
import ManyToOneEntity.Room;

import java.util.*;

import ManyToOneDao.HotelDao;
import ManyToOneDao.RoomDao;
public class hotelManagementController {
	public static void main(String[] args) {
		Hotel hotel=readHotelInfo();
		List<Room> listOfRooms=readRoomInfo(hotel);
		HotelDao hoteldao=new HotelDao();
		hoteldao.saveHotel(hotel);
		RoomDao roomdao=new RoomDao();
		for(Room room:listOfRooms) {
			roomdao.saveRoom(room);
		}
		
		System.out.println("hotel info with the room details saved");
	}
	private static List<Room> readRoomInfo(Hotel hotel) {
		Room room1=new Room();
		room1.setId(101);
		room1.setName("F101");
		room1.setNumberofUsers(3);
		room1.setType("non-ac");
		room1.setPrice(1200.0);
		room1.setHotel(hotel);
		
		Room room2=new Room();
		room2.setId(102);
		room2.setName("s101");
		room2.setNumberofUsers(4);
		room2.setType("non-ac");
		room2.setPrice(1400.0);
		room2.setHotel(hotel);
		
		Room room3=new Room();
		room3.setId(103);
		room3.setName("T101");
		room3.setNumberofUsers(2);
		room3.setType("ac");
		room3.setPrice(3000.4);
		room3.setHotel(hotel);
		return Arrays.asList(room1,room2,room3);
	}
	public static Hotel readHotelInfo() {
		Hotel hotel=new Hotel();
		hotel.setId(1001);
		hotel.setName("Taj");
		hotel.setLocation("India");
		return hotel;
	}
}
