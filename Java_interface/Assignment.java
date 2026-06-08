import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.HashMap;
import java.util.ArrayList;
class Book {
    Book(String id,String category, String title,String publisher){
        this.id=id;
        this.category=category;
        this.title=title;
        this.publisher=publisher;
    }
    private String id;
    private String category;
    private String title;
    private String publisher;

    String getId(){
        return id;
    }

    String getCategory(){
        return category;
    }

    String getTitle(){
        return title;
    }

    String getPublisher(){
        return publisher;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id != null && id.equals(book.id);
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
class Student{
    Student(String id,String name){
        this.Uid=id;
        this.name=name;
    }
    private String Uid;
    private String name;
    String getUid(){
        return Uid;
    }
    String getname() {
        return name;
    }
}

class Library{
    private HashMap<String,Book>Books=new HashMap<>();
    private  HashMap<Book,Student>Issued=new HashMap<>();

    public Book IssueBook(String Bookid,Student student){
        Book st = Books.get(Bookid);
        if(st != null){
            return null;
        }
        Issued.put(Books.get(Bookid),student);
        return Books.get(Bookid);
    }

    public Book placeBook(Book book){
        Books.put(book.getId(),book);
        return book;
    }
    public Book searchBook(String BookId){
        return Books.get(BookId);
    }
    public Book removeIssue(Book book,Student student){
        Student removed=Issued.get(book);
        if(removed==null) return null;
        Issued.remove(book);
        return book;
    }
}
public class Assignment {
    public static void main(String args[]){
        Library library=new Library();
       Book b= library.placeBook(new Book("1","fiction","game of thrones","martin"));
        System.out.println(b.getId()+b.getCategory()+b.getTitle());
        Student studnet=new Student("12984","sarthak arora");
        Book issued_book=library.IssueBook(b.getId(),studnet);
    }
}
