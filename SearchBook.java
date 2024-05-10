import java.util.*;

public class SearchBook {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Sample books
        ArrayList<Book> booksList = new ArrayList<>();
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee", "", "J.B Lippincott & Co", "9780446310789", 1000, 1960);
        Book b2 = new Book("Pride and Prejudice", "Jane Austen", "", "T. Egerton, Whitehall", "9780141439518", 1001, 1813);
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald", "", "Charles Scribner's Sons", "9780743273565", 1002, 1925);
        booksList.add(b1);
        booksList.add(b2);
        booksList.add(b3);

        // Ask user what parameter he wants to search by (Title or author or ISBN)
        System.out.println("What will you use to search? (Title/Author/ISBN)");
        String method = kb.nextLine();

        // Validate the search method input
        if (!method.equalsIgnoreCase("Title") && !method.equalsIgnoreCase("Author") && !method.equalsIgnoreCase("ISBN")) {
            System.out.println("Invalid search method. Please enter a valid search method.");
            return;
        }

        System.out.println("Enter " + method);
        String input = kb.nextLine();

        // Perform the search using the enhanced for loop
        boolean found = false;
        for (Book book : booksList) {
            if (method.equalsIgnoreCase("Title") && book.getTitle().equalsIgnoreCase(input)) {
                System.out.println(book);
                found = true;
            } else if (method.equalsIgnoreCase("Author") && book.getAuthor1().equalsIgnoreCase(input)) {
                System.out.println(book);
                found = true;
            } else if (method.equalsIgnoreCase("ISBN") && book.getIsbn().equalsIgnoreCase(input)) {
                System.out.println(book);
                found = true;
            }
        }

        // Display message if no books are found
        if (!found) {
            System.out.println("No books found matching the search criteria.");
        }
    }
}