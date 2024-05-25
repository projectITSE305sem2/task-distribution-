
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

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
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i27 = book0.getYearPublication();
    
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
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAuthor1("0000000000000");
    java.lang.String str5 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.toString();
    book0.setAccessionNum((long)'#');
    book0.setTitle("0000000000000");
    java.lang.String str9 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str4.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    java.lang.String str12 = book7.getAuthor2();
    java.lang.String str13 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    book0.setTitle("hi!");
    long long10 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1000L);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i6 = book0.getYearPublication();
    book0.setYearPublication((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

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
    java.lang.String str20 = book7.getTitle();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

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
    int i23 = book15.getYearPublication();
    java.lang.String str24 = book15.toString();
    java.lang.String str25 = book15.getAuthor1();
    
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
    org.junit.Assert.assertTrue(i23 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str24.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

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
    java.lang.String str17 = book7.toString();
    java.lang.String str18 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str17.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)'#', (int)(byte)10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "hi!", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)'4', (int)(short)-1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.toString();
    book0.setAuthor1("");
    book0.setTitle("0000000000000");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    book0.setAuthor2("");
    long long9 = book0.getAccessionNum();
    java.lang.String str10 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    java.lang.String str8 = book0.getTitle();
    java.lang.String str9 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)1, 10);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    book0.setAuthor1("hi!");
    book0.setYearPublication(0);
    book0.setYearPublication((int)(short)-1);
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
    java.lang.String str27 = book17.getPublisher();
    Book book28 = new Book();
    book28.setAuthor1("");
    java.lang.String str31 = book28.getTitle();
    java.lang.String str32 = book28.getPublisher();
    java.lang.String str33 = book28.getAuthor2();
    java.lang.String str34 = book28.getAuthor1();
    book28.setTitle("hi!");
    java.lang.String str37 = book28.getTitle();
    boolean b38 = book17.Equals(book28);
    book17.setYearPublication((int)'#');
    boolean b41 = book0.Equals(book17);
    book17.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    java.lang.String str12 = book7.getAuthor2();
    book7.setAccessionNum((long)1);
    book7.setPublisher("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

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
    java.lang.String str23 = book15.toString();
    java.lang.String str24 = book15.getPublisher();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str23.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

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
    java.lang.String str20 = book7.getTitle();
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.toString();
    book0.setAccessionNum((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str4.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    java.lang.String str8 = book0.getTitle();
    java.lang.String str9 = book0.getAuthor1();
    book0.setAuthor2("0000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    book0.setAuthor2("");
    long long9 = book0.getAccessionNum();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str12 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getPublisher();
    java.lang.String str6 = book0.getPublisher();
    java.lang.String str7 = book0.getTitle();
    book0.setAccessionNum(52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book11 = new Book();
    book11.setAuthor1("");
    book11.setAccessionNum((long)'4');
    book11.setAccessionNum((long)(byte)-1);
    java.lang.String str18 = book11.toString();
    book11.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book11.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    boolean b23 = book0.Equals(book11);
    int i24 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str18.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 100);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    java.lang.String str7 = book0.getIsbn();
    long long8 = book0.getAccessionNum();
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1000L);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAuthor2("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str8 = book0.getAuthor1();
    book0.setYearPublication((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getTitle();
    book0.setAccessionNum((long)(byte)-1);
    java.lang.String str8 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    java.lang.String str7 = book0.getTitle();
    book0.setAccessionNum(0L);
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAccessionNum((long)(byte)-1);
    java.lang.String str7 = book0.toString();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str7.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    book7.setTitle("");
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(short)10);
    book3.setAccessionNum(10L);
    java.lang.String str11 = book3.getAuthor2();
    book3.setYearPublication((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.toString();
    long long6 = book0.getAccessionNum();
    java.lang.String str7 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str7.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    java.lang.String str22 = book7.getAuthor1();
    book7.setYearPublication((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(byte)10);
    book3.setYearPublication((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAccessionNum((long)(byte)-1);
    java.lang.String str7 = book0.toString();
    book0.setTitle("");
    book0.setAccessionNum(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str7.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.getIsbn();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    book0.setIsbn("");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i16 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    java.lang.String str8 = book7.getTitle();
    Book book9 = new Book();
    java.lang.String str10 = book9.getAuthor2();
    book9.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    boolean b13 = book7.Equals(book9);
    java.lang.String str14 = book9.toString();
    book9.setYearPublication((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str14.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    book0.setAuthor2("");
    long long9 = book0.getAccessionNum();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1000L);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str10 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000000000000"+ "'", str10.equals("0000000000000"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

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
    java.lang.String str26 = book15.getAuthor1();
    int i27 = book15.getYearPublication();
    book15.setPublisher("hi!");
    
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
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 97);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    book0.setIsbn("");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", 0L, (int)'4');

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getPublisher();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

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
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str18 = book0.toString();
    book0.setYearPublication((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str18.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getTitle();
    book0.setAccessionNum((long)(byte)-1);
    long long8 = book0.getAccessionNum();
    int i9 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getTitle();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str7 = book0.getIsbn();
    java.lang.String str8 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    java.lang.String str7 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    java.lang.String str13 = book10.getTitle();
    java.lang.String str14 = book10.getPublisher();
    java.lang.String str15 = book10.getAuthor2();
    boolean b16 = book7.Equals(book10);
    int i17 = book7.getYearPublication();
    book7.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    Book book6 = new Book();
    book6.setAuthor1("");
    Book book9 = new Book();
    int i10 = book9.getYearPublication();
    java.lang.String str11 = book9.getAuthor2();
    boolean b12 = book6.Equals(book9);
    book9.setAccessionNum((long)(byte)10);
    boolean b15 = book0.Equals(book9);
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str18 = book0.toString();
    java.lang.String str19 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str18.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str19.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setAuthor1("");
    java.lang.String str10 = book0.getIsbn();
    java.lang.String str11 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000000000000"+ "'", str10.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("0000000000000");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", (long)(byte)-1, (int)(short)-1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor1("hi!");
    java.lang.String str11 = book0.toString();
    long long12 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == (-1L));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book7 = new Book();
    book7.setAuthor1("");
    Book book10 = new Book();
    int i11 = book10.getYearPublication();
    java.lang.String str12 = book10.getAuthor2();
    boolean b13 = book7.Equals(book10);
    book10.setAccessionNum((long)(short)10);
    boolean b16 = book0.Equals(book10);
    book10.setAccessionNum((long)'#');
    java.lang.String str19 = book10.getAuthor2();
    long long20 = book10.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 35L);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    long long7 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1000L);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }", (-1L), 100);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

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
    java.lang.String str17 = book7.getPublisher();
    java.lang.String str18 = book7.getTitle();
    java.lang.String str19 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("");
    java.lang.String str10 = book0.getAuthor2();
    book0.setAccessionNum((long)(byte)0);
    java.lang.String str13 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"+ "'", str13.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAuthor2("");
    long long9 = book0.getAccessionNum();
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str12 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

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
    java.lang.String str15 = book0.getAuthor2();
    Book book23 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    boolean b24 = book0.Equals(book23);
    java.lang.String str25 = book0.getAuthor1();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str28 = book0.getPublisher();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0000000000000"+ "'", str25.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str28.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)100, (int)(byte)10);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("");
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str9 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str12 = book0.getTitle();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str12.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)0, 1);
    long long8 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", (long)(short)1, (int)'a');
    java.lang.String str8 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "hi!", (long)(-1), 1);
    book7.setYearPublication((int)(short)0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    java.lang.String str15 = book0.getPublisher();
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i11 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    long long12 = book0.getAccessionNum();
    java.lang.String str13 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

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
    java.lang.String str17 = book7.getPublisher();
    java.lang.String str18 = book7.toString();
    java.lang.String str19 = book7.toString();
    java.lang.String str20 = book7.getAuthor1();
    book7.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str18.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str19.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

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
    java.lang.String str39 = book0.getPublisher();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", 52L, 10);
    java.lang.String str8 = book7.getIsbn();
    java.lang.String str9 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    java.lang.String str22 = book7.getAuthor1();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setTitle("");
    int i7 = book0.getYearPublication();
    book0.setYearPublication((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

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
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    Book book25 = new Book();
    book25.setAuthor1("");
    book25.setAccessionNum((long)'4');
    book25.setAuthor2("hi!");
    Book book32 = new Book();
    book32.setAuthor1("");
    book32.setAccessionNum((long)'4');
    book32.setAuthor2("hi!");
    book32.setAccessionNum((-1L));
    boolean b41 = book25.Equals(book32);
    book32.setTitle("");
    long long44 = book32.getAccessionNum();
    book32.setYearPublication((int)(byte)10);
    java.lang.String str47 = book32.getTitle();
    book32.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book32.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b52 = book0.Equals(book32);
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
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
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

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
    book0.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }");
    
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
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    int i5 = book0.getYearPublication();
    book0.setYearPublication(100);
    java.lang.String str8 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setTitle("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 97L, (int)(short)100);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    int i25 = book7.getYearPublication();
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str30 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i4 = book0.getYearPublication();
    long long5 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1000L);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

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
    java.lang.String str17 = book7.getPublisher();
    long long18 = book7.getAccessionNum();
    long long19 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

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
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    
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

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

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
    java.lang.String str17 = book7.getPublisher();
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    java.lang.String str23 = book18.getAuthor2();
    java.lang.String str24 = book18.getAuthor1();
    book18.setTitle("hi!");
    java.lang.String str27 = book18.getTitle();
    boolean b28 = book7.Equals(book18);
    java.lang.String str29 = book7.getPublisher();
    long long30 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == (-1L));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    java.lang.String str11 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

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
    long long28 = book7.getAccessionNum();
    
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
    org.junit.Assert.assertTrue(long28 == 10L);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book10 = new Book();
    book10.setAuthor1("");
    java.lang.String str13 = book10.getTitle();
    java.lang.String str14 = book10.getPublisher();
    java.lang.String str15 = book10.getAuthor2();
    book10.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book10.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book10.setPublisher("hi!");
    book10.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book10.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    book10.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }");
    boolean b28 = book0.Equals(book10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)100, (int)'a');

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    int i2 = book0.getYearPublication();
    book0.setPublisher("0000000000000");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAccessionNum((long)'a');
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

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
    book0.setAccessionNum((-1L));
    book0.setAccessionNum((-1L));
    java.lang.String str19 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str19.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    Book book0 = new Book();
    book0.setAccessionNum(0L);
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    long long12 = book0.getAccessionNum();
    long long13 = book0.getAccessionNum();
    java.lang.String str14 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0000000000000"+ "'", str14.equals("0000000000000"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    book7.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    java.lang.String str25 = book7.toString();
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }"+ "'", str25.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAccessionNum((long)(byte)-1);
    java.lang.String str7 = book0.toString();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str10 = book0.toString();
    book0.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str7.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("0000000000000");
    int i10 = book0.getYearPublication();
    book0.setYearPublication((int)(short)10);
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    java.lang.String str8 = book7.getTitle();
    book7.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)1, (-1));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(short)10);
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    int i25 = book7.getYearPublication();
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str28 = book7.getPublisher();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    Book book7 = new Book("", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", 0L, (int)'4');
    java.lang.String str8 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    java.lang.String str4 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str4.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getIsbn();
    book9.setYearPublication((int)'#');
    java.lang.String str18 = book9.getPublisher();
    
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

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str17 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    java.lang.String str12 = book7.getAuthor2();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long15 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 1L);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    long long5 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1000L);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

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
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str25 = book7.getTitle();
    java.lang.String str26 = book7.getAuthor2();
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setAccessionNum((long)'a');
    java.lang.String str31 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str10 = book0.getAuthor2();
    int i11 = book0.getYearPublication();
    Book book19 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    boolean b20 = book0.Equals(book19);
    book0.setAccessionNum((long)(byte)1);
    java.lang.String str23 = book0.getAuthor1();
    
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
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

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
    java.lang.String str17 = book7.getPublisher();
    java.lang.String str18 = book7.getTitle();
    java.lang.String str19 = book7.getTitle();
    java.lang.String str20 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    Book book0 = new Book();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long3 = book0.getAccessionNum();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 1000L);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    book0.setAccessionNum((long)(byte)-1);
    book0.setYearPublication(0);
    java.lang.String str11 = book0.getTitle();
    java.lang.String str12 = book0.toString();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str12.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setYearPublication((int)(short)0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

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
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str25 = book7.getTitle();
    int i26 = book7.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 10);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getPublisher();
    book0.setYearPublication((int)(short)0);
    java.lang.String str8 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    java.lang.String str6 = book0.toString();
    java.lang.String str7 = book0.getTitle();
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    long long10 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str6.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 52L);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)97, 0);
    long long8 = book7.getAccessionNum();
    book7.setAccessionNum((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 97L);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

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
    java.lang.String str28 = book7.getIsbn();
    java.lang.String str29 = book7.toString();
    book7.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    java.lang.String str32 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0000000000000"+ "'", str28.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str29.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor1();
    java.lang.String str6 = book0.getAuthor1();
    java.lang.String str7 = book0.getIsbn();
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }");
    java.lang.String str10 = book0.toString();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '32' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

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
    java.lang.String str16 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

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
    java.lang.String str15 = book0.getAuthor2();
    Book book23 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    boolean b24 = book0.Equals(book23);
    java.lang.String str25 = book0.getAuthor1();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str28 = book0.getPublisher();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str31 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0000000000000"+ "'", str25.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str28.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "0000000000000"+ "'", str31.equals("0000000000000"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

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
    java.lang.String str14 = book0.getAuthor1();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0000000000000"+ "'", str14.equals("0000000000000"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

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
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str27 = book0.getTitle();
    long long28 = book0.getAccessionNum();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str27.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == (-1L));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor1();
    java.lang.String str6 = book0.getAuthor1();
    book0.setAccessionNum((long)(short)100);
    int i9 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.getAuthor2();
    int i12 = book0.getYearPublication();
    book0.setAccessionNum(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

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
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str20 = book7.toString();
    java.lang.String str21 = book7.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str20.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str21.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    int i25 = book7.getYearPublication();
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str28 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.getTitle();
    book0.setAccessionNum((long)(byte)-1);
    long long8 = book0.getAccessionNum();
    long long9 = book0.getAccessionNum();
    book0.setAccessionNum((long)(byte)1);
    java.lang.String str12 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setYearPublication(0);
    java.lang.String str8 = book0.getIsbn();
    book0.setYearPublication(0);
    book0.setIsbn("hi!");
    
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    int i25 = book7.getYearPublication();
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long30 = book7.getAccessionNum();
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long30 == 52L);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

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
    java.lang.String str39 = book0.getIsbn();
    book0.setIsbn("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "0000000000000"+ "'", str39.equals("0000000000000"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    java.lang.String str3 = book0.getAuthor1();
    java.lang.String str4 = book0.getIsbn();
    book0.setAccessionNum((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000000000000"+ "'", str4.equals("0000000000000"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor1("hi!");
    java.lang.String str11 = book0.toString();
    java.lang.String str12 = book0.getIsbn();
    int i13 = book0.getYearPublication();
    java.lang.String str14 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

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
    int i15 = book0.getYearPublication();
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getIsbn();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setIsbn("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000000000000"+ "'", str6.equals("0000000000000"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAccessionNum((long)(short)1);
    book0.setAuthor2("");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

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
    Book book26 = new Book();
    java.lang.String str27 = book26.getAuthor2();
    book26.setTitle("");
    java.lang.String str30 = book26.toString();
    book26.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    long long33 = book26.getAccessionNum();
    book26.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    boolean b36 = book7.Equals(book26);
    java.lang.String str37 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str30.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    Book book7 = new Book("", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }", (long)'a', 0);
    book7.setAccessionNum((long)(byte)1);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

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
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }");
    java.lang.String str21 = book0.getAuthor1();
    book0.setAccessionNum((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str21.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

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
    book7.setTitle("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getTitle();
    java.lang.String str5 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    long long5 = book0.getAccessionNum();
    long long6 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1000L);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    java.lang.String str3 = book0.getAuthor1();
    book0.setPublisher("");
    long long6 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1000L);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(byte)100, (int)(byte)100);
    java.lang.String str8 = book7.getAuthor2();
    java.lang.String str9 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str9.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    long long12 = book0.getAccessionNum();
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 52L);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    Book book7 = new Book("", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)100, (int)(short)1);
    book7.setIsbn("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    java.lang.String str8 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book7 = new Book();
    book7.setAuthor1("");
    Book book10 = new Book();
    int i11 = book10.getYearPublication();
    java.lang.String str12 = book10.getAuthor2();
    boolean b13 = book7.Equals(book10);
    book10.setAccessionNum((long)(short)10);
    boolean b16 = book0.Equals(book10);
    book10.setAccessionNum((long)'#');
    java.lang.String str19 = book10.getIsbn();
    book10.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0000000000000"+ "'", str19.equals("0000000000000"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("0000000000000");
    book0.setTitle("hi!");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long19 = book0.getAccessionNum();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", 52L, 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setYearPublication((int)(byte)10);
    java.lang.String str9 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "hi!", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(short)0, (int)(byte)1);
    java.lang.String str8 = book7.getPublisher();
    java.lang.String str9 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str9.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getAuthor2();
    java.lang.String str13 = book0.toString();
    book0.setYearPublication((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str13.equals("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    Book book7 = new Book("\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 32L, (int)(byte)10);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

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
    java.lang.String str28 = book18.getAuthor1();
    book18.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    long long12 = book0.getAccessionNum();
    java.lang.String str13 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }");
    java.lang.String str16 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000000000000"+ "'", str13.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", 1000L, 100);
    book7.setTitle("\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }");
    book7.setAccessionNum((-1L));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor1();
    java.lang.String str5 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    int i12 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

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
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str27 = book0.getTitle();
    java.lang.String str28 = book0.getAuthor2();
    java.lang.String str29 = book0.getPublisher();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str27.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0000000000000"+ "'", str28.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.toString();
    book0.setAuthor1("");
    java.lang.String str8 = book0.getTitle();
    book0.setAuthor2("");
    Book book11 = new Book();
    book11.setAuthor1("");
    java.lang.String str14 = book11.getTitle();
    book11.setAuthor1("hi!");
    java.lang.String str17 = book11.getAuthor2();
    book11.setAuthor2("");
    int i20 = book11.getYearPublication();
    java.lang.String str21 = book11.getTitle();
    boolean b22 = book0.Equals(book11);
    java.lang.String str23 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000000000000"+ "'", str10.equals("0000000000000"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getPublisher();
    book0.setAccessionNum((long)(byte)10);
    long long7 = book0.getAccessionNum();
    java.lang.String str8 = book0.getIsbn();
    java.lang.String str9 = book0.getAuthor1();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getIsbn();
    int i3 = book0.getYearPublication();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000000000000"+ "'", str2.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    java.lang.String str7 = book0.getIsbn();
    book0.setAuthor1("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }", (long)(byte)0, (-1));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }", (long)' ', (int)(byte)0);
    java.lang.String str8 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, 52);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

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
    java.lang.String str23 = book7.getTitle();
    book7.setIsbn("");
    book7.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getTitle();
    long long7 = book0.getAccessionNum();
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str10 = book0.getAuthor1();
    book0.setYearPublication((int)(byte)10);
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setTitle("");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str9 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str9.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

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
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
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
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

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
    int i23 = book15.getYearPublication();
    java.lang.String str24 = book15.toString();
    java.lang.String str25 = book15.toString();
    book15.setAuthor1("");
    
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
    org.junit.Assert.assertTrue(i23 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str24.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str25.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", 32L, 100);
    book7.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    int i3 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i6 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAccessionNum((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("");
    book0.setAccessionNum(100L);
    java.lang.String str9 = book0.getAuthor2();
    java.lang.String str10 = book0.getAuthor2();
    java.lang.String str11 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    Book book0 = new Book();
    book0.setIsbn("0000000000000");
    int i3 = book0.getYearPublication();
    java.lang.String str4 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAuthor1("0000000000000");
    java.lang.String str5 = book0.getIsbn();
    book0.setYearPublication((int)(byte)10);
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000000"+ "'", str5.equals("0000000000000"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    Book book7 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    Book book8 = new Book();
    book8.setAuthor1("");
    java.lang.String str11 = book8.getTitle();
    book8.setAuthor1("hi!");
    java.lang.String str14 = book8.getAuthor2();
    book8.setAccessionNum((long)'4');
    book8.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str19 = book8.getIsbn();
    java.lang.String str20 = book8.getIsbn();
    boolean b21 = book7.Equals(book8);
    book7.setAccessionNum(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0000000000000"+ "'", str19.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0000000000000"+ "'", str20.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 1L, (int)'4');

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    book0.setTitle("hi!");
    java.lang.String str10 = book0.getAuthor2();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.toString();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str14 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor2();
    book0.setYearPublication((int)(byte)100);
    long long8 = book0.getAccessionNum();
    java.lang.String str9 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

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
    book11.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    java.lang.String str9 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

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
    java.lang.String str37 = book7.getIsbn();
    
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
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "0000000000000"+ "'", str37.equals("0000000000000"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

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
    book15.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
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

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str8 = book0.toString();
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(short)10);
    book3.setAccessionNum(10L);
    java.lang.String str11 = book3.getAuthor2();
    book3.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

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
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str25 = book7.getTitle();
    java.lang.String str26 = book7.getAuthor2();
    long long27 = book7.getAccessionNum();
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == (-1L));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    java.lang.String str8 = book7.getTitle();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

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
    java.lang.String str39 = book7.getAuthor1();
    java.lang.String str40 = book7.getTitle();
    
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
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str40.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

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
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    Book book25 = new Book();
    book25.setAuthor1("");
    book25.setAccessionNum((long)'4');
    book25.setAuthor2("hi!");
    Book book32 = new Book();
    book32.setAuthor1("");
    book32.setAccessionNum((long)'4');
    book32.setAuthor2("hi!");
    book32.setAccessionNum((-1L));
    boolean b41 = book25.Equals(book32);
    book32.setTitle("");
    long long44 = book32.getAccessionNum();
    book32.setYearPublication((int)(byte)10);
    java.lang.String str47 = book32.getTitle();
    book32.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book32.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b52 = book0.Equals(book32);
    book32.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }");
    
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
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(short)10);
    book3.setAccessionNum(10L);
    java.lang.String str11 = book3.getAuthor2();
    long long12 = book3.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 10L);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    java.lang.String str8 = book0.getTitle();
    java.lang.String str9 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    int i2 = book0.getYearPublication();
    book0.setPublisher("0000000000000");
    java.lang.String str5 = book0.getIsbn();
    book0.setAccessionNum((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000000"+ "'", str5.equals("0000000000000"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)100, 52);
    Book book15 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book15.setYearPublication(0);
    java.lang.String str18 = book15.toString();
    java.lang.String str19 = book15.getIsbn();
    java.lang.String str20 = book15.getAuthor2();
    book15.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book15.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    boolean b25 = book7.Equals(book15);
    book7.setYearPublication((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str18.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0000000000000"+ "'", str19.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

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
    java.lang.String str17 = book0.getPublisher();
    book0.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAccessionNum(100L);
    java.lang.String str22 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    long long7 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1000L);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAccessionNum((long)(byte)-1);
    java.lang.String str7 = book0.toString();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '10' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str7.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    java.lang.String str3 = book0.getAuthor1();
    book0.setPublisher("");
    java.lang.String str6 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i14 = book7.getYearPublication();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    java.lang.String str15 = book0.getPublisher();
    book0.setYearPublication((int)'#');
    java.lang.String str18 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0000000000000"+ "'", str18.equals("0000000000000"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

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
    book15.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '1' }");
    
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

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    long long2 = book0.getAccessionNum();
    java.lang.String str3 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000000000000"+ "'", str3.equals("0000000000000"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 100L, (int)'#');

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

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
    long long23 = book7.getAccessionNum();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '52' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == (-1L));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.getAuthor2();
    java.lang.String str12 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("0000000000000");
    java.lang.String str11 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

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
    java.lang.String str17 = book7.getPublisher();
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    java.lang.String str23 = book18.getAuthor2();
    java.lang.String str24 = book18.getAuthor1();
    book18.setTitle("hi!");
    java.lang.String str27 = book18.getTitle();
    boolean b28 = book7.Equals(book18);
    java.lang.String str29 = book18.getIsbn();
    book18.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str32 = book18.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0000000000000"+ "'", str29.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "0000000000000"+ "'", str32.equals("0000000000000"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    java.lang.String str10 = book7.getIsbn();
    book7.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    long long13 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 52L);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 0L, (int)'a');
    java.lang.String str8 = book7.getAuthor2();
    java.lang.String str9 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str9.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(short)100);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", "0000000000000", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(short)-1, (int)'4');
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setAccessionNum(1L);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book7 = new Book();
    book7.setAuthor1("");
    java.lang.String str10 = book7.getTitle();
    java.lang.String str11 = book7.getPublisher();
    java.lang.String str12 = book7.getPublisher();
    java.lang.String str13 = book7.getPublisher();
    java.lang.String str14 = book7.getTitle();
    book7.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b17 = book0.Equals(book7);
    java.lang.String str18 = book7.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("0000000000000");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAccessionNum((long)(byte)10);
    java.lang.String str14 = book0.getIsbn();
    java.lang.String str15 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0000000000000"+ "'", str14.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    Book book7 = new Book("", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)100, (int)(short)1);
    java.lang.String str8 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }"+ "'", str8.equals("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAccessionNum((long)(byte)-1);
    book0.setAuthor2("");
    long long9 = book0.getAccessionNum();
    java.lang.String str10 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    java.lang.String str15 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str15.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    long long5 = book0.getAccessionNum();
    book0.setPublisher("");
    java.lang.String str8 = book0.getPublisher();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str13 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", (long)52, (int)(short)1);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    java.lang.String str10 = book7.getAuthor2();
    java.lang.String str11 = book7.getPublisher();
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAccessionNum((long)(byte)-1);
    book0.setTitle("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str9 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)97, 0);
    long long8 = book7.getAccessionNum();
    book7.setYearPublication((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 97L);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("0000000000000");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAccessionNum((long)(byte)10);
    java.lang.String str14 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0000000000000"+ "'", str14.equals("0000000000000"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAccessionNum((long)(short)1);
    book0.setAuthor2("");
    java.lang.String str12 = book0.getIsbn();
    Book book20 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)97, (int)(short)10);
    java.lang.String str21 = book20.toString();
    boolean b22 = book0.Equals(book20);
    java.lang.String str23 = book20.getAuthor1();
    book20.setAccessionNum((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }"+ "'", str21.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str23.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getPublisher();
    java.lang.String str13 = book0.getAuthor1();
    java.lang.String str14 = book0.getAuthor2();
    book0.setAccessionNum((long)97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000000000000"+ "'", str13.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }");

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.toString();
    long long12 = book0.getAccessionNum();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 52L);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

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
    java.lang.String str18 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

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
    book7.setAccessionNum((long)(-1));
    int i30 = book7.getYearPublication();
    
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
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    book7.setAccessionNum((long)(short)-1);
    java.lang.String str26 = book7.toString();
    book7.setYearPublication((-1));
    java.lang.String str29 = book7.toString();
    java.lang.String str30 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str26.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str29.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book11 = new Book();
    book11.setAuthor1("");
    book11.setAccessionNum((long)'4');
    book11.setAuthor2("hi!");
    Book book18 = new Book();
    book18.setAuthor1("");
    book18.setAccessionNum((long)'4');
    book18.setAuthor2("hi!");
    book18.setAccessionNum((-1L));
    boolean b27 = book11.Equals(book18);
    java.lang.String str28 = book18.getPublisher();
    long long29 = book18.getAccessionNum();
    boolean b30 = book0.Equals(book18);
    java.lang.String str31 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

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
    Book book26 = new Book();
    java.lang.String str27 = book26.getAuthor2();
    book26.setTitle("");
    java.lang.String str30 = book26.toString();
    book26.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    long long33 = book26.getAccessionNum();
    book26.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    boolean b36 = book7.Equals(book26);
    Book book37 = new Book();
    book37.setAuthor1("");
    java.lang.String str40 = book37.getTitle();
    book37.setAuthor1("hi!");
    java.lang.String str43 = book37.getAuthor2();
    book37.setAccessionNum((long)'4');
    book37.setAuthor2("hi!");
    boolean b48 = book7.Equals(book37);
    book37.setAccessionNum(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str30.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    java.lang.String str8 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 97L, (int)(byte)1);
    book7.setYearPublication(100);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    java.lang.String str8 = book0.getAuthor2();
    java.lang.String str9 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)10, 10);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

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
    book7.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    java.lang.String str15 = book0.getPublisher();
    book0.setYearPublication((int)'#');
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str20 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str20.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    int i25 = book7.getYearPublication();
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str28 = book7.getAuthor2();
    Book book29 = new Book();
    book29.setAuthor1("");
    book29.setAccessionNum((long)'4');
    book29.setAuthor2("hi!");
    java.lang.String str36 = book29.getTitle();
    book29.setAccessionNum(0L);
    book29.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book29.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b43 = book7.Equals(book29);
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str28.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

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
    book19.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
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
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

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
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book16 = new Book();
    book16.setAuthor1("");
    book16.setAccessionNum((long)'4');
    book16.setAuthor2("hi!");
    Book book23 = new Book();
    book23.setAuthor1("");
    book23.setAccessionNum((long)'4');
    book23.setAuthor2("hi!");
    book23.setAccessionNum((-1L));
    boolean b32 = book16.Equals(book23);
    book23.setTitle("");
    long long35 = book23.getAccessionNum();
    book23.setYearPublication((int)(byte)10);
    java.lang.String str38 = book23.getTitle();
    book23.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book23.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b43 = book0.Equals(book23);
    Book book44 = null;
    boolean b45 = book0.Equals(book44);
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }");
    
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
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long35 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '0000000000000' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(byte)-1, (int)'4');

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str10 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    int i25 = book7.getYearPublication();
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str28 = book7.getPublisher();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setYearPublication(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(byte)100, (int)(byte)100);
    java.lang.String str8 = book7.getAuthor2();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    book9.setAuthor1("hi!");
    java.lang.String str15 = book9.getTitle();
    java.lang.String str16 = book9.toString();
    boolean b17 = book7.Equals(book9);
    book9.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str16.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

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
    java.lang.String str27 = book15.toString();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str27.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "hi!", (long)' ', (int)'4');
    int i8 = book7.getYearPublication();
    java.lang.String str9 = book7.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str9.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getPublisher();
    java.lang.String str6 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

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
    java.lang.String str29 = book7.getTitle();
    book7.setYearPublication((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str29.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    java.lang.String str8 = book7.getTitle();
    java.lang.String str9 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str9.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

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
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str25 = book7.toString();
    Book book26 = new Book();
    java.lang.String str27 = book26.getPublisher();
    java.lang.String str28 = book26.getIsbn();
    boolean b29 = book7.Equals(book26);
    book7.setYearPublication((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str25.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0000000000000"+ "'", str28.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getTitle();
    long long7 = book0.getAccessionNum();
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str10 = book0.getAuthor1();
    book0.setAccessionNum((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(short)10);
    book3.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book7.setTitle("");
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setTitle("");
    book7.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str15 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str15.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "", (long)32, (int)(byte)10);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    java.lang.String str15 = book0.getPublisher();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

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
    java.lang.String str39 = book7.getAuthor1();
    book7.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
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
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor1();
    java.lang.String str6 = book0.getAuthor1();
    java.lang.String str7 = book0.getIsbn();
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }");
    java.lang.String str10 = book0.toString();
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '32' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

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
    book7.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000000000000"+ "'", str17.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getIsbn();
    java.lang.String str13 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    book0.setAuthor2("");
    java.lang.String str9 = book0.getAuthor1();
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    book0.setAuthor2("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 0L, (int)(byte)10);
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str10 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(short)10);
    long long14 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 52L);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    java.lang.String str6 = book0.toString();
    book0.setTitle("");
    int i9 = book0.getYearPublication();
    java.lang.String str10 = book0.getTitle();
    java.lang.String str11 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str6.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

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
    java.lang.String str19 = book7.getPublisher();
    java.lang.String str20 = book7.getIsbn();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0000000000000"+ "'", str20.equals("0000000000000"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '32' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)100, (-1));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "", "", 0L, 10);
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book7.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str12 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }"+ "'", str12.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    long long11 = book7.getAccessionNum();
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setAuthor1("0000000000000");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1L);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    Book book6 = new Book();
    book6.setAuthor1("");
    Book book9 = new Book();
    int i10 = book9.getYearPublication();
    java.lang.String str11 = book9.getAuthor2();
    boolean b12 = book6.Equals(book9);
    book9.setAccessionNum((long)(byte)10);
    boolean b15 = book0.Equals(book9);
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum(97L);
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)97, 0);
    java.lang.String str8 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str8.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getIsbn();
    int i8 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    book7.setTitle("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getIsbn();
    book9.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str18 = book9.getIsbn();
    book9.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str21 = book9.getAuthor1();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0000000000000"+ "'", str18.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str21.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    java.lang.String str8 = book7.getTitle();
    java.lang.String str9 = book7.getIsbn();
    book7.setAccessionNum(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)' ', (int)(short)10);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

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
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str25 = book7.getTitle();
    java.lang.String str26 = book7.getAuthor2();
    long long27 = book7.getAccessionNum();
    java.lang.String str28 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str28.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    java.lang.String str7 = book0.getTitle();
    book0.setAccessionNum(0L);
    java.lang.String str10 = book0.getTitle();
    int i11 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

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
    book7.setYearPublication((int)(byte)1);
    java.lang.String str27 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '1' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str27.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '1' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((int)'a');
    java.lang.String str19 = book0.getPublisher();
    java.lang.String str20 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    Book book19 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book19.setTitle("");
    book19.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    boolean b24 = book0.Equals(book19);
    int i25 = book0.getYearPublication();
    book0.setYearPublication(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setAuthor1("");
    java.lang.String str10 = book0.getIsbn();
    book0.setAuthor2("");
    java.lang.String str13 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000000000000"+ "'", str10.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

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
    book19.setAccessionNum((-1L));
    java.lang.String str36 = book19.getIsbn();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "0000000000000"+ "'", str36.equals("0000000000000"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    java.lang.String str6 = book0.toString();
    java.lang.String str7 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str6.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    java.lang.String str10 = book0.getAuthor2();
    java.lang.String str11 = book0.getAuthor2();
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str14 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("0000000000000");
    book0.setYearPublication((-1));
    java.lang.String str15 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = '0000000000000' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str15.equals("\n\nBook { Title = '0000000000000' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 97L, (int)(byte)10);
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor1("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "hi!", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(short)1, 32);
    long long8 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1L);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    int i5 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    java.lang.String str14 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    Book book7 = new Book("hi!", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", (long)1, (int)(byte)0);
    java.lang.String str8 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAuthor1("hi!");
    book0.setAccessionNum((long)' ');
    int i11 = book0.getYearPublication();
    java.lang.String str12 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

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
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str25 = book7.getTitle();
    java.lang.String str26 = book7.getAuthor2();
    long long27 = book7.getAccessionNum();
    Book book28 = new Book();
    book28.setAuthor1("");
    java.lang.String str31 = book28.getTitle();
    book28.setAuthor1("hi!");
    java.lang.String str34 = book28.getAuthor1();
    book28.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book28.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book28.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book28.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b43 = book7.Equals(book28);
    int i44 = book28.getYearPublication();
    java.lang.String str45 = book28.getPublisher();
    java.lang.String str46 = book28.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long27 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str45.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "0000000000000"+ "'", str46.equals("0000000000000"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)' ', (int)(short)0);
    long long8 = book7.getAccessionNum();
    java.lang.String str9 = book7.toString();
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book7.setYearPublication(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 32L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '32' }"+ "'", str9.equals("\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '32' }"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "hi!", (long)' ', (int)'4');
    int i8 = book7.getYearPublication();
    long long9 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 32L);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i5 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book14 = new Book();
    book14.setAuthor1("");
    book14.setAccessionNum((long)'4');
    book14.setAuthor2("hi!");
    book14.setYearPublication((int)(byte)100);
    book14.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b25 = book0.Equals(book14);
    book0.setAccessionNum(0L);
    java.lang.String str28 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

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
    java.lang.String str17 = book7.getPublisher();
    java.lang.String str18 = book7.getTitle();
    java.lang.String str19 = book7.getTitle();
    java.lang.String str20 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str20.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

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
    java.lang.String str20 = book7.getTitle();
    long long21 = book7.getAccessionNum();
    Book book22 = new Book();
    book22.setAuthor1("");
    book22.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str27 = book22.toString();
    java.lang.String str28 = book22.getIsbn();
    java.lang.String str29 = book22.getIsbn();
    boolean b30 = book7.Equals(book22);
    book22.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }");
    book22.setAccessionNum((long)'a');
    book22.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str27.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0000000000000"+ "'", str28.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0000000000000"+ "'", str29.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    Book book7 = new Book("hi!", "hi!", "", "", "hi!", (long)(byte)100, (int)(short)1);
    book7.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str10 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(short)-1, (int)(byte)0);
    book7.setYearPublication(0);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "", (long)'#', (int)(byte)1);
    java.lang.String str8 = book7.getIsbn();
    book7.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    book7.setAccessionNum((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", 0L, (int)(short)0);
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }");

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    Book book7 = new Book("", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '52' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", 0L, 0);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    java.lang.String str4 = book0.getAuthor2();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    Book book7 = new Book("", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)100, (int)(short)1);
    long long8 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 100L);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setYearPublication(0);
    java.lang.String str8 = book0.toString();
    book0.setIsbn("");
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    java.lang.String str22 = book7.getAuthor1();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str25 = book7.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str25.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication(97);
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    Book book19 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book19.setTitle("");
    book19.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    boolean b24 = book0.Equals(book19);
    int i25 = book0.getYearPublication();
    Book book26 = new Book();
    java.lang.String str27 = book26.getPublisher();
    book26.setPublisher("hi!");
    java.lang.String str30 = book26.getPublisher();
    book26.setAccessionNum((long)(byte)10);
    long long33 = book26.getAccessionNum();
    boolean b34 = book0.Equals(book26);
    book26.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

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
    book7.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    
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

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str11 = book0.toString();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str14 = book0.getAuthor1();
    book0.setPublisher("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str14.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.toString();
    java.lang.String str8 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str7.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    int i2 = book0.getYearPublication();
    book0.setPublisher("0000000000000");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAccessionNum((long)'a');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str11 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    long long11 = book7.getAccessionNum();
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1L);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(short)10);
    book3.setAccessionNum(10L);
    java.lang.String str11 = book3.getAuthor2();
    java.lang.String str12 = book3.getIsbn();
    book3.setYearPublication((int)(byte)10);
    book3.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book3.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '0' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), (int)'a');

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    java.lang.String str3 = book0.getPublisher();
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    int i2 = book0.getYearPublication();
    book0.setPublisher("0000000000000");
    java.lang.String str5 = book0.getIsbn();
    java.lang.String str6 = book0.getAuthor1();
    book0.setAccessionNum(32L);
    java.lang.String str9 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000000"+ "'", str5.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i8 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    book0.setIsbn("");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("0000000000000");
    book0.setTitle("hi!");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }");

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    java.lang.String str8 = book0.getTitle();
    java.lang.String str9 = book0.getAuthor1();
    book0.setAccessionNum((long)(short)-1);
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setTitle("");
    java.lang.String str7 = book0.toString();
    book0.setAccessionNum((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str7.equals("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "", "", 0L, 10);
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i10 = book7.getYearPublication();
    java.lang.String str11 = book7.getAuthor2();
    book7.setAccessionNum((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str11.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    java.lang.String str10 = book0.getAuthor2();
    java.lang.String str11 = book0.getAuthor2();
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str14 = book0.getAuthor2();
    java.lang.String str15 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }", (long)(byte)-1, (int)(short)-1);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

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
    book7.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    book0.setAuthor1("hi!");
    book0.setAccessionNum((long)'a');
    java.lang.String str8 = book0.getIsbn();
    java.lang.String str9 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"+ "'", str9.equals("\n\nBook { Title = '' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    java.lang.String str7 = book0.getIsbn();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor1();
    book0.setAccessionNum(52L);
    java.lang.String str8 = book0.getTitle();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    java.lang.String str7 = book3.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book12 = new Book();
    book12.setAuthor1("");
    java.lang.String str15 = book12.getTitle();
    java.lang.String str16 = book12.getPublisher();
    java.lang.String str17 = book12.getAuthor2();
    java.lang.String str18 = book12.getAuthor1();
    book12.setTitle("hi!");
    book12.setAuthor2("hi!");
    book12.setAuthor1("0000000000000");
    Book book32 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    java.lang.String str33 = book32.toString();
    Book book41 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str42 = book41.getIsbn();
    boolean b43 = book32.Equals(book41);
    boolean b44 = book12.Equals(book41);
    boolean b45 = book7.Equals(book12);
    book7.setAccessionNum((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str33.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '97' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication(100);
    book0.setAccessionNum((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

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
    java.lang.String str17 = book7.getPublisher();
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    java.lang.String str23 = book18.getAuthor2();
    java.lang.String str24 = book18.getAuthor1();
    book18.setTitle("hi!");
    java.lang.String str27 = book18.getTitle();
    boolean b28 = book7.Equals(book18);
    java.lang.String str29 = book7.getPublisher();
    java.lang.String str30 = book7.getPublisher();
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

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
    java.lang.String str17 = book7.toString();
    book7.setYearPublication((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str17.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book9 = null;
    boolean b10 = book0.Equals(book9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    int i25 = book7.getYearPublication();
    java.lang.String str26 = book7.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    Book book0 = new Book();
    book0.setAccessionNum(0L);
    java.lang.String str3 = book0.getAuthor2();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

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
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setAccessionNum((long)32);
    
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

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((-1));
    java.lang.String str7 = book0.getIsbn();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    long long10 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1000L);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    java.lang.String str7 = book0.getTitle();
    book0.setAccessionNum(0L);
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

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
    java.lang.String str32 = book18.getTitle();
    
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

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str7 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book14 = new Book();
    book14.setAuthor1("");
    book14.setAccessionNum((long)'4');
    book14.setAuthor2("hi!");
    book14.setYearPublication((int)(byte)100);
    book14.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b25 = book0.Equals(book14);
    book0.setAccessionNum(0L);
    Book book28 = new Book();
    book28.setAuthor1("");
    java.lang.String str31 = book28.getTitle();
    book28.setAuthor1("hi!");
    int i34 = book28.getYearPublication();
    book28.setAccessionNum((long)(byte)-1);
    book28.setYearPublication(0);
    java.lang.String str39 = book28.getTitle();
    java.lang.String str40 = book28.toString();
    boolean b41 = book0.Equals(book28);
    book0.setAccessionNum(35L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str40.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '32' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", 35L, (-1));
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    java.lang.String str10 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i8 = book0.getYearPublication();
    java.lang.String str9 = book0.getAuthor2();
    java.lang.String str10 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    Book book0 = new Book();
    book0.setAccessionNum(0L);
    java.lang.String str3 = book0.toString();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setYearPublication(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"+ "'", str3.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.toString();
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setTitle("");
    book0.setAccessionNum(97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str6.equals("\n\nBook { Title = '' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor1();
    java.lang.String str6 = book0.toString();
    java.lang.String str7 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str6.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

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
    book0.setYearPublication(10);
    
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
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    book0.setIsbn("");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book16 = new Book();
    book16.setAuthor1("");
    book16.setAccessionNum((long)'4');
    book16.setAuthor2("hi!");
    book16.setAccessionNum((-1L));
    book16.setAuthor2("0000000000000");
    book16.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book16.setAuthor1("0000000000000");
    book16.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str33 = book16.getPublisher();
    boolean b34 = book0.Equals(book16);
    java.lang.String str35 = book16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str35.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    int i6 = book0.getYearPublication();
    book0.setYearPublication(0);
    book0.setAccessionNum((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.toString();
    book0.setAccessionNum((long)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

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
    java.lang.String str20 = book7.getTitle();
    long long21 = book7.getAccessionNum();
    Book book22 = new Book();
    book22.setAuthor1("");
    book22.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str27 = book22.toString();
    java.lang.String str28 = book22.getIsbn();
    java.lang.String str29 = book22.getIsbn();
    boolean b30 = book7.Equals(book22);
    book22.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }");
    book22.setAccessionNum((long)'a');
    java.lang.String str35 = book22.getTitle();
    book22.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    long long38 = book22.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str27.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0000000000000"+ "'", str28.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0000000000000"+ "'", str29.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long38 == 97L);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

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
    java.lang.String str15 = book0.getAuthor2();
    Book book23 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    boolean b24 = book0.Equals(book23);
    java.lang.String str25 = book0.getAuthor1();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str28 = book0.getPublisher();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor2("");
    book0.setAccessionNum(0L);
    java.lang.String str35 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0000000000000"+ "'", str25.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str28.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"+ "'", str35.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i4 = book0.getYearPublication();
    java.lang.String str5 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '32' }");
    java.lang.String str8 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    Book book20 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    java.lang.String str21 = book20.toString();
    Book book29 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str30 = book29.getIsbn();
    boolean b31 = book20.Equals(book29);
    boolean b32 = book0.Equals(book29);
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str35 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str21.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "0000000000000"+ "'", str35.equals("0000000000000"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    long long5 = book0.getAccessionNum();
    book0.setPublisher("");
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str10 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    Book book7 = new Book("", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)100, (int)(short)1);
    book7.setAccessionNum((long)(short)1);
    java.lang.String str10 = book7.toString();
    long long11 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1L);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    java.lang.String str22 = book7.getAuthor1();
    book7.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    java.lang.String str8 = book7.getTitle();
    Book book9 = new Book();
    java.lang.String str10 = book9.getAuthor2();
    book9.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    boolean b13 = book7.Equals(book9);
    java.lang.String str14 = book7.getPublisher();
    book7.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str14.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getIsbn();
    book9.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str18 = book9.getIsbn();
    book9.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i21 = book9.getYearPublication();
    book9.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "0000000000000"+ "'", str18.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

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
    long long23 = book7.getAccessionNum();
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long23 == (-1L));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", 1L, (int)(byte)1);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    book0.setTitle("hi!");
    java.lang.String str10 = book0.getAuthor2();
    java.lang.String str11 = book0.getAuthor1();
    int i12 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

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
    book28.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
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

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

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
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }");
    java.lang.String str21 = book0.getAuthor1();
    java.lang.String str22 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str21.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "", (long)'#', (int)(byte)1);
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    book0.setAuthor1("hi!");
    book0.setAccessionNum((long)'a');
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

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
    int i35 = book15.getYearPublication();
    
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
    org.junit.Assert.assertTrue(i35 == 32);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.getAuthor2();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str8 = book0.toString();
    book0.setAccessionNum((long)35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getPublisher();
    java.lang.String str13 = book0.getAuthor1();
    java.lang.String str14 = book0.getTitle();
    book0.setTitle("");
    java.lang.String str17 = book0.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000000000000"+ "'", str13.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000000000000"+ "'", str17.equals("0000000000000"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

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
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAccessionNum(35L);
    
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

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }", "", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '-1' }", (long)(short)100, (int)(short)10);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", (long)(short)1, (int)'a');
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }");
    book7.setIsbn("hi!");

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str9 = book0.toString();
    java.lang.String str10 = book0.getPublisher();
    int i11 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str9.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

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
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    Book book25 = new Book();
    book25.setAuthor1("");
    book25.setAccessionNum((long)'4');
    book25.setAuthor2("hi!");
    Book book32 = new Book();
    book32.setAuthor1("");
    book32.setAccessionNum((long)'4');
    book32.setAuthor2("hi!");
    book32.setAccessionNum((-1L));
    boolean b41 = book25.Equals(book32);
    book32.setTitle("");
    long long44 = book32.getAccessionNum();
    book32.setYearPublication((int)(byte)10);
    java.lang.String str47 = book32.getTitle();
    book32.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book32.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b52 = book0.Equals(book32);
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '100' }");
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }");
    
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
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long44 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    int i5 = book0.getYearPublication();
    book0.setYearPublication(100);
    java.lang.String str8 = book0.getPublisher();
    long long9 = book0.getAccessionNum();
    java.lang.String str10 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000000000000"+ "'", str10.equals("0000000000000"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    Book book0 = new Book();
    book0.setAccessionNum(0L);
    java.lang.String str3 = book0.toString();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setYearPublication((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"+ "'", str3.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book7 = new Book();
    book7.setAuthor1("");
    Book book10 = new Book();
    int i11 = book10.getYearPublication();
    java.lang.String str12 = book10.getAuthor2();
    boolean b13 = book7.Equals(book10);
    book10.setAccessionNum((long)(short)10);
    boolean b16 = book0.Equals(book10);
    book10.setAccessionNum((long)'#');
    book10.setAccessionNum(97L);
    java.lang.String str21 = book10.getAuthor2();
    int i22 = book10.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", 0L, (int)'a');
    java.lang.String str8 = book7.getPublisher();
    java.lang.String str9 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str9.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((-1));
    java.lang.String str7 = book0.getPublisher();
    book0.setYearPublication((int)(byte)-1);
    java.lang.String str10 = book0.getIsbn();
    book0.setAuthor2("");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str7.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000000000000"+ "'", str10.equals("0000000000000"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getAuthor1();
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
    book17.setTitle("");
    long long29 = book17.getAccessionNum();
    book17.setYearPublication((int)(byte)10);
    java.lang.String str32 = book17.getTitle();
    book17.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book17.setAuthor2("0000000000000");
    java.lang.String str37 = book17.getAuthor1();
    boolean b38 = book0.Equals(book17);
    int i39 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long29 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getIsbn();
    java.lang.String str10 = book0.getPublisher();
    java.lang.String str11 = book0.getIsbn();
    java.lang.String str12 = book0.getAuthor2();
    java.lang.String str13 = book0.toString();
    book0.setPublisher("\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }");
    java.lang.String str16 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str13.equals("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

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
    java.lang.String str17 = book7.getPublisher();
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    java.lang.String str23 = book18.getAuthor2();
    java.lang.String str24 = book18.getAuthor1();
    book18.setTitle("hi!");
    java.lang.String str27 = book18.getTitle();
    boolean b28 = book7.Equals(book18);
    int i29 = book7.getYearPublication();
    java.lang.String str30 = book7.getAuthor2();
    java.lang.String str31 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("hi!");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(short)1);
    java.lang.String str16 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    java.lang.String str8 = book7.toString();
    java.lang.String str9 = book7.getIsbn();
    long long10 = book7.getAccessionNum();
    Book book18 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book18.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i21 = book18.getYearPublication();
    java.lang.String str22 = book18.toString();
    boolean b23 = book7.Equals(book18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str8.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"+ "'", str22.equals("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    Book book7 = new Book("hi!", "hi!", "", "", "hi!", (long)(byte)100, (int)(short)1);
    book7.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str10 = book7.toString();
    int i11 = book7.getYearPublication();
    java.lang.String str12 = book7.getIsbn();
    java.lang.String str13 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    int i7 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

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
    java.lang.String str28 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000000000000"+ "'", str17.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0000000000000"+ "'", str28.equals("0000000000000"));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

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
    book0.setAccessionNum((long)(-1));
    int i16 = book0.getYearPublication();
    java.lang.String str17 = book0.getTitle();
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum(1000L);
    java.lang.String str9 = book0.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000000000000"+ "'", str9.equals("0000000000000"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

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
    java.lang.String str17 = book7.getPublisher();
    book7.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setYearPublication((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book7 = new Book();
    book7.setAuthor1("");
    java.lang.String str10 = book7.getTitle();
    java.lang.String str11 = book7.getPublisher();
    java.lang.String str12 = book7.getAuthor2();
    java.lang.String str13 = book7.getAuthor1();
    book7.setTitle("hi!");
    book7.setAuthor2("hi!");
    book7.setAuthor1("0000000000000");
    java.lang.String str20 = book7.getAuthor2();
    book7.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book23 = new Book();
    book23.setAuthor1("");
    book23.setAccessionNum((long)'4');
    book23.setAuthor2("hi!");
    Book book30 = new Book();
    book30.setAuthor1("");
    book30.setAccessionNum((long)'4');
    book30.setAuthor2("hi!");
    book30.setAccessionNum((-1L));
    boolean b39 = book23.Equals(book30);
    book30.setTitle("");
    long long42 = book30.getAccessionNum();
    book30.setYearPublication((int)(byte)10);
    java.lang.String str45 = book30.getTitle();
    book30.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book30.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b50 = book7.Equals(book30);
    Book book51 = null;
    boolean b52 = book7.Equals(book51);
    // The following exception was thrown during execution in test generation
    try {
    boolean b53 = book0.Equals(book7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long42 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", (long)(byte)-1, (int)(byte)10);
    java.lang.String str8 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

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
    java.lang.String str17 = book7.getPublisher();
    long long18 = book7.getAccessionNum();
    book7.setAccessionNum((long)(byte)0);
    Book book28 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str29 = book28.getIsbn();
    boolean b30 = book7.Equals(book28);
    book28.setAuthor2("\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '32' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.toString();
    java.lang.String str6 = book0.getIsbn();
    int i7 = book0.getYearPublication();
    int i8 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000000000000"+ "'", str6.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    book7.setYearPublication(10);
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str28 = book7.getPublisher();
    Book book29 = new Book();
    book29.setAuthor1("");
    book29.setAccessionNum((long)'4');
    book29.setAuthor2("hi!");
    Book book36 = new Book();
    book36.setAuthor1("");
    book36.setAccessionNum((long)'4');
    book36.setAuthor2("hi!");
    book36.setAccessionNum((-1L));
    boolean b45 = book29.Equals(book36);
    book36.setTitle("");
    long long48 = book36.getAccessionNum();
    book36.setYearPublication((int)(byte)10);
    java.lang.String str51 = book36.getTitle();
    book36.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str54 = book36.getPublisher();
    book36.setAccessionNum((long)100);
    java.lang.String str57 = book36.getPublisher();
    book36.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b60 = book7.Equals(book36);
    java.lang.String str61 = book36.getIsbn();
    book36.setYearPublication(0);
    long long64 = book36.getAccessionNum();
    book36.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str28.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long48 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "0000000000000"+ "'", str61.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long64 == 100L);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)52, (int)(short)-1);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getTitle();
    book0.setYearPublication((-1));
    java.lang.String str12 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    Book book15 = new Book();
    book15.setAuthor1("");
    book15.setAccessionNum((long)'4');
    book15.setAuthor2("hi!");
    Book book22 = new Book();
    book22.setAuthor1("");
    book22.setAccessionNum((long)'4');
    book22.setAuthor2("hi!");
    book22.setAccessionNum((-1L));
    boolean b31 = book15.Equals(book22);
    book22.setTitle("");
    long long34 = book22.getAccessionNum();
    book22.setYearPublication((int)(byte)10);
    java.lang.String str37 = book22.getPublisher();
    book22.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str40 = book22.toString();
    Book book41 = new Book();
    java.lang.String str42 = book41.getPublisher();
    java.lang.String str43 = book41.getIsbn();
    boolean b44 = book22.Equals(book41);
    boolean b45 = book0.Equals(book41);
    book0.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    Book book48 = new Book();
    book48.setAuthor1("");
    java.lang.String str51 = book48.getTitle();
    java.lang.String str52 = book48.getPublisher();
    java.lang.String str53 = book48.getAuthor2();
    book48.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book48.setPublisher("0000000000000");
    book48.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book48.setYearPublication((int)(byte)-1);
    boolean b62 = book0.Equals(book48);
    book0.setAccessionNum((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000000000000"+ "'", str12.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str40.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "0000000000000"+ "'", str43.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book7 = new Book();
    book7.setAuthor1("");
    Book book10 = new Book();
    int i11 = book10.getYearPublication();
    java.lang.String str12 = book10.getAuthor2();
    boolean b13 = book7.Equals(book10);
    book10.setAccessionNum((long)(short)10);
    boolean b16 = book0.Equals(book10);
    book10.setAccessionNum((long)'#');
    java.lang.String str19 = book10.getAuthor2();
    book10.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book10.setAuthor2("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getTitle();
    java.lang.String str12 = book7.getAuthor2();
    java.lang.String str13 = book7.getAuthor2();
    java.lang.String str14 = book7.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str10.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = 'null' \nAccession Number = '10' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str12.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str13.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str14.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.toString();
    book0.setAccessionNum((long)'#');
    book0.setTitle("0000000000000");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str4.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

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
    java.lang.String str17 = book0.getPublisher();
    book0.setYearPublication(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    book7.setYearPublication(10);
    book7.setIsbn("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str16 = book7.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    java.lang.String str8 = book7.getTitle();
    java.lang.String str9 = book7.getIsbn();
    java.lang.String str10 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str10.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.toString();
    book0.setAuthor1("");
    java.lang.String str8 = book0.getTitle();
    book0.setAuthor2("");
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((int)(byte)0);
    java.lang.String str15 = book0.toString();
    java.lang.String str16 = book0.getAuthor1();
    long long17 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str15.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 1000L);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    Book book7 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    long long8 = book7.getAccessionNum();
    java.lang.String str9 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor1();
    book0.setYearPublication(32);
    int i8 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

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
    java.lang.String str17 = book7.getPublisher();
    java.lang.String str18 = book7.toString();
    java.lang.String str19 = book7.toString();
    book7.setYearPublication((int)' ');
    java.lang.String str22 = book7.getPublisher();
    Book book23 = new Book();
    book23.setAuthor1("");
    java.lang.String str26 = book23.getTitle();
    java.lang.String str27 = book23.getPublisher();
    java.lang.String str28 = book23.getAuthor2();
    book23.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book23.setPublisher("0000000000000");
    book23.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book23.setYearPublication((int)(short)-1);
    java.lang.String str37 = book23.getIsbn();
    boolean b38 = book7.Equals(book23);
    java.lang.String str39 = book7.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str18.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str19.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "0000000000000"+ "'", str37.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str4 = book0.getIsbn();
    java.lang.String str5 = book0.toString();
    java.lang.String str6 = book0.getTitle();
    book0.setAuthor2("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000000000000"+ "'", str4.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str5.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

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
    Book book34 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book34.setPublisher("hi!");
    book34.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str39 = book34.toString();
    book34.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book34.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '0000000000000' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '-1' }");
    boolean b44 = book7.Equals(book34);
    book7.setAuthor2("\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"+ "'", str39.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long12 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 1L);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

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
    java.lang.String str17 = book7.getPublisher();
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    java.lang.String str23 = book18.getAuthor2();
    java.lang.String str24 = book18.getAuthor1();
    book18.setTitle("hi!");
    java.lang.String str27 = book18.getTitle();
    boolean b28 = book7.Equals(book18);
    int i29 = book7.getYearPublication();
    java.lang.String str30 = book7.getAuthor2();
    java.lang.String str31 = book7.getAuthor2();
    java.lang.String str32 = book7.getAuthor2();
    book7.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

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
    java.lang.String str19 = book0.getAuthor1();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str24 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str24.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

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
    java.lang.String str19 = book7.getPublisher();
    java.lang.String str20 = book7.getIsbn();
    java.lang.String str21 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0000000000000"+ "'", str20.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", (long)100, 1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i5 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i8 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", (long)'a', 97);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

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
    java.lang.String str25 = book7.getPublisher();
    Book book26 = new Book();
    book26.setAuthor1("");
    java.lang.String str29 = book26.getTitle();
    java.lang.String str30 = book26.getPublisher();
    java.lang.String str31 = book26.getAuthor2();
    book26.setYearPublication(0);
    java.lang.String str34 = book26.getIsbn();
    boolean b35 = book7.Equals(book26);
    book26.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "0000000000000"+ "'", str34.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '100' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(short)100, (int)(short)1);
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    book7.setYearPublication(0);
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str12 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str12.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str10 = book7.getIsbn();
    java.lang.String str11 = book7.getAuthor2();
    Book book19 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)100, (int)'4');
    boolean b20 = book7.Equals(book19);
    book7.setAccessionNum((long)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("0000000000000");
    java.lang.String str10 = book0.getAuthor2();
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str10.equals("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

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
    book0.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }");
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str23 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    book0.setAccessionNum((long)'4');
    long long9 = book0.getAccessionNum();
    java.lang.String str10 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    Book book7 = new Book("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", (long)(byte)-1, (int)(byte)10);
    book7.setYearPublication((int)(short)-1);
    book7.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    book0.setIsbn("");
    book0.setAccessionNum((long)97);
    java.lang.String str16 = book0.toString();
    java.lang.String str17 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"+ "'", str16.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getAuthor2();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    Book book7 = new Book("0000000000000", "\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }", 10L, (int)(byte)100);
    book7.setYearPublication(0);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setYearPublication((int)(byte)1);
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setAccessionNum(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str5 = book0.getAuthor1();
    int i6 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(short)100, 0);
    java.lang.String str8 = book7.getAuthor2();
    book7.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

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
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str25 = book0.getAuthor1();
    java.lang.String str26 = book0.getIsbn();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0000000000000"+ "'", str25.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "0000000000000"+ "'", str26.equals("0000000000000"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    java.lang.String str8 = book0.getTitle();
    int i9 = book0.getYearPublication();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    java.lang.String str11 = book7.getIsbn();
    java.lang.String str12 = book7.getAuthor2();
    book7.setAccessionNum((long)1);
    java.lang.String str15 = book7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000000000000"+ "'", str11.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str15.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

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
    java.lang.String str20 = book7.getTitle();
    long long21 = book7.getAccessionNum();
    Book book22 = new Book();
    book22.setAuthor1("");
    book22.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str27 = book22.toString();
    java.lang.String str28 = book22.getIsbn();
    java.lang.String str29 = book22.getIsbn();
    boolean b30 = book7.Equals(book22);
    book22.setAuthor1("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }");
    book22.setAccessionNum((long)'a');
    java.lang.String str35 = book22.getTitle();
    book22.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book22.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long21 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"+ "'", str27.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "0000000000000"+ "'", str28.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "0000000000000"+ "'", str29.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

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
    int i23 = book15.getYearPublication();
    book15.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }");
    book15.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    long long28 = book15.getAccessionNum();
    int i29 = book15.getYearPublication();
    
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
    org.junit.Assert.assertTrue(i23 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 97);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    Book book10 = new Book();
    book10.setAuthor1("");
    book10.setAccessionNum((long)'4');
    book10.setAuthor2("hi!");
    book10.setAccessionNum((-1L));
    book10.setAuthor2("0000000000000");
    boolean b21 = book7.Equals(book10);
    book7.setYearPublication((int)(short)1);
    java.lang.String str24 = book7.getAuthor1();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book7.setYearPublication((int)(byte)1);
    book7.setIsbn("\n\nBook { Title = '0000000000000' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

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
    int i59 = book7.getYearPublication();
    
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

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    java.lang.String str8 = book7.getTitle();
    java.lang.String str9 = book7.toString();
    long long10 = book7.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }"+ "'", str9.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    Book book7 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(short)0, (int)'#');
    book7.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getPublisher();
    book0.setAccessionNum((long)(byte)10);
    book0.setYearPublication((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setAuthor2("hi!");
    java.lang.String str11 = book0.getPublisher();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str14 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getIsbn();
    book9.setYearPublication((int)'#');
    book9.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str20 = book9.getAuthor1();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor1();
    java.lang.String str7 = book0.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    Book book7 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '52' }", 0L, 1);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book7 = new Book();
    book7.setAuthor1("");
    Book book10 = new Book();
    int i11 = book10.getYearPublication();
    java.lang.String str12 = book10.getAuthor2();
    boolean b13 = book7.Equals(book10);
    book10.setAccessionNum((long)(short)10);
    boolean b16 = book0.Equals(book10);
    book10.setAccessionNum((long)'#');
    book10.setAccessionNum((long)'#');
    book10.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str23 = book10.getAuthor1();
    book10.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }", "", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '1' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(short)0, 1);
    Book book8 = new Book();
    book8.setAuthor1("");
    java.lang.String str11 = book8.getTitle();
    book8.setAuthor1("hi!");
    java.lang.String str14 = book8.getAuthor2();
    java.lang.String str15 = book8.getAuthor1();
    book8.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str18 = book8.getAuthor2();
    int i19 = book8.getYearPublication();
    Book book27 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    boolean b28 = book8.Equals(book27);
    book8.setAccessionNum((long)(byte)1);
    book8.setAccessionNum((long)97);
    boolean b33 = book7.Equals(book8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '97' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (long)(short)-1, (-1));
    java.lang.String str8 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

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
    java.lang.String str28 = book7.getPublisher();
    int i29 = book7.getYearPublication();
    java.lang.String str30 = book7.getIsbn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "0000000000000"+ "'", str30.equals("0000000000000"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    book0.setAccessionNum((long)100);
    book0.setAccessionNum(32L);
    java.lang.String str6 = book0.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setYearPublication((int)(byte)100);
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str11 = book0.toString();
    long long12 = book0.getAccessionNum();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str15 = book0.getIsbn();
    java.lang.String str16 = book0.getPublisher();
    long long17 = book0.getAccessionNum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str11.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0000000000000"+ "'", str15.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 52L);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    java.lang.String str9 = book0.getTitle();
    book0.setYearPublication((-1));
    java.lang.String str12 = book0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str12.equals("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '52' }"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    Book book6 = new Book();
    book6.setAuthor1("");
    Book book9 = new Book();
    int i10 = book9.getYearPublication();
    java.lang.String str11 = book9.getAuthor2();
    boolean b12 = book6.Equals(book9);
    book9.setAccessionNum((long)(byte)10);
    boolean b15 = book0.Equals(book9);
    java.lang.String str16 = book9.getAuthor1();
    book9.setAccessionNum((long)52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

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
    book7.setPublisher("hi!");
    book7.setYearPublication(0);
    Book book21 = new Book();
    java.lang.String str22 = book21.getPublisher();
    java.lang.String str23 = book21.getTitle();
    book21.setAuthor2("");
    book21.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b28 = book7.Equals(book21);
    java.lang.String str29 = book21.getAuthor2();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

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
    java.lang.String str16 = book0.getAuthor1();
    java.lang.String str17 = book0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str16.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

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
    java.lang.String str25 = book7.getPublisher();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book7.setAccessionNum(97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getTitle();
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str7 = book0.getIsbn();
    book0.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '0' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000000000000"+ "'", str7.equals("0000000000000"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book7.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str12 = book7.getPublisher();
    long long13 = book7.getAccessionNum();
    book7.setAccessionNum((long)97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"+ "'", str12.equals("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1L);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    book7.setYearPublication(0);
    java.lang.String str12 = book7.getIsbn();
    book7.setYearPublication((int)(short)-1);
    java.lang.String str15 = book7.getIsbn();
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str18 = book7.getTitle();
    java.lang.String str19 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

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
    java.lang.String str17 = book0.getPublisher();
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

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
    java.lang.String str17 = book7.getPublisher();
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    java.lang.String str23 = book18.getAuthor2();
    java.lang.String str24 = book18.getAuthor1();
    book18.setTitle("hi!");
    java.lang.String str27 = book18.getTitle();
    boolean b28 = book7.Equals(book18);
    int i29 = book7.getYearPublication();
    java.lang.String str30 = book7.getAuthor2();
    java.lang.String str31 = book7.getAuthor2();
    book7.setAccessionNum((long)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAuthor1("0000000000000");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '35' \nISBN = '0000000000000' \nAccession Number = '10' }");

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getPublisher();
    book0.setTitle("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    Book book7 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book7.setYearPublication(0);
    java.lang.String str10 = book7.toString();
    long long11 = book7.getAccessionNum();
    java.lang.String str12 = book7.getPublisher();
    book7.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str15 = book7.getPublisher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"+ "'", str10.equals("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    java.lang.String str3 = book0.getAuthor1();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '97' }");
    java.lang.String str8 = book0.getIsbn();
    java.lang.String str9 = book0.getAuthor1();
    book0.setAccessionNum(97L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000000000000"+ "'", str8.equals("0000000000000"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '0' }", "\n\nBook { Title = '\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)-1, 100);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "", (long)' ', (-1));
    java.lang.String str8 = book7.getPublisher();
    java.lang.String str9 = book7.toString();
    java.lang.String str10 = book7.getAuthor1();
    Book book18 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str19 = book18.getIsbn();
    long long20 = book18.getAccessionNum();
    boolean b21 = book7.Equals(book18);
    java.lang.String str22 = book18.getAuthor1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"+ "'", str8.equals("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '32' }"+ "'", str9.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '32' }"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == 52L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "0000000000000", "0000000000000", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)(short)-1, (int)'4');
    book7.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str10 = book7.toString();
    book7.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '0000000000000' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '-1' }"+ "'", str10.equals("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '0000000000000' \nYear Of Publication = '52' \nISBN = 'null' \nAccession Number = '-1' }"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book7.setPublisher("hi!");
    java.lang.String str10 = book7.toString();
    book7.setYearPublication(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"+ "'", str10.equals("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

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
    book7.setAccessionNum((long)(-1));
    java.lang.String str30 = book7.getAuthor1();
    java.lang.String str31 = book7.getTitle();
    
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
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

}
