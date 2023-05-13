package Java.S3;

public class Book{
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String toString(){
        return this.title + " " + this.author + " " + this.isbn;
    }

}