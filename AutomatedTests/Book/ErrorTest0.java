
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    Book book0 = new Book();
    Book book1 = new Book();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b2 = book0.Equals(book1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    long long5 = book0.getAccessionNum();
    Book book6 = new Book();
    book6.setAuthor1("");
    book6.setAccessionNum((long)'4');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b11 = book0.Equals(book6);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    Book book4 = new Book();
    book4.setAuthor1("");
    java.lang.String str7 = book4.getTitle();
    book4.setAuthor1("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = book0.Equals(book4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(byte)10);
    Book book9 = new Book();
    book9.setAuthor1("");
    book9.setAccessionNum((long)'4');
    book9.setAuthor2("hi!");
    Book book16 = new Book();
    book16.setAuthor1("");
    book16.setAccessionNum((long)'4');
    book16.setAuthor2("hi!");
    book16.setAccessionNum((-1L));
    boolean b25 = book9.Equals(book16);
    book16.setTitle("");
    long long28 = book16.getAccessionNum();
    book16.setYearPublication((int)(byte)10);
    java.lang.String str31 = book16.getPublisher();
    book16.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b34 = book3.Equals(book16);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book17 = new Book("hi!", "hi!", "", "", "hi!", (long)(byte)100, (int)(short)1);
    Book book18 = new Book();
    book18.setAuthor1("");
    java.lang.String str21 = book18.getTitle();
    java.lang.String str22 = book18.getPublisher();
    boolean b23 = book17.Equals(book18);
    book17.setIsbn("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b26 = book0.Equals(book17);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.toString();
    Book book12 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    java.lang.String str13 = book12.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = book0.Equals(book12);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    Book book7 = new Book();
    book7.setAuthor1("");
    java.lang.String str10 = book7.getTitle();
    java.lang.String str11 = book7.getPublisher();
    java.lang.String str12 = book7.getAuthor2();
    java.lang.String str13 = book7.getAuthor1();
    book7.setTitle("hi!");
    book7.setAuthor2("hi!");
    book7.setAuthor1("0000000000000");
    book7.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str22 = book7.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b23 = book3.Equals(book7);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

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
    book30.setIsbn("0000000000000");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b45 = book7.Equals(book30);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getIsbn();
    Book book10 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book10.setPublisher("hi!");
    Book book13 = new Book();
    book13.setAuthor1("");
    book13.setAccessionNum((long)'4');
    book13.setAuthor2("hi!");
    book13.setAccessionNum((-1L));
    book13.setAuthor2("0000000000000");
    boolean b24 = book10.Equals(book13);
    book10.setYearPublication((int)(short)1);
    java.lang.String str27 = book10.getAuthor1();
    int i28 = book10.getYearPublication();
    book10.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b31 = book0.Equals(book10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    Book book8 = new Book();
    book8.setAuthor1("");
    java.lang.String str11 = book8.getTitle();
    book8.setAuthor1("hi!");
    int i14 = book8.getYearPublication();
    book8.setAuthor2("");
    long long17 = book8.getAccessionNum();
    book8.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = book0.Equals(book8);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    Book book7 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", 1L, (int)' ');
    java.lang.String str8 = book7.getTitle();
    Book book9 = new Book();
    java.lang.String str10 = book9.getAuthor2();
    book9.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    boolean b13 = book7.Equals(book9);
    Book book21 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b22 = book9.Equals(book21);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    Book book5 = new Book();
    book5.setAuthor1("");
    java.lang.String str8 = book5.getPublisher();
    java.lang.String str9 = book5.getAuthor1();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b10 = book0.Equals(book5);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    java.lang.String str3 = book0.getAuthor1();
    java.lang.String str4 = book0.getTitle();
    Book book12 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", (long)(short)1, (int)'a');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b13 = book0.Equals(book12);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

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
    book7.setIsbn("0000000000000");
    java.lang.String str22 = book7.getTitle();
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
    int i45 = book30.getYearPublication();
    book30.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b48 = book7.Equals(book30);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i9 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setAccessionNum((-1L));
    Book book14 = new Book();
    book14.setAuthor1("");
    book14.setAccessionNum((long)'4');
    book14.setAuthor2("hi!");
    Book book21 = new Book();
    book21.setAuthor1("");
    book21.setAccessionNum((long)'4');
    book21.setAuthor2("hi!");
    book21.setAccessionNum((-1L));
    boolean b30 = book14.Equals(book21);
    book21.setTitle("");
    long long33 = book21.getAccessionNum();
    book21.setYearPublication((int)(byte)10);
    java.lang.String str36 = book21.getTitle();
    book21.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str39 = book21.getPublisher();
    book21.setAccessionNum((long)100);
    Book book42 = new Book();
    book42.setAuthor1("");
    book42.setAccessionNum((long)'4');
    book42.setAccessionNum((long)(byte)-1);
    java.lang.String str49 = book42.toString();
    boolean b50 = book21.Equals(book42);
    book42.setTitle("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i53 = book42.getYearPublication();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b54 = book0.Equals(book42);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    java.lang.String str3 = book0.getAuthor1();
    Book book11 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str12 = book11.getIsbn();
    long long13 = book11.getAccessionNum();
    Book book14 = new Book();
    book14.setAuthor1("");
    Book book17 = new Book();
    int i18 = book17.getYearPublication();
    java.lang.String str19 = book17.getAuthor2();
    boolean b20 = book14.Equals(book17);
    java.lang.String str21 = book14.getIsbn();
    long long22 = book14.getAccessionNum();
    boolean b23 = book11.Equals(book14);
    book11.setAuthor1("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b26 = book0.Equals(book11);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

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
    int i24 = book7.getYearPublication();
    Book book32 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book32.setPublisher("hi!");
    Book book35 = new Book();
    book35.setAuthor1("");
    book35.setAccessionNum((long)'4');
    book35.setAuthor2("hi!");
    book35.setAccessionNum((-1L));
    book35.setAuthor2("0000000000000");
    boolean b46 = book32.Equals(book35);
    book32.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i49 = book32.getYearPublication();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b50 = book7.Equals(book32);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    int i4 = book0.getYearPublication();
    Book book5 = new Book();
    book5.setAuthor1("");
    book5.setAccessionNum((long)'4');
    long long10 = book5.getAccessionNum();
    book5.setPublisher("");
    java.lang.String str13 = book5.getPublisher();
    java.lang.String str14 = book5.getPublisher();
    book5.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book5.setYearPublication((int)(short)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b19 = book0.Equals(book5);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str7 = book0.getPublisher();
    Book book8 = new Book();
    book8.setAuthor1("");
    book8.setAccessionNum((long)'4');
    book8.setAuthor2("hi!");
    book8.setAuthor1("0000000000000");
    java.lang.String str17 = book8.getTitle();
    book8.setYearPublication((-1));
    int i20 = book8.getYearPublication();
    java.lang.String str21 = book8.getPublisher();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b22 = book0.Equals(book8);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

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
    Book book21 = new Book();
    book21.setAuthor1("");
    book21.setAccessionNum((long)'4');
    book21.setAuthor2("hi!");
    Book book28 = new Book();
    book28.setAuthor1("");
    book28.setAccessionNum((long)'4');
    book28.setAuthor2("hi!");
    book28.setAccessionNum((-1L));
    boolean b37 = book21.Equals(book28);
    book28.setTitle("");
    long long40 = book28.getAccessionNum();
    book28.setYearPublication((int)(byte)10);
    java.lang.String str43 = book28.getPublisher();
    book28.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b46 = book7.Equals(book28);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getPublisher();
    book0.setAccessionNum((long)(byte)10);
    long long7 = book0.getAccessionNum();
    java.lang.String str8 = book0.getIsbn();
    java.lang.String str9 = book0.getAuthor1();
    java.lang.String str10 = book0.getTitle();
    Book book11 = new Book();
    book11.setAuthor1("");
    java.lang.String str14 = book11.getPublisher();
    java.lang.String str15 = book11.getAuthor2();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = book0.Equals(book11);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    int i4 = book0.getYearPublication();
    Book book5 = new Book();
    book5.setAuthor1("");
    book5.setAccessionNum((long)'4');
    book5.setAuthor2("hi!");
    Book book12 = new Book();
    book12.setAuthor1("");
    book12.setAccessionNum((long)'4');
    book12.setAuthor2("hi!");
    book12.setAccessionNum((-1L));
    boolean b21 = book5.Equals(book12);
    book12.setTitle("");
    long long24 = book12.getAccessionNum();
    book12.setYearPublication((int)(byte)10);
    java.lang.String str27 = book12.getTitle();
    book12.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book12.setAuthor2("0000000000000");
    java.lang.String str32 = book12.getAuthor1();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b33 = book0.Equals(book12);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    java.lang.String str4 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str7 = book0.getPublisher();
    Book book8 = new Book();
    book8.setAuthor1("");
    java.lang.String str11 = book8.getTitle();
    java.lang.String str12 = book8.getPublisher();
    java.lang.String str13 = book8.getAuthor2();
    book8.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book8.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book8.setPublisher("hi!");
    book8.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book8.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book8.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book8.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b28 = book0.Equals(book8);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    int i2 = book0.getYearPublication();
    long long3 = book0.getAccessionNum();
    Book book4 = new Book();
    book4.setAuthor1("");
    java.lang.String str7 = book4.getTitle();
    java.lang.String str8 = book4.getPublisher();
    java.lang.String str9 = book4.getAuthor2();
    book4.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book4.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book4.setPublisher("hi!");
    book4.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book4.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }");
    book4.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b22 = book0.Equals(book4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((-1));
    java.lang.String str7 = book0.getIsbn();
    Book book15 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)1, (int)(short)100);
    java.lang.String str16 = book15.getAuthor1();
    java.lang.String str17 = book15.getPublisher();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = book0.Equals(book15);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

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
    Book book27 = new Book();
    book27.setAuthor1("");
    book27.setAccessionNum((long)'4');
    book27.setAuthor2("hi!");
    Book book34 = new Book();
    book34.setAuthor1("");
    book34.setAccessionNum((long)'4');
    book34.setAuthor2("hi!");
    book34.setAccessionNum((-1L));
    boolean b43 = book27.Equals(book34);
    book34.setTitle("");
    long long46 = book34.getAccessionNum();
    book34.setYearPublication((int)(byte)10);
    java.lang.String str49 = book34.getTitle();
    book34.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str52 = book34.getPublisher();
    book34.setAccessionNum((long)100);
    Book book55 = new Book();
    book55.setAuthor1("");
    book55.setAccessionNum((long)'4');
    book55.setAccessionNum((long)(byte)-1);
    java.lang.String str62 = book55.toString();
    boolean b63 = book34.Equals(book55);
    int i64 = book55.getYearPublication();
    java.lang.String str65 = book55.getAuthor1();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b66 = book15.Equals(book55);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    int i3 = book0.getYearPublication();
    Book book4 = new Book();
    book4.setAuthor1("");
    book4.setAccessionNum((long)'4');
    book4.setAuthor2("hi!");
    Book book11 = new Book();
    book11.setAuthor1("");
    book11.setAccessionNum((long)'4');
    book11.setAuthor2("hi!");
    book11.setAccessionNum((-1L));
    boolean b20 = book4.Equals(book11);
    java.lang.String str21 = book11.getPublisher();
    Book book22 = new Book();
    book22.setAuthor1("");
    java.lang.String str25 = book22.getTitle();
    java.lang.String str26 = book22.getPublisher();
    java.lang.String str27 = book22.getAuthor2();
    java.lang.String str28 = book22.getAuthor1();
    book22.setTitle("hi!");
    java.lang.String str31 = book22.getTitle();
    boolean b32 = book11.Equals(book22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b33 = book0.Equals(book22);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i9 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str12 = book0.getAuthor2();
    Book book13 = new Book();
    book13.setAuthor1("");
    java.lang.String str16 = book13.getTitle();
    java.lang.String str17 = book13.getPublisher();
    java.lang.String str18 = book13.getAuthor2();
    java.lang.String str19 = book13.getAuthor1();
    book13.setTitle("hi!");
    book13.setAuthor2("hi!");
    java.lang.String str24 = book13.getPublisher();
    book13.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str27 = book13.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b28 = book0.Equals(book13);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

    Book book0 = new Book();
    book0.setAccessionNum(0L);
    java.lang.String str3 = book0.toString();
    int i4 = book0.getYearPublication();
    Book book5 = new Book();
    java.lang.String str6 = book5.getAuthor2();
    int i7 = book5.getYearPublication();
    book5.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book5.setYearPublication((-1));
    java.lang.String str12 = book5.getIsbn();
    book5.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book5.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = book0.Equals(book5);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

    Book book7 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str8 = book7.getIsbn();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    boolean b14 = book7.Equals(book9);
    java.lang.String str15 = book9.getIsbn();
    book9.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book9.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '32' }");
    Book book20 = new Book();
    book20.setAuthor1("");
    book20.setAccessionNum((long)'4');
    book20.setAuthor2("hi!");
    Book book27 = new Book();
    book27.setAuthor1("");
    book27.setAccessionNum((long)'4');
    book27.setAuthor2("hi!");
    book27.setAccessionNum((-1L));
    boolean b36 = book20.Equals(book27);
    java.lang.String str37 = book27.getIsbn();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b38 = book9.Equals(book27);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setYearPublication(0);
    java.lang.String str8 = book0.toString();
    java.lang.String str9 = book0.getAuthor1();
    Book book17 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book17.setYearPublication(0);
    java.lang.String str20 = book17.toString();
    java.lang.String str21 = book17.getIsbn();
    java.lang.String str22 = book17.getAuthor2();
    book17.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b25 = book0.Equals(book17);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }

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
    Book book29 = new Book();
    java.lang.String str30 = book29.getPublisher();
    java.lang.String str31 = book29.getTitle();
    book29.setAuthor2("");
    long long34 = book29.getAccessionNum();
    java.lang.String str35 = book29.getAuthor2();
    boolean b36 = book7.Equals(book29);
    Book book37 = new Book();
    book37.setAuthor1("");
    book37.setAccessionNum((long)'4');
    book37.setAuthor2("hi!");
    Book book44 = new Book();
    book44.setAuthor1("");
    book44.setAccessionNum((long)'4');
    book44.setAuthor2("hi!");
    book44.setAccessionNum((-1L));
    boolean b53 = book37.Equals(book44);
    java.lang.String str54 = book37.getPublisher();
    book37.setIsbn("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book37.setAccessionNum(100L);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b59 = book29.Equals(book37);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("0000000000000");
    book0.setTitle("hi!");
    book0.setYearPublication((int)(byte)100);
    java.lang.String str19 = book0.toString();
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book22 = new Book();
    book22.setAuthor1("");
    book22.setAccessionNum((long)'4');
    book22.setAuthor2("hi!");
    book22.setAccessionNum((-1L));
    book22.setAuthor2("0000000000000");
    book22.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book22.setAuthor1("0000000000000");
    Book book37 = new Book();
    int i38 = book37.getYearPublication();
    java.lang.String str39 = book37.getAuthor2();
    java.lang.String str40 = book37.getPublisher();
    book37.setYearPublication((int)'a');
    int i43 = book37.getYearPublication();
    boolean b44 = book22.Equals(book37);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b45 = book0.Equals(book22);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }

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
    java.lang.String str26 = book15.getAuthor2();
    Book book34 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str35 = book34.getIsbn();
    Book book36 = new Book();
    book36.setAuthor1("");
    java.lang.String str39 = book36.getTitle();
    java.lang.String str40 = book36.getPublisher();
    boolean b41 = book34.Equals(book36);
    java.lang.String str42 = book36.getIsbn();
    book36.setYearPublication((int)'#');
    book36.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book36.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b49 = book15.Equals(book36);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    java.lang.String str4 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book7 = new Book();
    java.lang.String str8 = book7.getPublisher();
    book7.setPublisher("hi!");
    java.lang.String str11 = book7.getPublisher();
    book7.setAccessionNum((long)(byte)10);
    long long14 = book7.getAccessionNum();
    java.lang.String str15 = book7.getIsbn();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b16 = book0.Equals(book7);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }

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
    Book book33 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str34 = book33.getIsbn();
    long long35 = book33.getAccessionNum();
    Book book36 = new Book();
    book36.setAuthor1("");
    Book book39 = new Book();
    int i40 = book39.getYearPublication();
    java.lang.String str41 = book39.getAuthor2();
    boolean b42 = book36.Equals(book39);
    java.lang.String str43 = book36.getIsbn();
    long long44 = book36.getAccessionNum();
    boolean b45 = book33.Equals(book36);
    book33.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book33.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b50 = book15.Equals(book33);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum(1000L);
    Book book9 = new Book();
    java.lang.String str10 = book9.getPublisher();
    book9.setPublisher("hi!");
    book9.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i15 = book9.getYearPublication();
    boolean b16 = book0.Equals(book9);
    book9.setYearPublication((int)(short)100);
    Book book26 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    java.lang.String str27 = book26.getIsbn();
    Book book28 = new Book();
    book28.setAuthor1("");
    java.lang.String str31 = book28.getTitle();
    java.lang.String str32 = book28.getPublisher();
    boolean b33 = book26.Equals(book28);
    java.lang.String str34 = book28.getIsbn();
    book28.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str37 = book28.getIsbn();
    java.lang.String str38 = book28.getTitle();
    java.lang.String str39 = book28.getAuthor1();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b40 = book9.Equals(book28);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor2();
    java.lang.String str7 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book19 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "hi!", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }", 1000L, 100);
    book19.setTitle("\n\nBook { Title = '0000000000000' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '1' }");
    java.lang.String str22 = book19.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b23 = book0.Equals(book19);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    long long5 = book0.getAccessionNum();
    java.lang.String str6 = book0.getIsbn();
    java.lang.String str7 = book0.toString();
    Book book15 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)10, 1);
    java.lang.String str16 = book15.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = book0.Equals(book15);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    java.lang.String str4 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    long long7 = book0.getAccessionNum();
    java.lang.String str8 = book0.getAuthor1();
    book0.setAccessionNum((long)(byte)10);
    Book book11 = new Book();
    book11.setAuthor1("");
    java.lang.String str14 = book11.getTitle();
    java.lang.String str15 = book11.getPublisher();
    java.lang.String str16 = book11.getAuthor2();
    book11.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book11.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book11.setPublisher("hi!");
    book11.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    java.lang.String str25 = book11.getAuthor1();
    java.lang.String str26 = book11.getPublisher();
    book11.setYearPublication((int)'#');
    book11.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b31 = book0.Equals(book11);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test41"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((-1));
    java.lang.String str7 = book0.getIsbn();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book21 = new Book("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = '' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '10' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '0' }", (long)32, (int)(short)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b22 = book0.Equals(book21);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test42"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    book0.setPublisher("hi!");
    java.lang.String str4 = book0.getPublisher();
    book0.setAccessionNum((long)(byte)10);
    long long7 = book0.getAccessionNum();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
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
    book17.setPublisher("hi!");
    book17.setYearPublication(0);
    Book book31 = new Book();
    java.lang.String str32 = book31.getPublisher();
    java.lang.String str33 = book31.getTitle();
    book31.setAuthor2("");
    book31.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b38 = book17.Equals(book31);
    java.lang.String str39 = book17.getAuthor2();
    long long40 = book17.getAccessionNum();
    java.lang.String str41 = book17.getAuthor2();
    book17.setYearPublication((int)(short)-1);
    book17.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '52' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b46 = book0.Equals(book17);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test43"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str7 = book0.getPublisher();
    int i8 = book0.getYearPublication();
    Book book9 = new Book();
    book9.setAuthor1("");
    java.lang.String str12 = book9.getTitle();
    java.lang.String str13 = book9.getPublisher();
    java.lang.String str14 = book9.getAuthor2();
    book9.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book9.setAccessionNum((long)(short)1);
    book9.setAuthor2("");
    java.lang.String str21 = book9.getIsbn();
    Book book29 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)97, (int)(short)10);
    java.lang.String str30 = book29.toString();
    boolean b31 = book9.Equals(book29);
    book29.setAuthor2("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b34 = book0.Equals(book29);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test44"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    long long5 = book0.getAccessionNum();
    java.lang.String str6 = book0.getIsbn();
    java.lang.String str7 = book0.toString();
    java.lang.String str8 = book0.getIsbn();
    book0.setAccessionNum(10L);
    Book book11 = new Book();
    book11.setAuthor1("");
    book11.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str16 = book11.getAuthor1();
    java.lang.String str17 = book11.getAuthor1();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = book0.Equals(book11);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test45"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str11 = book0.getIsbn();
    int i12 = book0.getYearPublication();
    Book book20 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    Book book21 = new Book();
    book21.setAuthor1("");
    java.lang.String str24 = book21.getTitle();
    book21.setAuthor1("hi!");
    java.lang.String str27 = book21.getAuthor2();
    book21.setAccessionNum((long)'4');
    book21.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str32 = book21.getIsbn();
    java.lang.String str33 = book21.getIsbn();
    boolean b34 = book20.Equals(book21);
    Book book35 = new Book();
    book35.setAuthor1("");
    book35.setAccessionNum((long)'4');
    book35.setAuthor2("hi!");
    Book book42 = new Book();
    book42.setAuthor1("");
    book42.setAccessionNum((long)'4');
    book42.setAuthor2("hi!");
    book42.setAccessionNum((-1L));
    boolean b51 = book35.Equals(book42);
    book42.setPublisher("hi!");
    book42.setYearPublication(0);
    book42.setYearPublication((int)(byte)1);
    boolean b58 = book21.Equals(book42);
    int i59 = book21.getYearPublication();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b60 = book0.Equals(book21);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test46"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("hi!");
    book0.setAccessionNum((-1L));
    book0.setAuthor2("0000000000000");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAuthor1("0000000000000");
    book0.setTitle("hi!");
    book0.setYearPublication((int)(byte)100);
    java.lang.String str19 = book0.toString();
    Book book20 = new Book();
    book20.setAuthor1("");
    book20.setAccessionNum((long)'4');
    book20.setAuthor2("hi!");
    book20.setAccessionNum((-1L));
    book20.setAuthor2("0000000000000");
    book20.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book20.setAuthor1("0000000000000");
    Book book35 = new Book();
    int i36 = book35.getYearPublication();
    java.lang.String str37 = book35.getAuthor2();
    java.lang.String str38 = book35.getPublisher();
    book35.setYearPublication((int)'a');
    int i41 = book35.getYearPublication();
    boolean b42 = book20.Equals(book35);
    book20.setAccessionNum((-1L));
    book20.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book20.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b49 = book0.Equals(book20);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test47"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    java.lang.String str5 = book0.getPublisher();
    java.lang.String str6 = book0.toString();
    book0.setTitle("");
    java.lang.String str9 = book0.getTitle();
    java.lang.String str10 = book0.getPublisher();
    Book book18 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book18.setPublisher("hi!");
    Book book21 = new Book();
    book21.setAuthor1("");
    book21.setAccessionNum((long)'4');
    book21.setAuthor2("hi!");
    book21.setAccessionNum((-1L));
    book21.setAuthor2("0000000000000");
    boolean b32 = book18.Equals(book21);
    book18.setYearPublication((int)(short)1);
    book18.setYearPublication(10);
    book18.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str39 = book18.getPublisher();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b40 = book0.Equals(book18);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test48"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setAccessionNum((long)(byte)1);
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '32' \nISBN = 'null' \nAccession Number = '1' }");
    Book book9 = new Book();
    book9.setAuthor1("");
    book9.setAccessionNum((long)'4');
    long long14 = book9.getAccessionNum();
    book9.setPublisher("");
    java.lang.String str17 = book9.getPublisher();
    book9.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book9.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book9.setPublisher("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book24 = new Book();
    int i25 = book24.getYearPublication();
    java.lang.String str26 = book24.getAuthor2();
    java.lang.String str27 = book24.getPublisher();
    book24.setYearPublication((int)'a');
    int i30 = book24.getYearPublication();
    java.lang.String str31 = book24.getAuthor2();
    book24.setTitle("0000000000000");
    boolean b34 = book9.Equals(book24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b35 = book0.Equals(book9);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test49"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setPublisher("");
    java.lang.String str9 = book0.getTitle();
    java.lang.String str10 = book0.toString();
    Book book11 = new Book();
    book11.setAuthor1("");
    java.lang.String str14 = book11.getPublisher();
    java.lang.String str15 = book11.getAuthor2();
    java.lang.String str16 = book11.getAuthor1();
    java.lang.String str17 = book11.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = book0.Equals(book11);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test50"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    java.lang.String str2 = book0.getTitle();
    java.lang.String str3 = book0.getAuthor1();
    book0.setIsbn("0000000000000");
    Book book6 = new Book();
    book6.setAuthor1("");
    java.lang.String str9 = book6.getTitle();
    book6.setAuthor1("hi!");
    java.lang.String str12 = book6.getAuthor2();
    java.lang.String str13 = book6.getAuthor1();
    book6.setAuthor1("");
    java.lang.String str16 = book6.getIsbn();
    book6.setYearPublication((int)(short)10);
    java.lang.String str19 = book6.getAuthor2();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = book0.Equals(book6);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test51"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getIsbn();
    int i3 = book0.getYearPublication();
    book0.setAuthor2("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book13 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", (long)(byte)100, (int)(short)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b14 = book0.Equals(book13);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test52"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    long long5 = book0.getAccessionNum();
    book0.setPublisher("");
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str10 = book0.toString();
    book0.setYearPublication((int)'4');
    java.lang.String str13 = book0.getPublisher();
    java.lang.String str14 = book0.toString();
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
    java.lang.String str37 = book22.getTitle();
    book22.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book22.setAuthor2("0000000000000");
    java.lang.String str42 = book22.getAuthor1();
    java.lang.String str43 = book22.getIsbn();
    book22.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book22.setYearPublication(52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b48 = book0.Equals(book22);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test53"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str7 = book0.getAuthor2();
    long long8 = book0.getAccessionNum();
    Book book9 = new Book();
    book9.setAuthor1("");
    book9.setAccessionNum((long)'4');
    book9.setAuthor2("hi!");
    book9.setYearPublication((int)(byte)100);
    book9.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str20 = book9.toString();
    book9.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long23 = book9.getAccessionNum();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b24 = book0.Equals(book9);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test54"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum(1000L);
    Book book9 = new Book();
    java.lang.String str10 = book9.getPublisher();
    book9.setPublisher("hi!");
    book9.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    int i15 = book9.getYearPublication();
    boolean b16 = book0.Equals(book9);
    book9.setYearPublication((int)(short)100);
    Book book19 = new Book();
    book19.setAuthor1("");
    java.lang.String str22 = book19.getTitle();
    java.lang.String str23 = book19.getPublisher();
    java.lang.String str24 = book19.getPublisher();
    book19.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b27 = book9.Equals(book19);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test55"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    Book book15 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    java.lang.String str16 = book15.getTitle();
    java.lang.String str17 = book15.toString();
    book15.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = book0.Equals(book15);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test56"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    int i2 = book0.getYearPublication();
    book0.setPublisher("0000000000000");
    java.lang.String str5 = book0.getIsbn();
    java.lang.String str6 = book0.getAuthor1();
    book0.setAccessionNum((long)(short)100);
    java.lang.String str9 = book0.getPublisher();
    long long10 = book0.getAccessionNum();
    book0.setYearPublication((int)(short)-1);
    Book book13 = new Book();
    book13.setAuthor1("");
    java.lang.String str16 = book13.getTitle();
    java.lang.String str17 = book13.getPublisher();
    java.lang.String str18 = book13.getAuthor2();
    java.lang.String str19 = book13.getAuthor1();
    book13.setTitle("hi!");
    book13.setAuthor2("hi!");
    book13.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i26 = book13.getYearPublication();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b27 = book0.Equals(book13);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test57"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    book0.setAuthor1("hi!");
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str11 = book0.getIsbn();
    int i12 = book0.getYearPublication();
    Book book13 = new Book();
    book13.setAuthor1("");
    java.lang.String str16 = book13.getTitle();
    book13.setAuthor1("hi!");
    java.lang.String str19 = book13.getAuthor2();
    book13.setAccessionNum((long)'4');
    book13.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str24 = book13.getAuthor2();
    java.lang.String str25 = book13.toString();
    int i26 = book13.getYearPublication();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b27 = book0.Equals(book13);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test58"); }

    Book book0 = new Book();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long3 = book0.getAccessionNum();
    book0.setYearPublication((-1));
    Book book13 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)10, (int)'a');
    java.lang.String str14 = book13.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = book0.Equals(book13);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test59"); }

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
    book15.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book30 = new Book();
    book30.setAuthor1("");
    java.lang.String str33 = book30.getTitle();
    java.lang.String str34 = book30.getPublisher();
    java.lang.String str35 = book30.getAuthor2();
    java.lang.String str36 = book30.getAuthor1();
    book30.setTitle("hi!");
    book30.setYearPublication((int)(byte)0);
    java.lang.String str41 = book30.getAuthor1();
    long long42 = book30.getAccessionNum();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b43 = book15.Equals(book30);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test60"); }

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
    book23.setAccessionNum((long)'4');
    book23.setAuthor2("hi!");
    Book book30 = new Book();
    book30.setAuthor1("");
    book30.setAccessionNum((long)'4');
    book30.setAuthor2("hi!");
    book30.setAccessionNum((-1L));
    boolean b39 = book23.Equals(book30);
    book30.setPublisher("hi!");
    book30.setYearPublication(0);
    Book book44 = new Book();
    java.lang.String str45 = book44.getPublisher();
    java.lang.String str46 = book44.getTitle();
    book44.setAuthor2("");
    book44.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b51 = book30.Equals(book44);
    java.lang.String str52 = book30.getAuthor2();
    long long53 = book30.getAccessionNum();
    java.lang.String str54 = book30.getAuthor2();
    book30.setYearPublication((int)(short)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b57 = book7.Equals(book30);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test61"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.toString();
    book0.setAccessionNum((long)'#');
    java.lang.String str7 = book0.getTitle();
    java.lang.String str8 = book0.getPublisher();
    Book book9 = new Book();
    int i10 = book9.getYearPublication();
    java.lang.String str11 = book9.getAuthor2();
    java.lang.String str12 = book9.getPublisher();
    java.lang.String str13 = book9.toString();
    int i14 = book9.getYearPublication();
    java.lang.String str15 = book9.toString();
    java.lang.String str16 = book9.toString();
    long long17 = book9.getAccessionNum();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = book0.Equals(book9);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test62"); }

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
    java.lang.String str37 = book26.getIsbn();
    Book book45 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '10' }", "", (long)(byte)10, (int)(short)-1);
    book45.setTitle("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b48 = book26.Equals(book45);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test63"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    int i5 = book0.getYearPublication();
    Book book6 = new Book();
    book6.setAuthor1("");
    book6.setAccessionNum((long)'4');
    book6.setAuthor2("hi!");
    book6.setAuthor1("0000000000000");
    java.lang.String str15 = book6.getTitle();
    book6.setYearPublication((-1));
    java.lang.String str18 = book6.getIsbn();
    java.lang.String str19 = book6.getIsbn();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = book0.Equals(book6);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test64"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    book0.setTitle("");
    java.lang.String str4 = book0.toString();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    long long7 = book0.getAccessionNum();
    book0.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str10 = book0.getAuthor1();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book20 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    java.lang.String str21 = book20.getTitle();
    java.lang.String str22 = book20.toString();
    Book book30 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "", "", 0L, 10);
    book30.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book30.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b35 = book20.Equals(book30);
    book30.setYearPublication((int)(byte)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b38 = book0.Equals(book30);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test65"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    java.lang.String str6 = book0.getAuthor1();
    book0.setTitle("hi!");
    book0.setYearPublication((int)(byte)0);
    Book book18 = new Book("0000000000000", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }", 0L, (int)(byte)10);
    long long19 = book18.getAccessionNum();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = book0.Equals(book18);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test66"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setYearPublication(0);
    book0.setAccessionNum((long)' ');
    java.lang.String str10 = book0.getIsbn();
    book0.setTitle("\n\nBook { Title = '' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book13 = new Book();
    book13.setAuthor1("");
    book13.setAccessionNum((long)'4');
    book13.setAuthor2("hi!");
    Book book20 = new Book();
    book20.setAuthor1("");
    book20.setAccessionNum((long)'4');
    book20.setAuthor2("hi!");
    book20.setAccessionNum((-1L));
    boolean b29 = book13.Equals(book20);
    book20.setTitle("");
    long long32 = book20.getAccessionNum();
    book20.setYearPublication((int)(byte)10);
    java.lang.String str35 = book20.getPublisher();
    java.lang.String str36 = book20.getIsbn();
    java.lang.String str37 = book20.getAuthor1();
    book20.setAccessionNum((long)(short)10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b40 = book0.Equals(book20);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test67"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book0.setIsbn("0000000000000");
    book0.setYearPublication((int)(short)1);
    long long11 = book0.getAccessionNum();
    Book book12 = new Book();
    book12.setAuthor1("");
    book12.setAccessionNum((long)'4');
    book12.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book19 = new Book();
    book19.setAuthor1("");
    Book book22 = new Book();
    int i23 = book22.getYearPublication();
    java.lang.String str24 = book22.getAuthor2();
    boolean b25 = book19.Equals(book22);
    book22.setAccessionNum((long)(short)10);
    boolean b28 = book12.Equals(book22);
    java.lang.String str29 = book12.getTitle();
    book12.setIsbn("0000000000000");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b32 = book0.Equals(book12);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test68"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    book0.setYearPublication((int)(byte)0);
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }");
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
    book18.setTitle("");
    long long30 = book18.getAccessionNum();
    book18.setYearPublication((int)(byte)10);
    java.lang.String str33 = book18.getPublisher();
    book18.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str36 = book18.getTitle();
    java.lang.String str37 = book18.getAuthor2();
    long long38 = book18.getAccessionNum();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b39 = book0.Equals(book18);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test69"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    long long5 = book0.getAccessionNum();
    java.lang.String str6 = book0.getIsbn();
    java.lang.String str7 = book0.getAuthor1();
    java.lang.String str8 = book0.getPublisher();
    book0.setTitle("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '97' }");
    Book book11 = new Book();
    book11.setAuthor1("");
    java.lang.String str14 = book11.getTitle();
    java.lang.String str15 = book11.getPublisher();
    java.lang.String str16 = book11.getAuthor2();
    java.lang.String str17 = book11.getAuthor1();
    book11.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = book0.Equals(book11);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test70"); }

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
    java.lang.String str25 = book15.getTitle();
    java.lang.String str26 = book15.toString();
    book15.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book29 = new Book();
    book29.setAuthor1("");
    java.lang.String str32 = book29.getTitle();
    java.lang.String str33 = book29.getPublisher();
    java.lang.String str34 = book29.getAuthor2();
    java.lang.String str35 = book29.getAuthor1();
    book29.setTitle("hi!");
    book29.setAuthor2("hi!");
    book29.setAuthor1("0000000000000");
    book29.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str44 = book29.getAuthor2();
    book29.setAccessionNum((long)'a');
    book29.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }");
    Book book49 = new Book();
    book49.setAuthor1("");
    java.lang.String str52 = book49.getTitle();
    book49.setAuthor1("hi!");
    java.lang.String str55 = book49.getAuthor2();
    book49.setAccessionNum((long)'4');
    book49.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str60 = book49.getIsbn();
    java.lang.String str61 = book49.getIsbn();
    boolean b62 = book29.Equals(book49);
    book29.setAccessionNum(1L);
    java.lang.String str65 = book29.getPublisher();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b66 = book15.Equals(book29);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test71"); }

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
    book15.setTitle("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book28 = new Book();
    book28.setAuthor1("");
    java.lang.String str31 = book28.getTitle();
    java.lang.String str32 = book28.getPublisher();
    java.lang.String str33 = book28.getAuthor2();
    book28.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book28.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book28.setPublisher("hi!");
    book28.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }");
    book28.setAuthor2("");
    book28.setYearPublication(32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b46 = book15.Equals(book28);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test72"); }

    Book book0 = new Book();
    Book book1 = new Book();
    book1.setAuthor1("");
    book1.setAccessionNum((long)'4');
    book1.setAuthor2("hi!");
    Book book8 = new Book();
    book8.setAuthor1("");
    book8.setAccessionNum((long)'4');
    book8.setAuthor2("hi!");
    book8.setAccessionNum((-1L));
    boolean b17 = book1.Equals(book8);
    java.lang.String str18 = book8.getPublisher();
    java.lang.String str19 = book8.getTitle();
    Book book20 = new Book();
    book20.setAuthor1("");
    java.lang.String str23 = book20.getTitle();
    book20.setAuthor1("hi!");
    book20.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book20.setAuthor1("");
    boolean b30 = book8.Equals(book20);
    java.lang.String str31 = book20.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b32 = book0.Equals(book20);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test73"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    java.lang.String str3 = book0.getAuthor1();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book6 = new Book();
    book6.setAuthor1("");
    book6.setAccessionNum((long)'4');
    book6.setAuthor2("hi!");
    book6.setAccessionNum((-1L));
    book6.setAuthor1("hi!");
    java.lang.String str17 = book6.toString();
    java.lang.String str18 = book6.getIsbn();
    java.lang.String str19 = book6.getAuthor1();
    Book book20 = new Book();
    book20.setAuthor1("");
    book20.setAccessionNum((long)'4');
    book20.setAuthor2("hi!");
    java.lang.String str27 = book20.getTitle();
    book20.setAccessionNum(0L);
    book20.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book20.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book41 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", 0L, (int)(short)0);
    Book book42 = new Book();
    book42.setAuthor1("");
    book42.setAccessionNum((long)'4');
    book42.setAuthor2("hi!");
    Book book49 = new Book();
    book49.setAuthor1("");
    book49.setAccessionNum((long)'4');
    book49.setAuthor2("hi!");
    book49.setAccessionNum((-1L));
    boolean b58 = book42.Equals(book49);
    book49.setTitle("");
    long long61 = book49.getAccessionNum();
    book49.setYearPublication((int)(byte)10);
    java.lang.String str64 = book49.getTitle();
    book49.setAccessionNum(1000L);
    java.lang.String str67 = book49.getPublisher();
    Book book68 = new Book();
    book68.setAuthor1("");
    java.lang.String str71 = book68.getTitle();
    java.lang.String str72 = book68.getPublisher();
    java.lang.String str73 = book68.getAuthor2();
    book68.setYearPublication(0);
    java.lang.String str76 = book68.getIsbn();
    boolean b77 = book49.Equals(book68);
    int i78 = book68.getYearPublication();
    boolean b79 = book41.Equals(book68);
    book41.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    boolean b82 = book20.Equals(book41);
    book20.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b85 = book6.Equals(book20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b86 = book0.Equals(book20);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test74"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    book0.setYearPublication((int)(short)100);
    Book book11 = new Book("", "", "hi!", "", "hi!", (long)'4', (int)(byte)100);
    book11.setPublisher("hi!");
    Book book14 = new Book();
    book14.setAuthor1("");
    book14.setAccessionNum((long)'4');
    book14.setAuthor2("hi!");
    book14.setAccessionNum((-1L));
    book14.setAuthor2("0000000000000");
    boolean b25 = book11.Equals(book14);
    book11.setPublisher("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b28 = book0.Equals(book11);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test75"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAccessionNum(1000L);
    Book book9 = new Book();
    int i10 = book9.getYearPublication();
    int i11 = book9.getYearPublication();
    book9.setPublisher("0000000000000");
    java.lang.String str14 = book9.getIsbn();
    boolean b15 = book0.Equals(book9);
    java.lang.String str16 = book9.getPublisher();
    book9.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '32' }");
    Book book19 = new Book();
    java.lang.String str20 = book19.getAuthor2();
    book19.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str23 = book19.getIsbn();
    java.lang.String str24 = book19.toString();
    java.lang.String str25 = book19.getPublisher();
    book19.setAuthor2("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b28 = book9.Equals(book19);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test76"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setYearPublication((-1));
    java.lang.String str7 = book0.getIsbn();
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    book0.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    Book book14 = new Book();
    book14.setAuthor1("");
    java.lang.String str17 = book14.getTitle();
    java.lang.String str18 = book14.getPublisher();
    java.lang.String str19 = book14.getAuthor2();
    book14.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book14.setPublisher("0000000000000");
    book14.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b26 = book0.Equals(book14);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test77"); }

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
    java.lang.String str29 = book7.toString();
    int i30 = book7.getYearPublication();
    Book book31 = new Book();
    book31.setAuthor1("");
    book31.setAccessionNum((long)'4');
    book31.setAuthor2("hi!");
    Book book38 = new Book();
    book38.setAuthor1("");
    book38.setAccessionNum((long)'4');
    book38.setAuthor2("hi!");
    book38.setAccessionNum((-1L));
    boolean b47 = book31.Equals(book38);
    book38.setTitle("");
    long long50 = book38.getAccessionNum();
    java.lang.String str51 = book38.getTitle();
    long long52 = book38.getAccessionNum();
    java.lang.String str53 = book38.getAuthor1();
    java.lang.String str54 = book38.getAuthor2();
    java.lang.String str55 = book38.getPublisher();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b56 = book7.Equals(book38);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test78"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    book0.setAccessionNum((long)(byte)-1);
    java.lang.String str7 = book0.toString();
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    java.lang.String str10 = book0.toString();
    int i11 = book0.getYearPublication();
    book0.setYearPublication(100);
    java.lang.String str14 = book0.getIsbn();
    Book book22 = new Book("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (long)10, (int)'4');
    java.lang.String str23 = book22.toString();
    java.lang.String str24 = book22.getAuthor1();
    java.lang.String str25 = book22.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b26 = book0.Equals(book22);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test79"); }

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
    Book book15 = new Book();
    java.lang.String str16 = book15.getAuthor2();
    java.lang.String str17 = book15.getAuthor1();
    boolean b18 = book0.Equals(book15);
    Book book26 = new Book("hi!", "\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", (-1L), 100);
    Book book27 = new Book();
    book27.setAuthor1("");
    java.lang.String str30 = book27.getTitle();
    book27.setAuthor1("hi!");
    java.lang.String str33 = book27.getAuthor2();
    book27.setAccessionNum((long)'4');
    book27.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str38 = book27.getIsbn();
    java.lang.String str39 = book27.getIsbn();
    boolean b40 = book26.Equals(book27);
    java.lang.String str41 = book27.getAuthor1();
    java.lang.String str42 = book27.getIsbn();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b43 = book15.Equals(book27);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test80"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    Book book3 = new Book();
    int i4 = book3.getYearPublication();
    java.lang.String str5 = book3.getAuthor2();
    boolean b6 = book0.Equals(book3);
    book3.setAccessionNum((long)(byte)10);
    book3.setIsbn("");
    int i11 = book3.getYearPublication();
    java.lang.String str12 = book3.getPublisher();
    Book book20 = new Book("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '52' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '0' }", "\n\nBook { Title = '\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '0' }", (long)52, (int)(short)100);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b21 = book3.Equals(book20);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test81"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    book0.setAccessionNum((long)'4');
    long long5 = book0.getAccessionNum();
    book0.setPublisher("");
    book0.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str10 = book0.toString();
    book0.setYearPublication((int)'4');
    Book book20 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '100' \nISBN = '0000000000000' \nAccession Number = '52' }", "hi!", 0L, (int)(short)0);
    Book book21 = new Book();
    book21.setAuthor1("");
    book21.setAccessionNum((long)'4');
    book21.setAuthor2("hi!");
    Book book28 = new Book();
    book28.setAuthor1("");
    book28.setAccessionNum((long)'4');
    book28.setAuthor2("hi!");
    book28.setAccessionNum((-1L));
    boolean b37 = book21.Equals(book28);
    book28.setTitle("");
    long long40 = book28.getAccessionNum();
    book28.setYearPublication((int)(byte)10);
    java.lang.String str43 = book28.getTitle();
    book28.setAccessionNum(1000L);
    java.lang.String str46 = book28.getPublisher();
    Book book47 = new Book();
    book47.setAuthor1("");
    java.lang.String str50 = book47.getTitle();
    java.lang.String str51 = book47.getPublisher();
    java.lang.String str52 = book47.getAuthor2();
    book47.setYearPublication(0);
    java.lang.String str55 = book47.getIsbn();
    boolean b56 = book28.Equals(book47);
    int i57 = book47.getYearPublication();
    boolean b58 = book20.Equals(book47);
    int i59 = book47.getYearPublication();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b60 = book0.Equals(book47);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test82"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    book0.setAccessionNum((long)(byte)-1);
    Book book8 = new Book();
    book8.setAuthor1("");
    book8.setAccessionNum((long)'4');
    book8.setAuthor2("hi!");
    book8.setAccessionNum((-1L));
    book8.setAuthor2("0000000000000");
    book8.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    java.lang.String str21 = book8.getIsbn();
    int i22 = book8.getYearPublication();
    book8.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b25 = book0.Equals(book8);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test83"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    book0.setAccessionNum(32L);
    java.lang.String str5 = book0.getAuthor2();
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    Book book15 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }", 10L, (int)(short)-1);
    book15.setAccessionNum(32L);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = book0.Equals(book15);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test84"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    java.lang.String str4 = book0.toString();
    int i5 = book0.getYearPublication();
    java.lang.String str6 = book0.toString();
    java.lang.String str7 = book0.getPublisher();
    java.lang.String str8 = book0.getAuthor1();
    book0.setYearPublication((int)'a');
    long long11 = book0.getAccessionNum();
    Book book12 = new Book();
    book12.setAuthor1("");
    book12.setAccessionNum((long)'4');
    book12.setAuthor2("hi!");
    book12.setAuthor1("0000000000000");
    java.lang.String str21 = book12.getIsbn();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b22 = book0.Equals(book12);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test85"); }

    Book book0 = new Book();
    book0.setAuthor1("");
    java.lang.String str3 = book0.getTitle();
    java.lang.String str4 = book0.getPublisher();
    java.lang.String str5 = book0.getAuthor2();
    book0.setYearPublication(0);
    book0.setAccessionNum((long)' ');
    java.lang.String str10 = book0.getIsbn();
    int i11 = book0.getYearPublication();
    java.lang.String str12 = book0.getAuthor2();
    Book book13 = new Book();
    book13.setAuthor1("");
    java.lang.String str16 = book13.getTitle();
    java.lang.String str17 = book13.getPublisher();
    java.lang.String str18 = book13.getAuthor2();
    java.lang.String str19 = book13.getAuthor1();
    book13.setTitle("hi!");
    book13.setAuthor2("hi!");
    java.lang.String str24 = book13.getPublisher();
    book13.setIsbn("");
    java.lang.String str27 = book13.toString();
    java.lang.String str28 = book13.getPublisher();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b29 = book0.Equals(book13);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test86"); }

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
    Book book34 = new Book();
    book34.setAuthor1("");
    book34.setAccessionNum((long)'4');
    book34.setAuthor2("hi!");
    Book book41 = new Book();
    book41.setAuthor1("");
    book41.setAccessionNum((long)'4');
    book41.setAuthor2("hi!");
    book41.setAccessionNum((-1L));
    boolean b50 = book34.Equals(book41);
    book41.setTitle("");
    long long53 = book41.getAccessionNum();
    book41.setYearPublication((int)(byte)10);
    java.lang.String str56 = book41.getTitle();
    book41.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str59 = book41.getPublisher();
    book41.setAccessionNum((long)100);
    java.lang.String str62 = book41.getPublisher();
    Book book63 = new Book();
    int i64 = book63.getYearPublication();
    boolean b65 = book41.Equals(book63);
    book63.setYearPublication((int)(byte)1);
    boolean b68 = book19.Equals(book63);
    java.lang.String str69 = book63.getTitle();
    Book book77 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = 'null' \nAccession Number = '10' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '10' }", (long)10, (int)(short)1);
    Book book78 = new Book();
    book78.setAuthor1("");
    java.lang.String str81 = book78.getTitle();
    java.lang.String str82 = book78.getPublisher();
    java.lang.String str83 = book78.getAuthor2();
    java.lang.String str84 = book78.getAuthor1();
    book78.setTitle("hi!");
    book78.setAuthor2("hi!");
    java.lang.String str89 = book78.getPublisher();
    book78.setIsbn("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    java.lang.String str92 = book78.getAuthor2();
    java.lang.String str93 = book78.getAuthor2();
    boolean b94 = book77.Equals(book78);
    book77.setTitle("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 1 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '35' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b97 = book63.Equals(book77);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test87"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    book0.setAccessionNum(32L);
    java.lang.String str5 = book0.getAuthor2();
    book0.setIsbn("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setYearPublication((int)(byte)100);
    Book book17 = new Book("\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '97' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '10' \nISBN = 'null' \nAccession Number = '1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)(byte)-1, (int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b18 = book0.Equals(book17);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test88"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    int i2 = book0.getYearPublication();
    book0.setPublisher("0000000000000");
    book0.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAccessionNum((long)'a');
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    book0.setAuthor2("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book13 = new Book();
    int i14 = book13.getYearPublication();
    int i15 = book13.getYearPublication();
    book13.setPublisher("0000000000000");
    java.lang.String str18 = book13.getIsbn();
    java.lang.String str19 = book13.getAuthor1();
    book13.setAccessionNum((long)(short)100);
    boolean b22 = book0.Equals(book13);
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
    book30.setIsbn("0000000000000");
    java.lang.String str45 = book30.getTitle();
    book30.setYearPublication((int)(byte)-1);
    book30.setAccessionNum((long)52);
    java.lang.String str50 = book30.getAuthor1();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b51 = book13.Equals(book30);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test89"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    book0.setAccessionNum((long)10);
    book0.setYearPublication((int)(short)100);
    Book book9 = new Book();
    int i10 = book9.getYearPublication();
    int i11 = book9.getYearPublication();
    book9.setPublisher("0000000000000");
    java.lang.String str14 = book9.getIsbn();
    java.lang.String str15 = book9.getAuthor1();
    book9.setAccessionNum(32L);
    java.lang.String str18 = book9.getPublisher();
    java.lang.String str19 = book9.getTitle();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b20 = book0.Equals(book9);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test90"); }

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
    java.lang.String str26 = book15.getAuthor2();
    java.lang.String str27 = book15.getPublisher();
    java.lang.String str28 = book15.getAuthor1();
    Book book29 = new Book();
    book29.setAuthor1("");
    java.lang.String str32 = book29.getTitle();
    java.lang.String str33 = book29.getPublisher();
    java.lang.String str34 = book29.getAuthor2();
    java.lang.String str35 = book29.getAuthor1();
    book29.setTitle("hi!");
    book29.setAuthor2("hi!");
    java.lang.String str40 = book29.getAuthor1();
    book29.setIsbn("\n\nBook { Title = '\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b43 = book15.Equals(book29);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test91"); }

    Book book0 = new Book();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    long long3 = book0.getAccessionNum();
    book0.setAccessionNum(35L);
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book8 = new Book();
    java.lang.String str9 = book8.getPublisher();
    java.lang.String str10 = book8.getIsbn();
    int i11 = book8.getYearPublication();
    int i12 = book8.getYearPublication();
    book8.setYearPublication((int)(byte)-1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b15 = book0.Equals(book8);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test92"); }

    Book book0 = new Book();
    book0.setAccessionNum(0L);
    java.lang.String str3 = book0.getAuthor2();
    long long4 = book0.getAccessionNum();
    book0.setTitle("\n\nBook { Title = '' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setAccessionNum((long)'4');
    Book book16 = new Book("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = 'hi!' \nAuthor 2 = '' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '0000000000000' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }", (long)100, 52);
    Book book24 = new Book("hi!", "", "hi!", "", "0000000000000", (long)1, 100);
    book24.setYearPublication(0);
    java.lang.String str27 = book24.toString();
    java.lang.String str28 = book24.getIsbn();
    java.lang.String str29 = book24.getAuthor2();
    book24.setIsbn("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book24.setAuthor1("\n\nBook { Title = 'null' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }");
    boolean b34 = book16.Equals(book24);
    java.lang.String str35 = book16.toString();
    book16.setAccessionNum(0L);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b38 = book0.Equals(book16);

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test93"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getAuthor2();
    int i2 = book0.getYearPublication();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book0.setTitle("");
    java.lang.String str7 = book0.toString();
    java.lang.String str8 = book0.getTitle();
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nAuthor 1 = 'hi!' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book18 = new Book("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '52' \nISBN = '0000000000000' \nAccession Number = '1000' }", "\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }", "", "\n\nBook { Title = '' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = '\n\nBook { Title = 'hi!' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '-1' }' \nPublisher = '0000000000000' \nYear Of Publication = '-1' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '10' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '100' }", "\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = '\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }", (-1L), 52);
    book18.setPublisher("\n\nBook { Title = 'hi!' \nAuthor 1 = '0000000000000' \nAuthor 2 = 'hi!' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '97' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b21 = book0.Equals(book18);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test94"); }

    Book book0 = new Book();
    long long1 = book0.getAccessionNum();
    Book book2 = new Book();
    book2.setAuthor1("");
    book2.setAccessionNum((long)'4');
    book2.setAuthor2("hi!");
    book2.setAuthor1("0000000000000");
    java.lang.String str11 = book2.getIsbn();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b12 = book0.Equals(book2);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test95"); }

    Book book0 = new Book();
    int i1 = book0.getYearPublication();
    java.lang.String str2 = book0.getAuthor2();
    java.lang.String str3 = book0.getPublisher();
    book0.setYearPublication((int)'a');
    int i6 = book0.getYearPublication();
    java.lang.String str7 = book0.getAuthor2();
    java.lang.String str8 = book0.getTitle();
    java.lang.String str9 = book0.getIsbn();
    Book book10 = new Book();
    book10.setAuthor1("");
    java.lang.String str13 = book10.getPublisher();
    java.lang.String str14 = book10.getAuthor2();
    java.lang.String str15 = book10.getAuthor1();
    java.lang.String str16 = book10.toString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = book0.Equals(book10);

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test96"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getAuthor1();
    java.lang.String str3 = book0.getAuthor1();
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setPublisher("\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nAuthor 1 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 2 = '\n\nBook { Title = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nAuthor 1 = '0000000000000' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '52' }' \nPublisher = '\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }' \nPublisher = '\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = 'hi!' \nYear Of Publication = '1' \nISBN = 'null' \nAccession Number = '-1' }' \nYear Of Publication = '-1' \nISBN = 'null' \nAccession Number = '97' }");
    book0.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = '\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    Book book10 = new Book();
    java.lang.String str11 = book10.getAuthor2();
    int i12 = book10.getYearPublication();
    book10.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book10.setTitle("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b17 = book0.Equals(book10);

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test97"); }

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
    Book book27 = new Book();
    book27.setAuthor1("");
    java.lang.String str30 = book27.getTitle();
    book27.setAuthor1("hi!");
    book27.setAuthor2("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book27.setAuthor1("");
    java.lang.String str37 = book27.getAuthor1();
    java.lang.String str38 = book27.getTitle();
    book27.setAuthor1("\n\nBook { Title = '' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '100' \nISBN = 'null' \nAccession Number = '52' }");
    Book book41 = new Book();
    java.lang.String str42 = book41.getAuthor2();
    int i43 = book41.getYearPublication();
    book41.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    book41.setTitle("");
    boolean b48 = book27.Equals(book41);
    book41.setYearPublication(10);
    book41.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = 'hi!' \nAuthor 2 = 'hi!' \nPublisher = 'null' \nYear Of Publication = '32' \nISBN = '0000000000000' \nAccession Number = '-1' }");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b53 = book15.Equals(book41);

  }

  @Test
  public void test98() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test98"); }

    Book book0 = new Book();
    java.lang.String str1 = book0.getPublisher();
    java.lang.String str2 = book0.getTitle();
    book0.setAuthor2("");
    java.lang.String str5 = book0.getAuthor2();
    book0.setPublisher("");
    java.lang.String str8 = book0.getPublisher();
    book0.setPublisher("\n\nBook { Title = 'null' \nAuthor 1 = 'null' \nAuthor 2 = 'null' \nPublisher = 'hi!' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    book0.setYearPublication((int)'a');
    Book book13 = new Book();
    book13.setAuthor1("");
    book13.setAccessionNum((long)'4');
    book13.setAuthor2("hi!");
    Book book20 = new Book();
    book20.setAuthor1("");
    book20.setAccessionNum((long)'4');
    book20.setAuthor2("hi!");
    book20.setAccessionNum((-1L));
    boolean b29 = book13.Equals(book20);
    book20.setTitle("");
    long long32 = book20.getAccessionNum();
    book20.setYearPublication((int)(byte)10);
    java.lang.String str35 = book20.getTitle();
    book20.setTitle("\n\nBook { Title = 'hi!' \nAuthor 1 = '' \nAuthor 2 = 'hi!' \nPublisher = '' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1' }");
    java.lang.String str38 = book20.getPublisher();
    book20.setAccessionNum((long)100);
    Book book41 = new Book();
    book41.setAuthor1("");
    book41.setAccessionNum((long)'4');
    book41.setAccessionNum((long)(byte)-1);
    java.lang.String str48 = book41.toString();
    boolean b49 = book20.Equals(book41);
    book20.setYearPublication(0);
    Book book52 = new Book();
    book52.setAuthor1("");
    book52.setAccessionNum((long)'4');
    book52.setAuthor2("hi!");
    book52.setAccessionNum((-1L));
    book52.setAuthor1("hi!");
    Book book63 = new Book();
    java.lang.String str64 = book63.getPublisher();
    book63.setPublisher("hi!");
    java.lang.String str67 = book63.getTitle();
    book63.setTitle("\n\nBook { Title = 'null' \nAuthor 1 = '' \nAuthor 2 = 'null' \nPublisher = 'null' \nYear Of Publication = '0' \nISBN = '0000000000000' \nAccession Number = '1000' }");
    boolean b70 = book52.Equals(book63);
    boolean b71 = book20.Equals(book52);
    java.lang.String str72 = book20.getPublisher();
    long long73 = book20.getAccessionNum();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b74 = book0.Equals(book20);

  }

}
