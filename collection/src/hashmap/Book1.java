package hashmap;
import java.util.*;
public class Book1{
	String name;
    int pages;

    public Book1(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    public String toString() {
		return "name: "+name+" "+"pages: "+pages;
		
	}
    public int hashCode() {
		return name.hashCode()+((Integer)pages).hashCode();
		
	}

    public static void main(String[] args) {
        ArrayList bl= new ArrayList();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("1-> Add a book");
            System.out.println("2-> Delete a book");
            System.out.println("3-> Update a book");
            System.out.println("4-> Exit");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();
            s.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String bookName = s.nextLine();
                    System.out.print("Enter number of pages: ");
                    int bookPages = s.nextInt();
                    //s.nextLine(); 
                    bl.add(new Book1(bookName, bookPages));
                    System.out.println("Book added successfully!");
                    System.out.println(bl);
                    break;

                case 2:
                    System.out.print("Enter index to delete: ");
                    int d = s.nextInt();
                   s.nextLine(); 
                    if (d>= 0 && d< bl.size()) {
                        bl.remove(d);
                        System.out.println("Book deleted successfully!");
                        System.out.println(bl);
                    } 
                    else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter index to update: ");
                    int i = s.nextInt();
                    s.nextLine();
                    if (i>= 0 && i< bl.size()) {
                        System.out.print("Enter new book name: ");
                        String updatedName = s.nextLine();
                        System.out.print("Enter new number of pages: ");
                        int updatedPages = s.nextInt();
                        s.nextLine();
                        bl.set(i, new Book1(updatedName, updatedPages));
                        System.out.println(bl);
                        System.out.println("Book updated successfully!");
                    }
                    else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Exit!!");
                    break;

                    default:
                    System.out.println("Please enter a valid number 1 to 3");
                    break;
            }
        }
    }
}






