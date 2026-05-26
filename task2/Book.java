package task2;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> books = new ArrayList<>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void removeBook(Book book) {
        books.remove(book);
    }

    public static void listBooks() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + " (ISBN: " + book.ISBN + ")");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");

        Book.addBook(book1);
        Book.addBook(book2);

        Book.removeBook(book2);
     
        Book.listBooks();
    }
}
