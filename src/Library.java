import java.util.ArrayList;

public class Library{
    static ArrayList<Book> bookCollection = new ArrayList<>();

    public void addBook(Book book) {
        boolean checkBookInLibrary = checkBookAvailability(book);
        if (!checkBookInLibrary) {
            bookCollection.add(book);
            System.out.print("Book added to Library");
        }else{
            System.out.print("Book already in Library");
        }
    }

    public void removeBook(Book book) {
        if(bookCollection.contains(book)){
            bookCollection.remove(book);
            System.out.println("Book removed from Library");
        }else{
            System.out.println("Book not in Library");
        }
    }

    public boolean checkBookAvailability(Book book) {
        boolean bookAvailability = false;
        if(bookCollection.contains(book)){
            bookAvailability = true;
        }
        return bookAvailability;
    }

    public void displayAvailableBooks() {
        for (Book book : bookCollection) {
            int counter = 1;
            String title = book.getTitle();
            String author = book.getAuthor();
            String ISBN = book.getISBN();
            boolean isAvailabilityStatus =  book.isAvailabilityStatus();
            book.toString(counter, title, author, ISBN, isAvailabilityStatus);
            counter ++;
        }
    }
}

