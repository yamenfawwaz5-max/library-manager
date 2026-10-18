public class Book {
    // fields
    private String title ;
    private String author;
    private String isbn;
    private int year ;
    private boolean available;
 //constructer
    public Book ( String title , String author ,String isbn, int year ){
        this.title= title;
        this.author = author;
        this.isbn=isbn;
        this.year=year;
        this.available = true;
    }
    public String getTitle(){
        return title;
    }
public String getAuthor(){
        return author;
}
    public String getIsbn(){
        return isbn ;
    }

    public int getYear(){
        return year;
    }
    public boolean isAvailabel(){
        return available;
    }
@Override
    public String toString(){
        String  status;
    if (available) {
        status = "Available";
    } else {
        status = "Borrowed";
    }
    return "the book : " + title + ", author is "+ author + " ,it is " + status ;

}


}
