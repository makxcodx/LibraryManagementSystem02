public class Teacher extends User {

    public Teacher(String name, String id) {
        super(name, id);
    }

    @Override
    void borrowBook(Book book) {
        boolean bookChecked = super.checkBook(book);
        if(!bookChecked){
            this.borrowedBooks.add(book);
            System.out.println("Book borrowed successfully");
        }else{
            System.out.println("No Book was borrowed");
        }
    }

    @Override
    void returnBook(Book book) {
        if (super.borrowedBooks.contains(book)) {
            super.borrowedBooks.remove(book);
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book already returned");
        }

    }

}
