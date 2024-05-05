import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SearchBookTest {

    @Test
    void searchByTitleTest() {
        LinkedList<Book> booksList = new LinkedList<>();
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee","", "J.B Lippincott & Co" , "9780446310789", 1000, 1960);
        Book b2 = new Book("Pride and Prejudice", "Jane Austen","", "T. Egerton, Whitehall" , "9780141439518", 1001, 1813);
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald","", "Charles Scribner's Sons" , "9780743273565", 1002, 1925);
        booksList.addLast(b1);
        booksList.addLast(b2);
        booksList.addLast(b3);

        String targetTitle= b3.title;
        String result="not found";
        int index = 0;
        Book b = booksList.get(index); //to traverse each element
        while (index < booksList.size()) {
            if (b.getTitle().equalsIgnoreCase(targetTitle)) {//if the book has the target title, print its information
                System.out.println(b);
                result = b.toString();
            }

            index++;
            if (index < booksList.size())
                b = booksList.get(index);
        }
        assertEquals(b3.toString(),result); // for this test we searched by title of b3
    }

    @Test
    void searchByAuthorTest() {
        LinkedList<Book> booksList = new LinkedList<>();
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee","", "J.B Lippincott & Co" , "9780446310789", 1000, 1960);
        Book b2 = new Book("Pride and Prejudice", "Jane Austen","", "T. Egerton, Whitehall" , "9780141439518", 1001, 1813);
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald","", "Charles Scribner's Sons" , "9780743273565", 1002, 1925);
        booksList.addLast(b1);
        booksList.addLast(b2);
        booksList.addLast(b3);

        String targetAuthor= b3.author1;
        String result="not found";

        int index = 0;
        Book b = booksList.get(index); //to traverse each element
        while (index < booksList.size()) {
            if (b.getAuthor1().equalsIgnoreCase(targetAuthor)) {//if the book has the target title, print its information
                System.out.println(b);
                result = b.toString();
            }

            index++;
            if (index < booksList.size())
                b = booksList.get(index);
        }
        assertEquals(b3.toString(),result); // for this test we searched by title of b3
    }

    @Test
    void searchByISBNTest() {
        LinkedList<Book> booksList = new LinkedList<>();
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee","", "J.B Lippincott & Co" , "9780446310789", 1000, 1960);
        Book b2 = new Book("Pride and Prejudice", "Jane Austen","", "T. Egerton, Whitehall" , "9780141439518", 1001, 1813);
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald","", "Charles Scribner's Sons" , "9780743273565", 1002, 1925);
        booksList.addLast(b1);
        booksList.addLast(b2);
        booksList.addLast(b3);

        String targetISBN= b3.isbn;
        String result="not found";

        int index = 0;
        Book b = booksList.get(index); //to traverse each element
        while (index < booksList.size()) {
            if (b.getIsbn().equalsIgnoreCase(targetISBN)) {//if the book has the target title, print its information
                System.out.println(b);
                result = b.toString();
            }

            index++;
            if (index < booksList.size())
                b = booksList.get(index);
        }
        assertEquals(b3.toString(),result); // for this test we searched by title of b3
    }
}