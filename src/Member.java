import java.util.ArrayList;
public class Member {
    private  int id;
    private String name ;
    private ArrayList<Book>borrowedBooks;

    public Member ( int serial , String name){
        id=serial ;
        this.name=name;
        this.borrowedBooks= new ArrayList<>();
    }

    public int getId(){

        return id;
    }
public String getName() {

        return name;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void addBook(Book book){
        borrowedBooks.add(book);
    }
    public void removeBook(Book book){
        borrowedBooks.remove(book);
    }
    public boolean canBorrow(){
        return borrowedBooks.size() < 3;
    }
    @Override
    public String toString(){
         return name + " (ID: " + id + ") - holding " + borrowedBooks.size() + " book(s)";
    }

    }
