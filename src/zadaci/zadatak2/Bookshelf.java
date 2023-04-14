package zadaci.zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<zadaci.zadatak2.Book> listOfBooks;

    public Bookshelf(){
        this.listOfBooks = new ArrayList<>();
    }

    public boolean addBook(zadaci.zadatak2.Book theBook){
        return listOfBooks.add(theBook);
    }

    public boolean containsBook(String title){
        for (zadaci.zadatak2.Book theBook : listOfBooks){
            if(theBook.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(long ISBN){
        for (zadaci.zadatak2.Book theBook : listOfBooks){
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
