import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BookTest {
    Book b1 = new Book("To Kill a Mockingbird", "Harper Lee","none", "J.B Lippincott & Co" , "9780446310789", 1000, 1960);

    @Test
    void getTitleTest() {
        String result = b1.getTitle();
        assertEquals("To Kill a Mockingbird",result);
    }

    @Test
    void getYearPublicationTest() {
        int result = b1.getYearPublication();
        assertEquals(1960,result);
    }

    @Test
    void getAccessionNumTest() {
        long result = b1.getAccessionNum();
        assertEquals(1000,result);
    }

    @Test
    void getIsbnTest() {
        String result = b1.getIsbn();
        assertEquals("9780446310789",result);
    }

    @Test
    void getPublisherTest() {
        String result = b1.getPublisher();
        assertEquals("J.B Lippincott & Co",result);
    }

    @Test
    void getAuthor2Test() {
        String result = b1.getAuthor2();
        assertEquals("none",result);
    }

    @Test
    void getAuthor1Test() {
        String result = b1.getAuthor1();
        assertEquals("Harper Lee",result);
    }

    @Test
    void setTitleTest() {
        b1.setTitle("updated");
        String result = b1.title;
        assertEquals("updated",result);
    }

    @Test
    void setYearPublicationTest() {
        b1.setYearPublication(0000);
        int result = b1.yearPublication;
        assertEquals(0000,result);
    }

    @Test
    void setAccessionNumTest() {
        b1.setAccessionNum(0000);
        long result = b1.accessionNum;
        assertEquals(0000,result);
    }

    @Test
    void setIsbnTest() {
        b1.setIsbn("1234567890123"); // For successful setting; because new value must consist of 13.
        String result = b1.isbn;
        assertEquals("1234567890123",result);

        b1.setIsbn("not updated"); // For unsuccessful setting; because new value must consist of 13.
        String result2 = b1.isbn;
        assertEquals("1234567890123",result2);
    }

    @Test
    void setAuthor1Test() {
        b1.setAuthor1("updated");
        String result = b1.author1;
        assertEquals("updated",result);
    }

    @Test
    void setPublisherTest() {
        b1.setPublisher("updated");
        String result = b1.publisher;
        assertEquals("updated",result);
    }

    @Test
    void setAuthor2Test() {
        b1.setAuthor2("updated");
        String result = b1.author2;
        assertEquals("updated",result);
    }

    @Test
    void testToStringTest() {
        String result = b1.toString();
        assertEquals("\n\nBook { Title = '" + b1.title + "' \nAuthor 1 = '" + b1.author1 +
                "' \nAuthor 2 = '" + b1.author2 + "' \nPublisher = '" + b1.publisher +
                "' \nYear Of Publication = '" + b1.yearPublication + "' \nISBN = '" +
                b1.isbn + "' \nAccession Number = '" + b1.accessionNum + "' }",result);
    }

    @Test
    void equalsTest() {
        Book b2 = new Book("The Great Gatsby", "F.Scott Fitzgerald","", "Charles Scribner's Sons" , "9780743273565", 1002, 1925);
        Book b3 = new Book("The Great Gatsby", "F.Scott Fitzgerald","", "Charles Scribner's Sons" , "9780743273565", 1002, 1925);
        boolean result1 = b2.Equals(b3);
        boolean result2 = b1.Equals(b2);
        assertEquals(true,result1);
        assertEquals(false,result2);


    }
}
