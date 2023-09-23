package org.example;

import java.util.ArrayList;

public class Book {
    String Name;
    String Author;
    String Year;
    String ISBN;
    public Book(String Name, String Author, String Year, String ISBN){
        this.Name = Name;
        this.Author = Author;
        this.Year = Year;
        this.ISBN = ISBN;
    }
    public void Show(){
        System.out.println("Book name: " + this.Name +
                "\nBook author: " + this.Author +
                "\nBook year: " + this.Year +
                "\nBook ISBN: " + this.ISBN + " \n");
    }
    public static void ShowAll(ArrayList<Book> books){
        for(Book book : books){
            book.Show();
        }
    }
    public static boolean Find(ArrayList<Book> books, String name){
        for(Book book : books){
            if(book.Name.equals(name)){
                book.Show();
                return true;
            }
        }
        System.out.println("Не знайдено книжки з такою назвою. Спробуйте перевірити правильність набору.");
        return false;
    }
    public static boolean Remove(ArrayList<Book> books, String isbn){
        int index = 0;
        for(Book book : books){
            if(book.ISBN.equals(isbn)){
                break;
            }
            index++;
        }
        if(index == books.size()){
            System.out.println("Не знайдено книжки з таким номером ISBN. Спробуйте перевірити правильність набору.");
            return false;
        }
        books.remove(index);
        System.out.println("Книжку з номером ISBN №" + isbn + " видалено.");
        return true;
    }
}
