package Mutability;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return (List<Book>) Collections.unmodifiableList(books);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }


    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }
}
