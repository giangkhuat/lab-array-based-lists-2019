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
    
  //  String tmp = "papapa";
    
	it.add("banana");
    it.add("papaya");
    it.add("apple");
    it.add("boba");
    //pen.println(tmp.equals("papaya))
    /*
    while (it.hasPrevious()) {
      String tmp = it.previous();
      pen.println(tmp);
      if (tmp.equals("papaya")) {
        it.remove();
      }
    }
    */
   
    ListIterator<String> it2 = (ListIterator<String>) fruits.iterator();

    pen.println("_________");
    while (it2.hasNext()) {
      String tmp = it2.next();
      pen.println(tmp);
    	if (tmp.equals("papaya")) {
    		it2.set("kungfu");
    	}
    }
    pen.println("_________");

    System.out.println(it2.next());
    ListIterator<String> it3 = (ListIterator<String>) fruits.iterator();
    while (it3.hasNext()) {
    	pen.println(it3.next());
    }
    
    
    
  } // main(String[]
} // SALExpt
