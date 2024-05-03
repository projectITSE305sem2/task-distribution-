import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnTest {

    @Test
    public void testSuccessfulReturn() {
        Return r = new Return();

        // Provide valid username, password, and book ISBN
        String username = "ali";
        String password = "password1";
        String bookISBN = "12345";

        // Call the returnBook method
        String result = r.returnBook(username, password, bookISBN);

        // Assert that the appropriate success message is returned
        assertEquals("Hi ali, you have successfully logged in.\nThank you for returning the book with ISBN 12345", result);
    }

    @Test
    public void testFailedReturn_InvalidCredentials() {
        Return r = new Return();

        // Provide invalid username or password
        String username = "zahra";
        String password = "password123";
        String bookISBN = "12345";

        // Call the returnBook method
        String result = r.returnBook(username, password, bookISBN);

        // Assert that the appropriate error message is returned
        assertEquals("Invalid username or password. Please try again.", result);
    }

    @Test
    public void testFailedReturn_InvalidISBN() {
        Return r = new Return();

        // Provide valid username, password, and invalid book ISBN
        String username = "ali";
        String password = "password1";
        String bookISBN = "99999";

        // Call the returnBook method
        String result = r.returnBook(username, password, bookISBN);

        // Assert that the appropriate error message is returned
        assertEquals("Invalid book ISBN.", result);
    }


    private void assertEquals(String expected, String actual) {
        assertEquals(expected, actual);
    }
}
