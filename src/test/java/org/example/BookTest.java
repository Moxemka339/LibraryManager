package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void showAll() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", "2021", "ISBN1"));
        books.add(new Book("Book2", "Author2", "2022", "ISBN2"));
        books.add(new Book("Book3", "Author3", "2023", "ISBN3"));

        Book.ShowAll(books);
    }

    @Test
    void find() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", "2021", "ISBN1"));
        books.add(new Book("Book2", "Author2", "2022", "ISBN2"));
        books.add(new Book("Book3", "Author3", "2023", "ISBN3"));

        System.out.println("Expected: Error. Output: ");
        Book.Find(books, "Book123");
        System.out.println("Expected: Name: Book1 Author: Author1." +
                "Year: 2021 ISBN: ISBN1 Output: ");
        Book.Find(books, "Book1");

    }


    @Test
    void remove() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", "2021", "ISBN1"));
        books.add(new Book("Book2", "Author2", "2022", "ISBN2"));
        books.add(new Book("Book3", "Author3", "2023", "ISBN3"));

        System.out.println("Expected: Error. Output: ");
        Book.Remove(books, "ISBN123");
        System.out.println("Expected: Deleted Output: ");
        Book.Remove(books, "ISBN1");
    }
}
