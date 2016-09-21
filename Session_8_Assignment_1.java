/*
  Write an example for reading all elements from ArrayList by using Iterator.
*/
 
import java.util.ArrayList;
import java.util.Iterator;
 
public class Session_8_Assignment_1 {
 
  public static void main(String[] args) {
   
    //create an ArrayList object
    ArrayList name = new ArrayList();
   
    //Add elements to Arraylist
    name.add("R");
    name.add("A");
    name.add("H");
    name.add("U");
    name.add("L");
   
    //get an Iterator object for ArrayList using iterator() method.
    Iterator itr = name.iterator();
   
    //use hasNext() and next() methods of Iterator to iterate through the elements
    System.out.println("Iterating elements : ");
    while(itr.hasNext())
      System.out.println(itr.next());
   
  }
}
 
/*
Output would be
Iterating elements...
R
A
H
U
L
*/