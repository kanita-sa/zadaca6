package zadaci.zadatak2;

public class Main {
    public static void main(String[] args){
        final Bookshelf theBookshelf = new Bookshelf();
        final Book book1 = new Book("Bogovo roblje", 9789958660627L, "Karic, Enes");
        final Book book2 = new Book("To Kill a Mockingbird", 9780060173227L, "Lee, Harper");

        theBookshelf.addBook(book1);
        theBookshelf.addBook(book2);

        System.out.println(theBookshelf.printBookshelf());
        System.out.println(theBookshelf.containsBook(9780060173227L));
        System.out.println(theBookshelf.containsBook("Dune"));
    }
}
