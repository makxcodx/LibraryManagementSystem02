public class Student extends User{

    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    void borrowBook(Book book) {
        if(Library.bookCollection.contains(book)){
            super.borrowedBooks.add(book);
            System.out.println("Book borrowed successfully");
        }
    }

    @Override
    void returnBook(Book book) {
        if(super.borrowedBooks.contains(book)){
            super.borrowedBooks.remove(book);
            System.out.println("Book returned successfully");
        }
    
    }
    
}
