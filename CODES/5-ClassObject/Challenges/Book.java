package _6ClassObject.Challenges;

public class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks=0;
    }

    {
        totalNoOfBooks++;
        isBorrowed=false;
    }
    static int getTotalBooks(){
        return totalNoOfBooks;
    }
    Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    void borrowBook(){
        if(isBorrowed)
            System.out.println("This book is already borrowed");
        else{
            isBorrowed=true;
            System.out.println("Enjoy, "+title);
        }
    }
    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Hope you enjoyed the book, Please leave a review");
        } else
            System.out.println("This book is not borrowed");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Krishn Library\n");
        Book javaInDepth=new Book("101","javaInDepth","Prashant");
        Book myBook=new Book("102");
        System.out.println(Book.getTotalBooks());
        javaInDepth.borrowBook();
        javaInDepth.borrowBook();
        javaInDepth.returnBook();
        myBook.borrowBook();
        myBook.returnBook();
        myBook.returnBook();
    }
}
