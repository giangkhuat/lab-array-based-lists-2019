import java.io.PrintWriter;
import java.util.ListIterator;

/**
 * Some simple experiments with SimpleArrayLists.
 */
public class SALExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    
    SimpleArrayList<String> fruits = new SimpleArrayList<String> ();
    ListIterator<String> it = (ListIterator<String>) fruits.iterator();
    
    
	it.add("banana");
    it.add("papapa");
    it.add("apple");
    it.add("boba");
    
    ListIterator<String> it2 = (ListIterator<String>) fruits.iterator();
    pen.println("hello");
    while (it2.hasNext()) {
    	if (it2.next().equals("papaya")) {
    		it2.set("kungfu");
    	}
    }
    
    ListIterator<String> it3 = (ListIterator<String>) fruits.iterator();
    while (it3.hasNext()) {
    	pen.println(it3.next());
    }
    
    
  } // main(String[]
} // SALExpt
