package zadaci.zadatak2;

import javax.swing.undo.AbstractUndoableEdit;

public class Book {
    private String title;
    private long ISBN;
    private String author;

    public Book(final String title, final long ISBN, final String author){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    public long getISBN(){
        return ISBN;
    }

    @Override
    public String toString(){
        return this.title + " - " + this.ISBN + " - " + this.author + "\n";
    }
}
