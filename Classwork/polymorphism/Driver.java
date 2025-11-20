import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        // Add at least 2 textbooks
        library.add(new TextBook("Mathematics for Engineers", "John Doe", 5, true));
        library.add(new TextBook("Introduction to Computer Science", "Jane Smith", 3, false));

        // Add at least 2 novels
        library.add(new Novel("To Kill a Mockingbird", "Harper Lee", 8, "Classic"));
        library.add(new Novel("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 6, "Science Fiction"));

        // Loop through the ArrayList and print information
        for (Book book : library) {
            System.out.println(book);
            if (book instanceof TextBook) {
                TextBook textbook = (TextBook) book;
                System.out.println("Edition: " + textbook.getEdition());
                System.out.println("Is Ebook: " + textbook.isEbook());
            } else if (book instanceof Novel) {
                Novel novel = (Novel) book;
                System.out.println("Reading Level: " + novel.getReadingLevel());
                System.out.println("Genre: " + novel.getGenre());
            }
            System.out.println(); // Separate entries for better readability
        }
    }
}
