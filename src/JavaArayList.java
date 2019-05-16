
import java.util.ListIterator;
import java.util.ArrayList;

public class JavaArayList {
    public static void main(String[] args) {
      ArrayList<String> aList = new ArrayList<String>();

      aList.add("1");
      aList.add("2");
      aList.add("3");
      aList.add("4");
      aList.add("5");

      ListIterator<String> it = aList.listIterator();
      while (it.hasNext()) {
        System.out.println(it.next());
      }
      
      System.out.println("previous = " + it.previous());
      System.out.println("set to hello" );
      it.set("hello");
      System.out.println("index of hello = " + aList.indexOf("hello"));
      System.out.println("previous index = " + it.previousIndex());
      System.out.println(it.next());
      System.out.println("previous = " + it.previous());
      System.out.println("nextIndex = " + it.nextIndex());
      System.out.println("next = " + it.next());
      
      ListIterator<String> it3 = aList.listIterator();
      while (it3.hasNext()) {
        System.out.println(it3.next()+ "..." );
     
      }
      
      ListIterator<String> it2 = aList.listIterator();
      it2.next();
      it2.next();
      // pos should be 2 and back is 1 now
      System.out.println("previous = " + it2.previous());
      // now back = 0, pos = 1 (which points to "2")
      System.out.println("next = " + it2.next());
      // now pos = 2, back = 1, so next() just visited element at position 1, whcih is 2
      // set set the element of the position next() just returned, whcih is is index 1, element 2
      it2.set("hola");
      System.out.println(aList.indexOf("hola"));

    }
}
