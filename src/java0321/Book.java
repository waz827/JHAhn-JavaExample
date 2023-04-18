package java0321;

public class Book {
    String title;
    String author;
    String publisher;
    int price;

    void show(){
        System.out.println(title+author+publisher+price);
    }
    public Book(){
        this("할로", "홍길동");

    }
    public Book(String title){
        this(title,"  작자미상");
        System.out.println("1");
    }
    public Book(String title, String author){
        this(title, "이","dd");
        System.out.println("2");
    }
    public Book(String title, String author, String publisher){
        this(title,author,publisher,30000);
        System.out.println("3");
    }
    public Book(String title, String author, String publisher, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        System.out.println("4");
    }
    public static void main(String[] args) {

        Book emptyBook1= new Book("dfasd","sdfasdf");
        emptyBook1.show();
    }
}
