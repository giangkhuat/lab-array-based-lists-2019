
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

      ListIterator<String> listIterator = aList.listIterator();
      System.out.println("Previous: " + listIterator.previousIndex());
      System.out.println("Next: " + listIterator.nextIndex());

      // advance current position by one using next method
      listIterator.next();
      System.out.println("Previous: " + listIterator.previousIndex());
      System.out.println("Next: " + listIterator.nextIndex());
      System.out.println("previous element is " + listIterator.hasPrevious());
      listIterator.set("Hello");
      System.out.println(aList.indexOf("Hello"));
      System.out.println("____________");
      System.out.println(listIterator.previousIndex());
      System.out.println(listIterator.previous());
      System.out.println(listIterator.nextIndex());
      System.out.println(listIterator.previousIndex());
    }
}
