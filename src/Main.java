import java.util.Scanner;
public class Main {
Scanner enter = new Scanner(System.in);
    public static void main (String []args ){
Book b1= new Book ("Dune", "Frank Herbert", "111", 1965);
        Book b2= new Book ("1984", "George Orwell", "222", 1949);
        System.out.println(b1.getAuthor());
        System.out.println(b2.getAuthor());
        System.out.println(b1.toString());

        Member m1 = new Member(1, "Yamen");

        System.out.println(m1);              // Yamen (ID: 1) - holding 0 book(s)
        m1.addBook(b1);
        System.out.println(m1);              // Yamen (ID: 1) - holding 1 book(s)
        System.out.println(m1.canBorrow());  // true
    }
}
