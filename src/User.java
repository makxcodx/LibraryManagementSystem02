import java.util.ArrayList;

abstract class User {
    private String name;
    private String id;
    ArrayList<Book> borrowedBooks;
    static ArrayList<User> userLists = new ArrayList<>();

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    abstract void borrowBook(Book book);

    abstract void returnBook(Book book);

    public void addUser(){
    boolean userChecked = checkUser(this);
    if(!userChecked){
        userLists.add(this);
        System.out.println("User added successfully");
    }else{
        System.out.println("User not available");
    }

    }

    public static boolean checkUser (User user){
    boolean userCheck = false;
    if (userLists.contains(user)) {
        userCheck = true;
    }
    return userCheck;
    }

    public static boolean checkBook(Book book) {
        boolean bookCheck = false;
        for (User user : User.userLists) {
            if (user.borrowedBooks.contains(book)) {
                bookCheck = true;
            }
        }
        return bookCheck;
    }

    public void displayUser() {
        System.out.println("Name: " + this.getName() + " ID: " + this.getId() + "Book borrowed: ");
        String id = this.getId();
        getBorrowedBooks(id);

    }

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

    public static void getBorrowedBooks(String id) {
        for (User user : userLists) {
            if (user.getId().equals(id)) {
                for (Book book : user.borrowedBooks) {
                    System.out.println("Title: " + book.getTitle() + " ,Author: " + book.getAuthor() + " , ISBN: "
                            + book.getISBN());
                }
            }
        }
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

}
