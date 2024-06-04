package Assingment;
import java.util.*;
public class Book {

        private int bookID;
        private int pages;
        private double price;

        // Default constructor
        public Book() {
        }

        // Parameterized constructor
        public Book(int bookID, int pages, double price) {
            this.bookID = bookID;
            this.pages = pages;
            this.price = price;
        }

        // Input values using Scanner
        public void get() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Book ID: ");
            bookID = scanner.nextInt();

            System.out.print("Enter Number of Pages: ");
            pages = scanner.nextInt();

            System.out.print("Enter Price: ");
            price = scanner.nextDouble();
        }

        // Display values
        public void show() {
            System.out.println("Book ID: " + bookID);
            System.out.println("Number of Pages: " + pages);
            System.out.println("Price: $" + price);
        }

        // Set values using parameters
        public void set(int bookID, int pages, double price) {
            this.bookID = bookID;
            this.pages = pages;
            this.price = price;
        }

        // Get the value of Price
        public double getPrice() {
            return price;
        }

        public static void main(String[] args) {
            // Example usage
            Book book1 = new Book();
            book1.get();
            book1.show();
            System.out.println("Price of a Book1: $" + book1.getPrice());

            Book book2 = new Book();
            book2.set(2, 150, 19.99);
            book2.show();

            System.out.println("Price of  a Book2: $" + book2.getPrice());
        }
    }


