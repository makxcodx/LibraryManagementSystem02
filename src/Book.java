public class Book implements Displayable{
    private String title;
    private String author;
    private String ISBN;
    private boolean availabilityStatus;

    public Book(String title, String author, String ISBN, boolean availabilityStatus){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availabilityStatus = availabilityStatus;
    }

    public void toString(int counter, String title, String author, String ISBN, boolean isAvailabilityStatus){
            System.out.println(counter + " . Title: " + title + " ,Author: " + author + " , ISBN: "
                    + ISBN + " , Available: " + isAvailabilityStatus);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

}