package Mutability;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class MutabilitySpecs {

    @Test
    public void changeReturnedListOfBooks(){
        BookShelf shelf = new BookShelf();
        shelf.addBook(new Book("Clean Code"));
        shelf.addBook(new Book("Learn Junit 5"));

        List<Book> books = shelf.getBooks();
        try{
            books.add(new Book("Wrong Behaviour"));
            //assertTrue(shelf.getBooks().size() == 2,()-> "Wrong count should contain only 2");
            fail(()-> "Should not allow books to be added");
        } catch (Exception e){
            assertTrue(e instanceof UnsupportedOperationException,()-> "Should throw exception");
        }
    }
}
