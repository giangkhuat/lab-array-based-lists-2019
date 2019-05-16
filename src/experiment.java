
import java.io.PrintWriter;
import java.util.ListIterator;

/**
 * Some simple experiments with SimpleArrayLists.
 */
public class experiment {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    SimpleArrayList<String> aList = new SimpleArrayList<String>();
    ListIterator<String> it = (ListIterator<String>) aList.iterator();

    it.add("1");
    it.add("2");
    it.add("3");
    it.add("4");
    it.add("5");

    ListIterator<String> it2 = aList.listIterator();
    while (it2.hasNext()) {
      System.out.println(it2.next());
    }
    
    System.out.println("previous = " + it.previous());
    System.out.println("set to hello" );
    it2.set("hello");
    //System.out.println("index of hello = " + aList.indexOf("hello"));
    System.out.println("previous index = " + it2.previousIndex());
    System.out.println(it2.next());
    System.out.println("previous = " + it2.previous());
    System.out.println("nextIndex = " + it2.nextIndex());
    System.out.println("next = " + it2.next());
    /*
     * banana 
     * Previous index = 0
     *  Next index = 1
     *   Next element = papapa
     *    banana
     *     kungfu
     *      apple 
     *      boba
     * Previous = boba
     *  Prevopis index = 2 
     *  Next index = 3
     */

  } // main(String[]
} // SALExpt

