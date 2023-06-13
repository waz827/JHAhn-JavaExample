package java0523.object;
class Book{
    int bookNum;
    String bookTitle;
    Book(int bookNum, String bookTitle){
        this.bookNum=bookNum;
        this.bookTitle=bookTitle;

    }
    @Override
    public String toString(){
        return bookTitle + ", "+ bookNum;
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        Book book= new Book(200,"JavaExample");

        System.out.println(book);
        System.out.println(book.toString());
    }
}
