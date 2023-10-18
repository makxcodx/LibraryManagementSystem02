import java.util.ArrayList;

abstract class User {
    private String name;
    private String id;
    ArrayList<Book> borrowedBooks;
    ArrayList<User> userLists = new ArrayList<>();
    
    public User(String name, String id){
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    abstract void borrowBook(Book book);

    abstract void returnBook(Book book);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

}
