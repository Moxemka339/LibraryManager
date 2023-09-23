package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int query = 5;
        while (true) {
            System.out.println("""
                    Choose an operation:
                    1. Add a book.
                    2. View the entire catalog of books.
                    3. Find a book by title.
                    4. Delete a book by ISBN.
                    0. Exit the program.
                    """);
            try {
                query = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: You entered a non-numeric value");
            }
            if (query == 1) {
                do {
                    System.out.println("Enter the book title: ");
                    String name = s.nextLine();
                    System.out.println("Enter the book author: ");
                    String author = s.nextLine();
                    System.out.println("Enter the book's publication year: ");
                    String year = s.nextLine();
                    System.out.println("Enter the book's ISBN number: ");
                    String isbn = s.nextLine();
                    books.add(new Book(name, author, isbn, year));
                    System.out.println("1. Add another book.\n" +
                            "0. Return to the main menu.");
                    while (true) {
                        try {
                            query = Integer.parseInt(s.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: You entered a non-numeric value.");
                        }
                        if (query == 1) break;
                        else if (query == 0) break;
                        else System.out.println("You entered an invalid context menu value!");
                    }
                } while (query != 0);
            } else if (query == 2) {
                Book.ShowAll(books);
            } else if (query == 3) {
                while (true) {
                    System.out.println("Enter the book title: \n" +
                            "0. Exit the search menu.");
                    String QueryName = s.nextLine();
                    if (QueryName.equals("0")) break;
                    if (Book.Find(books, QueryName)) {
                        break;
                    }
                }
            } else if (query == 4) {
                while (true) {
                    System.out.println("Enter the book's ISBN number: \n" +
                            "0. Exit the deletion menu");
                    String QueryISBN = s.nextLine();
                    if (QueryISBN.equals("0")) break;
                    if (Book.Remove(books, QueryISBN)) {
                        break;
                    }
                }
            } else if (query == 0) break;
        }
    }
}