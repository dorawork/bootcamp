package Week6.Demonastedclass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Library {

  private List<Book> books; //= new LinkedList<>(); // 分別?

  public Library() {
    this.books = new LinkedList<>(); // 分別??
  }

  public void add(Book book) {
    this.books.add(book);
  }

  public class BookIterator implements Iterator<Book> {
    private int currentIdx = 0;

    @Override
    public boolean hasNext() {
      return this.currentIdx < books.size();
    }

    @Override
    public Book next() {
      if (!hasNext())
        throw new IllegalArgumentException("No more element in the list");
      return books.get(currentIdx++);
    }
  }

  public static class Book {
    private String isbn;
    private String author;

    public Book(String isbn, String author) {
      this.isbn = isbn;
      this.author = author;
    }

    public String getIsbn(){
      return this.isbn;
    }

    public String getAuthor(){
      return this.author;
    }

    public static void main(String[] args) { // LOOP書下一本, 搵番CLASS
      Library library = new Library();
      library.add(new Library.Book("1234", "John Smith"));
      library.add(new Library.Book("2345", "Peter Lau"));
      library.add(new Library.Book("3456", "Vincent Cheng"));
  
      Library.BookIterator lb = library.new BookIterator();
      while (lb.hasNext()) {
        Library.Book book = lb.next();
        System.out.println(book.getIsbn() + " " + book.getAuthor());
      }

  }
}
}
