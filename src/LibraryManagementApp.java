
public class LibraryManagementApp {
    public static void main(String[] args) {
        Library library = new Library();
        User student = new Student("Alice", "S123");
        User teacher = new Teacher("Bob", "T456");
        student.addUser();
        teacher.addUser();

        Book book1 = new Book("Introduction to Java", "John Doe", "123456", true);
        Book book2 = new Book("OOP Concepts", "Jane Smith", "789101", true);

        library.addBook(book1);
        library.addBook(book2);

        try {
            student.borrowBook(book1);
            student.displayUser();
            teacher.borrowBook(book2);
            teacher.displayUser();
            // Demonstrate returning books and handling exceptions.
            student.returnBook(book1);
            student.returnBook(book1); // Simulate trying to return the same book again.
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        library.displayAvailableBooks();
    }
}
