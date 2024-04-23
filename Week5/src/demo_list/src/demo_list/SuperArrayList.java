package src.demo_list;

import java.util.ArrayList;
import java.util.List;

public class SuperArrayList extends ArrayList<Book> {

  public void inserHead(Book book){
    List<Book> books = super.subList(0, super.size()-1);


  }
  
}
