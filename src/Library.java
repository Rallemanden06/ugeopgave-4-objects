// Opgave 5
import java.util.ArrayList;

public class Library {
    String libraryName;
    ArrayList<Book> books;

    Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> findAvailableBooks(){
        ArrayList<Book> available = new ArrayList<>();
        for (Book book : books){
            if (book.isAvailable()){
                available.add(book);
            }
        }
        return available;
    }

    public Book findBookByTitel(String titel){
        for (Book book : books){
            if (book.getTitel().equalsIgnoreCase(titel)){
                return book;
            }
        }
        return null;
    }

    public void printAllBooks(){
        System.out.println("All books");
        for (Book book: books){
            System.out.println(book);
        }
    }
}

