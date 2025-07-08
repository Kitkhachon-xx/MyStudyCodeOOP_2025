package Author;
public class BookTest {
    public static void main(String[] args) {
    Author a = new Author("CK","oakabc@gmail.com",'M');
        System.out.println(a);
    Book b = new Book ("My name is CK", a, 100);
        System.out.println(b);

    Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // toString()

    Book book1 = new Book("HARRY POTTER 1-3 (BOX SET)", new Author("J.K. ROWLING", "J.K. ROWLING@unknow.com", 'm'),3420 );
        System.out.println(book1);

    Book book2 = new Book("A-LEVEL BIOLOGY MOCK-UP EXAMS II", new Author("Suphanat Pairogun", " Suphanat@gmail.Unknow", 'f'), 251, 10);
        System.out.println(book2);

    Book book3 = new Book("PHYSICS FOR SCIENTISTS AND ENGINEERS I", new Author("RAYMO.ND A.SERWAY", "RAYMOND@gmail.Unkonw", 'm'), 495);
        System.out.println(book3);
    }
}
