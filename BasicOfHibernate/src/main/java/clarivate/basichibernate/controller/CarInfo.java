package clarivate.basichibernate.controller;
import java.util.*;
import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import clarivate.basichibernate.entity.Car;
public class CarInfo {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		Car car=readCarInfo(read);
		saveCar(car);
}
	 public static void saveCar(Car car) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("alpha");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 
		 
		 entityTransaction.begin();
	      entityManager.persist(car);
	      entityTransaction.commit();//for saving permenantly
		 
	 }
	 private static Car readCarInfo(Scanner read) {
		 System.out.println("enter the car id=");
		 int carId=read.nextInt();
		 
		 System.out.println("enter the car name=");
		 String carName=read.next();

		 System.out.println("enter the car price=");
		 double carPrice=read.nextDouble();

		 System.out.println("enter the user brand=");
		 String carBrand=read.next();
		 
		 System.out.println("enter the car type =");
		 String cartype=read.next();

		 Car car=new Car();
		 car.setCarId(carId);
		 car.setCarName(carName);
		 car.setCarPrice(carPrice);
		 car.setCarBrand(carBrand);
		 car.setCarType(cartype);
		 return car;
		 
	 }
}
