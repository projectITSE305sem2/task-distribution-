import java.util.*;
public class SearchBook {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //sample books
        LinkedList<Book> booksList = new LinkedList<>(); //list of books � LinkedList object, each element is of type Book
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee","", "J.B Lippincott & Co" , "9780446310789", 1000, 1960);
        Book b2 = new Book("Pride and Prejudice", "Jane Austen","", "T. Egerton, Whitehall" , "9780141439518", 1001, 1813);
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald","", "Charles Scribner's Sons" , "9780743273565", 1002, 1925);
        booksList.addLast(b1);
        booksList.addLast(b2);
        booksList.addLast(b3);

        // Ask user what parameter he wants to search by (Title or author or isbn)
        System.out.println("What will you use to search? (Title/Author/ISBN");
        String method = kb.nextLine();
        System.out.println("Enter " + method);
        String input = kb.nextLine();

        if(method.equalsIgnoreCase("Title")) {
            int index = 0;
            Book b = booksList.get(index); //to traverse each element
            while (index < booksList.size()) {
                if (b.getTitle().equalsIgnoreCase(input)) //if the book has the same title, print its information
                    System.out.println(b);

                index++;
                if (index < booksList.size())
                    b = booksList.get(index);
            }
        }
        else if(method.equalsIgnoreCase("Author")) {
            int index = 0;
            Book b = booksList.get(index); //to traverse each element
            while (index < booksList.size()) {
                if (b.getAuthor1().equalsIgnoreCase(input)) //if the book has the same title, print its information
                    System.out.println(b);

                index++;
                if (index < booksList.size())
                    b = booksList.get(index);
            }
        }
        else if(method.equalsIgnoreCase("ISBN")) {
            int index = 0;
            Book b = booksList.get(index); //to traverse each element
            while (index < booksList.size()) {
                if (b.getIsbn().equalsIgnoreCase(input)) //if the book has the same title, print its information
                    System.out.println(b);

                index++;
                if (index < booksList.size())
                    b = booksList.get(index);
            }
        }
    } //end of main
} //end of class