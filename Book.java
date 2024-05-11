import java.util.*;
/** Represents a book object with its details.
    @author Sajeda Hasan Isa 202100743
 */

public class Book {
        // data members
        String title,author1,author2,publisher,isbn;
        long accessionNum;
        int yearPublication;

    /** constructors*/
        // default constructor
        public Book()
        {
            title=author1=author2=publisher=null;
            isbn="0000000000000"; //13 digits number assigned by the publisher(barcode)
            accessionNum=1000; // unique number for the library to keep tracking , default value is 1001
            yearPublication=0;
        }

        //constructor with 6 parameters (except for issuedTo)
        public Book(String T,String A1,String A2,String P,String ISBN,long AN,int YEAR)
        {
            title=T; author1=A1; author2=A2; publisher=P; accessionNum=AN; yearPublication=YEAR;
            setIsbn(ISBN);  
        }


        // getters
        public String getTitle() {return title;}
        public int getYearPublication() {return yearPublication;}
        public long getAccessionNum() {return accessionNum;}
        public String getIsbn() {return isbn;}
        public String getPublisher() {return publisher;}
        public String getAuthor2() {return author2;}
        public String getAuthor1() {return author1;}


        //setters
        public void setTitle(String title) {this.title = title;}
        public void setYearPublication(int yearPublication) {this.yearPublication = yearPublication;}
        public void setAccessionNum(long accessionNum) {this.accessionNum = accessionNum;}
        public void setIsbn(String isbn) {
             try{
                 if(isbn.length()==13) //Checking for validity
                this.isbn = isbn;
                else throw new Exception("Invalid value for isbn.\n Book has not been added.");
             } catch(Exception e){
                 System.out.println(e);
             }
        }
        public void setAuthor1(String author1) {this.author1 = author1;}
        public void setPublisher(String publisher) {this.publisher = publisher;}
        public void setAuthor2(String author2) {this.author2 = author2;}


        // public methods
        public String toString()
        {
                return "\n\nBook { Title = '" + title + "' \nAuthor 1 = '" + author1 +
                        "' \nAuthor 2 = '" + author2 + "' \nPublisher = '" + publisher +
                        "' \nYear Of Publication = '" + yearPublication + "' \nISBN = '" +
                        isbn + "' \nAccession Number = '" + accessionNum + "' }";
        }
     
    /**
     // method to compare this book with another book in the parameter
     // @param Obj2 ,another book to compare with  .

     */
        public boolean Equals(Book Obj2) {
            if(this == Obj2) return true;
            if(Obj2 == null) return false;
            if(! this.getAuthor1().equalsIgnoreCase(Obj2.getAuthor1())) return false;
            else if(!this.getAuthor2().equalsIgnoreCase(Obj2.getAuthor2())) return false;
            else if(this.getAccessionNum() != Obj2.getAccessionNum()) return false;
            else if(! this.getPublisher().equalsIgnoreCase(Obj2.getPublisher())) return false;
            else if(! this.getTitle().equalsIgnoreCase(Obj2.getTitle()) ) return false;
            else if(this.getYearPublication() != Obj2.getYearPublication()) return false;
            else if(! this.getIsbn().equalsIgnoreCase(Obj2.getIsbn())) return false;
            return true;
        }

    } //end of class