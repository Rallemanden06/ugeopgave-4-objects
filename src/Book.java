//  Opgave 5
public class Book {
    private String titel;
    private String author;
    private boolean available;

    public Book(String titel, String author, boolean available){
        this.titel = titel;
        this.author = author;
        this.available = available;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable(){
        return available;
    }

    public void borrow(){
        if (available){
            available = false;
        } else {
            System.out.println("not available");
        }
    }

    public void returnBook(){
            available = true;
    }

    public String toString() {
        String status = available ? "Available" : "Not available";
        return titel +" af "+ author + " - " + status;
    }
}
