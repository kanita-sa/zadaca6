package zadaci.zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private List<Book> listOfBooks;

    public Bookshelf(){
        this.listOfBooks = new ArrayList<>();
    }

    public boolean addBook(Book theBook){
        return listOfBooks.add(theBook);
    }

    public boolean containsBook(String title){
        for (Book theBook : listOfBooks){
            if(theBook.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(long ISBN){
        for (Book theBook : listOfBooks){
            if(theBook.getISBN() == ISBN){
                return true;
            }
        }
        return false;
    }

    public String printBookshelf(){
        return listOfBooks.toString();
    }



}
