package Java.S3;

import java.util.*;
import Java.S3.Book;;

public class Booklist {
    
    final static Book BOOK_1 = new Book("Bird Songs 1", "David Camper", "234749839834598435CXXD");
    final static Book BOOK_2 = new Book("Bird Songs 2", "David-2 Camper", "2-234749adfdfc9834598435CXXD");
    final static Book BOOK_3 = new Book("Bird Songs 3", "David-3 Camper", "3-234749839834598435CXXD");
    final static Book BOOK_4 = new Book("Bird Songs 4", "David-4 Camper", "4-234749839834598435CXXD");
    final static Book BOOK_5 = new Book("Bird Songs 5", "David-5 Camper", "5-234749839834598435CXXD");
    
    private List<Book> _bookList = new ArrayList<Book>();

    public static void main(String[] args) throws Exception {
    
        Booklist blist = new Booklist();
        
        blist.add(BOOK_1);
        blist.add(BOOK_2);
        blist.add(BOOK_5);
        List<Book> bookList = blist.getList();
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i).toString());
        }

        blist.add(BOOK_3);
        blist.add(BOOK_4);
        // bookList = blist.getList(); WHY NOT CALLING THIS getList() again?
        /**
         * the list object (A) returned by blist.getList() is created in Heap memory. (i.e. Booklist._bookList)
         * bookList (B) is just a reference  pointing to the object A, and B is created in Stack memory.
         * So, when object A is updated, pointer B can still access and get new value of object A.
         * 
         * Primitive Data TYpes: int, double, float, char, etc..... -> not pointer
         * 
         * Others: string, struct, class, list, collections. --> pointer
         */
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i).toString());
        }

        return;
    }
    
    public void add(Book b){
        this._bookList.add(b);
    } 
    
    public void delete(Book b){
        this._bookList.remove(b);
    }
    
    public List<Book> getList(){
        return _bookList;
    }
}
