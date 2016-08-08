import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
  
 	public static void main(String[] args) {
   	
    
    List<String> book = new ArrayList<>();
    book.add("Deepika");
    book.add("Dinesh");
    book.add("Jimmy dog");
    
    System.out.println("Original order of List: " + book);
    
    Collections.reverse(books);
    
    System.out.println("The reversed List: " + book);
    
    
    List<String> output = reverseListRecursively(book);
    System.out.println("Reversed list reversed again: " + output);
  }
  
  private static List<String> reverseListRecursively(List<String> list) {
    if (list.size() <= 1) {
      return list;
    }
    
    List<String> reversed = new ArrayList<>();
    reversed.add(list.get(list.size() - 1)); // last element
    reversed.addAll(reverseListRecursively(list.subList(0, list.size() - 1)));
    return reversed;
	   
    
    
  		
    
 	}
}