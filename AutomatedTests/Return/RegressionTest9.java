
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test01"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book7.setTitle("");
    book7.setAccessionNum(0L);
    book7.setPublisher("");
    book7.setPublisher("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str16 = book7.toString();
    int i17 = book7.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '0' }"+ "'", str16.equals("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '0' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test02"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str10 = book0.getAuthor2();
    int i11 = book0.getYearPublication();
    book0.setAccessionNum((long)(byte)0);
    java.lang.String str14 = book0.getAuthor2();
    int i15 = book0.getYearPublication();
    java.lang.String str16 = book0.getPublisher();
    book0.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str19 = book0.getPublisher();
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '1' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test03"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor1("hi!");
    Book book11 = new Book();
    java.lang.String str12 = book11.getPublisher();
    book11.setPublisher("hi!");
    java.lang.String str15 = book11.getTitle();
    book11.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b18 = book0.Equals(book11);
    Book book19 = new Book();
    book19.setAuthor1("");
    java.lang.String str22 = book19.getTitle();
    book19.setAuthor1("hi!");
    java.lang.String str25 = book19.getAuthor2();
    book19.setAccessionNum((long)'4');
    book19.setAuthor2("hi!");
    java.lang.String str30 = book19.getTitle();
    book19.setYearPublication(1);
    boolean b33 = book0.Equals(book19);
    book19.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book19.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test04"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }", 100L, 10);
    int i8 = book7.getYearPublication();
    java.lang.String str9 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test05"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    java.lang.String str8 = book0.toString();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str11 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test06"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '97' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str9 = book0.getIsbn();
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test07"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)32, (int)(byte)-1);
    java.lang.String str8 = book7.getAuthor1();
    java.lang.String str9 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str9.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test08"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getTitle();
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book7.setAuthor2("0000000000000");
    book7.setAccessionNum((long)(short)-1);
    book7.setAccessionNum((long)(byte)-1);
    Book book38 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", 1000L, 100);
    boolean b39 = book7.Equals(book38);
    long long40 = book7.getAccessionNum();
    Book book41 = new Book();
    java.lang.String str42 = book41.getPublisher();
    java.lang.String str43 = book41.getIsbn();
    int i44 = book41.getYearPublication();
    java.lang.String str45 = book41.getPublisher();
    java.lang.String str46 = book41.getPublisher();
    book41.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b49 = book7.Equals(book41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long40 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "0000000000000"+ "'", str43.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test09"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '100' }", 97L, 32);
    java.lang.String str8 = book7.getTitle();
    book7.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }"));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test10"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book0.setIsbn("0000000000000");
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '32' }");
    book0.setAccessionNum((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test11"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }");
    java.lang.String str20 = book0.getIsbn();
    java.lang.String str21 = book0.getIsbn();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0000000000000"+ "'", str20.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "0000000000000"+ "'", str21.equals("0000000000000"));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test12"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getTitle();
    book7.setAccessionNum(1000L);
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book27 = new Book();
    book27.setAuthor1("");
    java.lang.String str30 = book27.getTitle();
    java.lang.String str31 = book27.getPublisher();
    java.lang.String str32 = book27.getAuthor2();
    book27.setYearPublication(0);
    java.lang.String str35 = book27.getIsbn();
    book27.setYearPublication(0);
    boolean b38 = book7.Equals(book27);
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "0000000000000"+ "'", str35.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test13"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }", "", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 32L, (int)'#');
    java.lang.String str8 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }"));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test14"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    book7.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '32' }");
    book7.setAccessionNum((long)(byte)-1);
    book7.setYearPublication((int)(short)100);
    book7.setAccessionNum((long)32);
    book7.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test15"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 97L, (int)'#');
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book7.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    long long12 = book7.getAccessionNum();
    book7.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 97L);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test16"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getTitle();
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str25 = book7.getPublisher();
    book7.setAccessionNum((long)100);
    Book book28 = new Book();
    book28.setAuthor1("");
    book28.setAccessionNum((long)'4');
    book28.setAccessionNum((long)(byte)-1);
    java.lang.String str35 = book28.toString();
    boolean b36 = book7.Equals(book28);
    book7.setYearPublication(0);
    Book book39 = new Book();
    book39.setAuthor1("");
    book39.setAccessionNum((long)'4');
    book39.setAuthor2("hi!");
    book39.setAccessionNum((-1L));
    book39.setAuthor1("hi!");
    Book book50 = new Book();
    java.lang.String str51 = book50.getPublisher();
    book50.setPublisher("hi!");
    java.lang.String str54 = book50.getTitle();
    book50.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b57 = book39.Equals(book50);
    boolean b58 = book7.Equals(book39);
    int i59 = book39.getYearPublication();
    java.lang.String str60 = book39.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str35.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "0000000000000"+ "'", str60.equals("0000000000000"));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test17"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor1();
    int i4 = book0.getYearPublication();
    java.lang.String str5 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test18"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str8 = book0.toString();
    Book book16 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", (long)(short)1, (int)'a');
    book16.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b19 = book0.Equals(book16);
    long long20 = book16.getAccessionNum();
    java.lang.String str21 = book16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '1' }"+ "'", str21.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '1' }"));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test19"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("0000000000000");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setYearPublication(97);
    java.lang.String str19 = book0.getTitle();
    java.lang.String str20 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str19.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str20.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test20"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    long long8 = book0.getAccessionNum();
    java.lang.String str9 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test21"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    java.lang.String str12 = book7.getAuthor2();
    java.lang.String str13 = book7.getTitle();
    int i14 = book7.getYearPublication();
    book7.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setYearPublication(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test22"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)0, (int)(short)0);
    java.lang.String str8 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test23"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAuthor2("");
    int i9 = book0.getYearPublication();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    int i12 = book0.getYearPublication();
    java.lang.String str13 = book0.toString();
    java.lang.String str14 = book0.getAuthor1();
    int i15 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str13.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str14.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test24"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    java.lang.String str12 = book7.getAuthor2();
    java.lang.String str13 = book7.getTitle();
    int i14 = book7.getYearPublication();
    book7.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test25"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book15 = new Book();
    book15.setAuthor1("");
    book15.setAccessionNum((long)'4');
    book15.setAuthor2("");
    boolean b22 = book0.Equals(book15);
    book15.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test26"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    java.lang.String str17 = book7.getIsbn();
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    java.lang.String str23 = book18.getAuthor2();
    book18.setYearPublication(0);
    java.lang.String str26 = book18.toString();
    boolean b27 = book7.Equals(book18);
    java.lang.String str28 = book18.getAuthor2();
    java.lang.String str29 = book18.getTitle();
    java.lang.String str30 = book18.getAuthor2();
    java.lang.String str31 = book18.toString();
    java.lang.String str32 = book18.getAuthor2();
    java.lang.String str33 = book18.getTitle();
    int i34 = book18.getYearPublication();
    java.lang.String str35 = book18.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000000000000"+ "'", str17.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str26.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str31.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test27"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", (long)(short)0, (int)(byte)100);
    java.lang.String str8 = book7.getTitle();
    java.lang.String str9 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '0' }"+ "'", str9.equals("\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '0' }"));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test28"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getTitle();
    book7.setAccessionNum(1000L);
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str29 = book7.toString();
    java.lang.String str30 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str29.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str30.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test29"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAuthor2("");
    int i9 = book0.getYearPublication();
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test30"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", (long)(byte)-1, (int)'#');
    Book book15 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '32' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", 35L, (-1));
    boolean b16 = book7.Equals(book15);
    java.lang.String str17 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str17.equals("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test31"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "", (long)'#', (int)(byte)1);
    java.lang.String str8 = book7.getIsbn();
    java.lang.String str9 = book7.getIsbn();
    book7.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }");
    Book book12 = new Book();
    book12.setAuthor1("");
    book12.setAccessionNum((long)'4');
    book12.setAuthor2("hi!");
    Book book19 = new Book();
    book19.setAuthor1("");
    book19.setAccessionNum((long)'4');
    book19.setAuthor2("hi!");
    book19.setAccessionNum((-1L));
    boolean b28 = book12.Equals(book19);
    book12.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str31 = book12.getPublisher();
    book12.setAccessionNum((-1L));
    boolean b34 = book7.Equals(book12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test32"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAuthor2("");
    int i9 = book0.getYearPublication();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    int i12 = book0.getYearPublication();
    java.lang.String str13 = book0.getIsbn();
    book0.setAccessionNum((long)(short)10);
    book0.setAccessionNum((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000000000000"+ "'", str13.equals("0000000000000"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test33"); }

    Book book7 = new Book("", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)' ', (int)(short)10);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test34"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str7 = book0.getAuthor2();
    book0.setYearPublication(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str7.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test35"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    java.lang.String str12 = book7.toString();
    java.lang.String str13 = book7.toString();
    java.lang.String str14 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str12.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str13.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test36"); }

    Book book7 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    java.lang.String str8 = book7.toString();
    Book book16 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str17 = book16.getIsbn();
    boolean b18 = book7.Equals(book16);
    java.lang.String str19 = book16.getAuthor1();
    java.lang.String str20 = book16.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test37"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    book7.setYearPublication((int)'#');
    book7.setAccessionNum((long)100);
    Book book19 = new Book();
    book19.setAuthor1("");
    java.lang.String str22 = book19.getTitle();
    java.lang.String str23 = book19.getPublisher();
    java.lang.String str24 = book19.getAuthor2();
    book19.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book19.setPublisher("0000000000000");
    int i29 = book19.getYearPublication();
    java.lang.String str30 = book19.toString();
    java.lang.String str31 = book19.toString();
    boolean b32 = book7.Equals(book19);
    book19.setYearPublication(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str30.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str31.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test38"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.toString();
    Book book13 = new Book();
    book13.setAuthor1("");
    book13.setAccessionNum((long)'4');
    book13.setAuthor2("hi!");
    book13.setAccessionNum((-1L));
    book13.setAuthor2("0000000000000");
    book13.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book13.setAuthor1("0000000000000");
    Book book28 = new Book();
    int i29 = book28.getYearPublication();
    java.lang.String str30 = book28.getAuthor2();
    java.lang.String str31 = book28.getPublisher();
    book28.setYearPublication((int)'a');
    int i34 = book28.getYearPublication();
    boolean b35 = book13.Equals(book28);
    book13.setAccessionNum((-1L));
    boolean b38 = book0.Equals(book13);
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str12.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test39"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str9 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test40"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", 1L, (int)(short)1);
    book7.setAccessionNum((long)(short)0);
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str12 = book7.toString();
    java.lang.String str13 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '0' }"+ "'", str12.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '0' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str13.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test41"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(byte)100, (int)(byte)100);
    java.lang.String str8 = book7.getAuthor2();
    long long9 = book7.getAccessionNum();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 100L);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test42"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    java.lang.String str3 = book0.getAuthor1();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.toString();
    book0.setAccessionNum((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test43"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    int i7 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test44"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '10' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '32' }", (long)'4', (int)(short)10);
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    Book book17 = new Book();
    book17.setAuthor1("");
    book17.setAccessionNum((long)'4');
    book17.setAuthor2("hi!");
    book17.setAccessionNum((-1L));
    boolean b26 = book10.Equals(book17);
    Book book27 = new Book();
    book27.setAuthor1("");
    java.lang.String str30 = book27.getTitle();
    java.lang.String str31 = book27.getPublisher();
    java.lang.String str32 = book27.getAuthor2();
    book27.setYearPublication(0);
    java.lang.String str35 = book27.getIsbn();
    book27.setYearPublication(0);
    boolean b38 = book17.Equals(book27);
    long long39 = book27.getAccessionNum();
    boolean b40 = book7.Equals(book27);
    java.lang.String str41 = book7.getTitle();
    book7.setPublisher("\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '32' }");
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '32' }");
    book7.setAccessionNum((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "0000000000000"+ "'", str35.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long39 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str41.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test45"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getIsbn();
    book0.setAccessionNum((long)'a');
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }");
    long long19 = book0.getAccessionNum();
    book0.setYearPublication((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 97L);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test46"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    int i9 = book0.getYearPublication();
    Book book10 = new Book();
    java.lang.String str11 = book10.getAuthor2();
    java.lang.String str12 = book10.getTitle();
    java.lang.String str13 = book10.getAuthor1();
    boolean b14 = book0.Equals(book10);
    book10.setTitle("\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }");
    book10.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test47"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getIsbn();
    book9.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book9.setTitle("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str20 = book9.getAuthor2();
    book9.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }");
    book9.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str25 = book9.getTitle();
    book9.setAuthor1("\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '' \nYear Of Publication = '35' \nISBN = 'null' \nAccession Number = '97' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0000000000000"+ "'", str15.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"+ "'", str25.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"));

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test48"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("0000000000000");
    book0.setPublisher("hi!");
    book0.setYearPublication(97);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test49"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    book0.setAccessionNum(32L);
    java.lang.String str5 = book0.getAuthor2();
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str8 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '32' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '32' }"));

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test50"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setYearPublication(100);
    java.lang.String str20 = book0.getAuthor2();
    Book book21 = new Book();
    book21.setAuthor1("");
    java.lang.String str24 = book21.getTitle();
    java.lang.String str25 = book21.getPublisher();
    java.lang.String str26 = book21.getAuthor2();
    java.lang.String str27 = book21.getAuthor1();
    book21.setTitle("hi!");
    book21.setAuthor2("hi!");
    book21.setAuthor1("0000000000000");
    book21.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book21.setAccessionNum((-1L));
    book21.setAccessionNum((-1L));
    book21.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    boolean b42 = book0.Equals(book21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str20.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test51"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("0000000000000");
    Book book15 = new Book();
    int i16 = book15.getYearPublication();
    java.lang.String str17 = book15.getAuthor2();
    java.lang.String str18 = book15.getPublisher();
    book15.setYearPublication((int)'a');
    int i21 = book15.getYearPublication();
    boolean b22 = book0.Equals(book15);
    book15.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str25 = book15.getAuthor2();
    java.lang.String str26 = book15.getTitle();
    book15.setAccessionNum((long)(byte)1);
    java.lang.String str29 = book15.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str26.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0000000000000"+ "'", str29.equals("0000000000000"));

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test52"); }

    Book book7 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    java.lang.String str8 = book7.toString();
    Book book16 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str17 = book16.getIsbn();
    boolean b18 = book7.Equals(book16);
    book7.setAccessionNum((long)100);
    java.lang.String str21 = book7.getTitle();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setAccessionNum(1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test53"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    java.lang.String str17 = book7.getIsbn();
    java.lang.String str18 = book7.getAuthor1();
    Book book26 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 32L, (int)'a');
    boolean b27 = book7.Equals(book26);
    Book book35 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", (long)(byte)-1, (int)'#');
    Book book36 = new Book();
    book36.setAuthor1("");
    book36.setAccessionNum((long)'4');
    java.lang.String str41 = book36.getPublisher();
    java.lang.String str42 = book36.toString();
    java.lang.String str43 = book36.getTitle();
    boolean b44 = book35.Equals(book36);
    int i45 = book35.getYearPublication();
    book35.setTitle("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    java.lang.String str48 = book35.getTitle();
    boolean b49 = book7.Equals(book35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000000000000"+ "'", str17.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str42.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"+ "'", str48.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test54"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str13 = book0.getAuthor2();
    java.lang.String str14 = book0.toString();
    java.lang.String str15 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str14.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0000000000000"+ "'", str15.equals("0000000000000"));

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test55"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)97, (-1));
    java.lang.String str8 = book7.toString();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }");
    book7.setPublisher("");
    java.lang.String str13 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '97' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '97' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test56"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    long long9 = book7.getAccessionNum();
    Book book10 = new Book();
    book10.setAuthor1("");
    Book book13 = new Book();
    int i14 = book13.getYearPublication();
    java.lang.String str15 = book13.getAuthor2();
    boolean b16 = book10.Equals(book13);
    java.lang.String str17 = book10.getIsbn();
    long long18 = book10.getAccessionNum();
    boolean b19 = book7.Equals(book10);
    java.lang.String str20 = book7.getAuthor1();
    java.lang.String str21 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000000000000"+ "'", str17.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test57"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    long long17 = book7.getAccessionNum();
    java.lang.String str18 = book7.toString();
    java.lang.String str19 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str18.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str19.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test58"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str18 = book0.getTitle();
    java.lang.String str19 = book0.getAuthor2();
    java.lang.String str20 = book0.getAuthor1();
    java.lang.String str21 = book0.getIsbn();
    java.lang.String str22 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str19.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "0000000000000"+ "'", str21.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "0000000000000"+ "'", str22.equals("0000000000000"));

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test59"); }

    Book book7 = new Book("hi!", "hi!", "", "", "hi!", (long)(byte)100, (int)(short)1);
    Book book8 = new Book();
    book8.setAuthor1("");
    java.lang.String str11 = book8.getTitle();
    java.lang.String str12 = book8.getPublisher();
    boolean b13 = book7.Equals(book8);
    java.lang.String str14 = book7.getPublisher();
    java.lang.String str15 = book7.toString();
    int i16 = book7.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }"+ "'", str15.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test60"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getIsbn();
    book0.setYearPublication((int)(short)-1);
    java.lang.String str5 = book0.getAuthor1();
    java.lang.String str6 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000000000000"+ "'", str2.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str6.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test61"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", 1000L, 1);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test62"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getPublisher();
    book0.setYearPublication((int)(short)0);
    java.lang.String str8 = book0.getIsbn();
    book0.setYearPublication((int)(byte)0);
    book0.setYearPublication(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test63"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '0000000000000' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '1' }", (long)(short)100, 35);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test64"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setYearPublication(0);
    book0.setAccessionNum((long)' ');
    java.lang.String str10 = book0.getIsbn();
    java.lang.String str11 = book0.getPublisher();
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000000000000"+ "'", str10.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test65"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(short)10, 100);
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '52' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test66"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(byte)100, (int)(byte)100);
    Book book8 = new Book();
    book8.setAuthor1("");
    book8.setAccessionNum((long)'4');
    book8.setAuthor2("hi!");
    Book book15 = new Book();
    book15.setAuthor1("");
    book15.setAccessionNum((long)'4');
    book15.setAuthor2("hi!");
    book15.setAccessionNum((-1L));
    boolean b24 = book8.Equals(book15);
    java.lang.String str25 = book15.getPublisher();
    java.lang.String str26 = book15.toString();
    java.lang.String str27 = book15.toString();
    book15.setYearPublication((int)' ');
    book15.setPublisher("");
    book15.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    boolean b34 = book7.Equals(book15);
    int i35 = book7.getYearPublication();
    java.lang.String str36 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str26.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str27.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str36.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test67"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getPublisher();
    java.lang.String str23 = book7.getIsbn();
    java.lang.String str24 = book7.getAuthor1();
    book7.setAccessionNum((long)(short)10);
    java.lang.String str27 = book7.getPublisher();
    java.lang.String str28 = book7.toString();
    Book book36 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", 100L, 1);
    Book book44 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 97L, (int)(byte)1);
    boolean b45 = book36.Equals(book44);
    boolean b46 = book7.Equals(book36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "0000000000000"+ "'", str23.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '10' }"+ "'", str28.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '10' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test68"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getTitle();
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book7.setAuthor2("0000000000000");
    java.lang.String str27 = book7.getAuthor1();
    java.lang.String str28 = book7.getTitle();
    book7.setAccessionNum((long)10);
    java.lang.String str31 = book7.getIsbn();
    book7.setAccessionNum(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str28.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "0000000000000"+ "'", str31.equals("0000000000000"));

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test69"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getIsbn();
    java.lang.String str13 = book0.toString();
    java.lang.String str14 = book0.getTitle();
    java.lang.String str15 = book0.toString();
    java.lang.String str16 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str13.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str15.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str16.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test70"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getIsbn();
    book9.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str18 = book9.getPublisher();
    java.lang.String str19 = book9.getAuthor1();
    Book book20 = new Book();
    book20.setAuthor1("");
    java.lang.String str23 = book20.getTitle();
    java.lang.String str24 = book20.getPublisher();
    java.lang.String str25 = book20.getAuthor2();
    java.lang.String str26 = book20.getAuthor1();
    book20.setTitle("hi!");
    book20.setAuthor2("hi!");
    book20.setAuthor1("0000000000000");
    book20.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str35 = book20.getAuthor2();
    Book book43 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    boolean b44 = book20.Equals(book43);
    java.lang.String str45 = book20.getAuthor1();
    book20.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str48 = book20.getPublisher();
    java.lang.String str49 = book20.getAuthor2();
    book20.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    boolean b52 = book9.Equals(book20);
    java.lang.String str53 = book20.toString();
    book20.setAuthor2("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0000000000000"+ "'", str15.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str19.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "0000000000000"+ "'", str45.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str48.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str49.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str53.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test71"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    java.lang.String str8 = book7.getTitle();
    book7.setAuthor2("");
    java.lang.String str11 = book7.getAuthor1();
    book7.setAuthor2("\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test72"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getTitle();
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book7.setAuthor2("0000000000000");
    book7.setAccessionNum((long)(short)-1);
    java.lang.String str29 = book7.toString();
    java.lang.String str30 = book7.toString();
    java.lang.String str31 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str29.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str30.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test73"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)100, 52);
    Book book8 = null;
    boolean b9 = book7.Equals(book8);
    book7.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test74"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)100, (int)'4');
    book7.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str10 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test75"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    int i9 = book0.getYearPublication();
    Book book10 = new Book();
    java.lang.String str11 = book10.getAuthor2();
    java.lang.String str12 = book10.getTitle();
    java.lang.String str13 = book10.getAuthor1();
    boolean b14 = book0.Equals(book10);
    book10.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test76"); }

    Book book0 = new Book();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long3 = book0.getAccessionNum();
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    java.lang.String str6 = book0.getIsbn();
    book0.setAuthor2("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000000000000"+ "'", str6.equals("0000000000000"));

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test77"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "", (long)'#', (int)(byte)1);
    java.lang.String str8 = book7.getPublisher();
    java.lang.String str9 = book7.getAuthor2();
    java.lang.String str10 = book7.getIsbn();
    book7.setYearPublication((int)(byte)1);
    java.lang.String str13 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str9.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '35' }"+ "'", str13.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '35' }"));

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test78"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.toString();
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAccessionNum((long)(short)100);
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str14 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str7.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str14.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test79"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", 1L, (int)(short)1);
    book7.setAccessionNum((long)(short)0);
    java.lang.String str10 = book7.toString();
    book7.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }");
    java.lang.String str13 = book7.getAuthor2();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '0' }"+ "'", str10.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '0' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str13.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test80"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)0, 1);
    java.lang.String str8 = book7.getTitle();
    book7.setAccessionNum((long)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"));

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test81"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    book0.setYearPublication((int)(byte)-1);
    Book book8 = new Book();
    book8.setAuthor1("");
    java.lang.String str11 = book8.getTitle();
    java.lang.String str12 = book8.getPublisher();
    java.lang.String str13 = book8.getAuthor2();
    book8.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book8.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book8.setPublisher("hi!");
    book8.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book8.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    boolean b24 = book0.Equals(book8);
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test82"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("0000000000000");
    Book book15 = new Book();
    int i16 = book15.getYearPublication();
    java.lang.String str17 = book15.getAuthor2();
    java.lang.String str18 = book15.getPublisher();
    book15.setYearPublication((int)'a');
    int i21 = book15.getYearPublication();
    boolean b22 = book0.Equals(book15);
    book0.setAccessionNum((-1L));
    java.lang.String str25 = book0.getPublisher();
    book0.setAccessionNum((long)' ');
    java.lang.String str28 = book0.getPublisher();
    java.lang.String str29 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '32' }"+ "'", str29.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '32' }"));

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test83"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }");
    int i9 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test84"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book7.setTitle("");
    long long19 = book7.getAccessionNum();
    book7.setYearPublication((int)(byte)10);
    java.lang.String str22 = book7.getTitle();
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str25 = book7.getPublisher();
    book7.setAccessionNum((long)100);
    Book book28 = new Book();
    book28.setAuthor1("");
    book28.setAccessionNum((long)'4');
    book28.setAccessionNum((long)(byte)-1);
    java.lang.String str35 = book28.toString();
    boolean b36 = book7.Equals(book28);
    int i37 = book28.getYearPublication();
    book28.setAccessionNum((-1L));
    book28.setYearPublication((int)(byte)1);
    book28.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str35.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test85"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAuthor1("0000000000000");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book14 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 97L, (int)(byte)1);
    book14.setAuthor2("\n\nBook { Title = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '0' }");
    boolean b17 = book0.Equals(book14);
    Book book18 = new Book();
    java.lang.String str19 = book18.getAuthor2();
    java.lang.String str20 = book18.getTitle();
    java.lang.String str21 = book18.getAuthor1();
    java.lang.String str22 = book18.getAuthor1();
    book18.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '0000000000000' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '-1' }");
    boolean b25 = book0.Equals(book18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test86"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setYearPublication(97);
    int i10 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test87"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    java.lang.String str8 = book7.toString();
    java.lang.String str9 = book7.getIsbn();
    long long10 = book7.getAccessionNum();
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str15 = book7.getPublisher();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str15.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test88"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor1("hi!");
    java.lang.String str11 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str16 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str16.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test89"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    long long8 = book0.getAccessionNum();
    long long9 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1000L);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test90"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("0000000000000");
    java.lang.String str11 = book0.toString();
    java.lang.String str12 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test91"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    Book book22 = new Book();
    book22.setAuthor1("");
    book22.setAccessionNum((long)'4');
    book22.setAuthor2("hi!");
    book22.setAccessionNum((-1L));
    book22.setAuthor1("hi!");
    java.lang.String str33 = book22.toString();
    java.lang.String str34 = book22.getAuthor2();
    boolean b35 = book7.Equals(book22);
    book22.setPublisher("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book22.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str40 = book22.getIsbn();
    book22.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }");
    book22.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str33.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "0000000000000"+ "'", str40.equals("0000000000000"));

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test92"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.toString();
    java.lang.String str15 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '100' }");
    java.lang.String str18 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str14.equals("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str15.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str18.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test93"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor1("hi!");
    Book book11 = new Book();
    java.lang.String str12 = book11.getPublisher();
    book11.setPublisher("hi!");
    java.lang.String str15 = book11.getTitle();
    book11.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b18 = book0.Equals(book11);
    book11.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i21 = book11.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test94"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '97' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }", (long)(byte)10, 97);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test95"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    Book book7 = new Book();
    book7.setAuthor1("");
    book7.setAccessionNum((long)'4');
    book7.setAuthor2("hi!");
    book7.setAccessionNum((-1L));
    boolean b16 = book0.Equals(book7);
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str19 = book0.getAuthor2();
    java.lang.String str20 = book0.getTitle();
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'hi!' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test96"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '32' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (-1L), 10);
    java.lang.String str8 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '32' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '32' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '-1' }"));

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test97"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '32' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '35' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }", (long)(-1), 97);
    book7.setAuthor2("\n\nBook { Title = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '100' }");

  }

  @Test
  public void test98() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test98"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    java.lang.String str3 = book0.getAuthor1();
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test99() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test99"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication(100);
    java.lang.String str7 = book0.getPublisher();
    java.lang.String str8 = book0.getPublisher();
    java.lang.String str9 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

}
