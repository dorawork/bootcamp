package demo_list.demo_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private double price;
    private String author;

    public Book(double price, String author){
        this.price=price;
        this.author=author;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean equals(Object obj){
        if (this == obj)
        return  true;
        if(!(obj instanceof Book))
        return false;
        Book book = (Book) obj;
        return Objects.equals(this.author, book.getAuthor())
        && Objects.equals(this.price, book.getPrice());
    }

    public String toString(){
        return "Book("
                  + "author=" + this.author//
                  + " ,price=" + this.price//
                  + ")";
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.price, this.author);
    }

    public static void main(String[] args) throws Exception {
        //Book Array 放book
        Book [] books =new Book [2]; //intested method new 左先call 限制大細
        books[0] = new Book(10.2d, "Vincent");
        books[1] = new Book(8.4d, "Jenny");

        System.out.println(books[0].getAuthor());

        //Array list
        ArrayList<Book>books2 = new ArrayList<>(); //右手邊唔洗容量 無限 開array
        books2.add(new Book(3.4d,"Sally"));
        books2.add(new Book(3.6d,"Vincent"));
        System.out.println(books2.size()); //2

        //比較 contains array list 有冇本書? 地址 Object分別
        System.out.println(books2.contains(new Book(3.6d, "Vincent"))); //true

        //remove()

        books2.remove(new Book(3.6d, "Vincent"));
        System.out.println(books2);

        books2.set(0, new Book(20.3, "Oscar"));
        System.out.println(books2);

        System.out.println(books2.get(0));

        //Initialize with objects
        ArrayList<Book> books3 = new ArrayList<>(
            List.of(new Book(10.3, "Katie"), new Book(20.1,"Vincent")));

            List<Book> books4 = //冇Object loop可以用 
            List.of(new Book(10.3, "Katie"), new Book(20.1,"Vincent"));

            System.out.println(books3.size()); //2
            System.out.println(books4.size()); //2

            books3.add(new Book(10.9, "Cherry"));
            books4.add(new Book(10.9, "Oscar")); //ERROR
    }
}
