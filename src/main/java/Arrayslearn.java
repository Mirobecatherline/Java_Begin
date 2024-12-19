import java.until.ArrayList;// import the ArrayList class
import java.util.LinkedList;
import java.util.Collections;

public class Arrayslearn{
  // ArrayList class is a resizble array which can be found in the java.until package. elements can be added and removed from an ArrayList.
//   ArrayList<String> cars = new ArrayList<String>  ();// creating an array list object
//   cars.add("Volvo");// adding elements to the array list
// cars.add("bmw");
// cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
// cars.get(0);//access element at the specified index
// cars.set(0, "Opel");//modify an element at the specified index
// cars.remove(0);
// cars.clear();// remove all elements from the list
// //To find out how many elements an ArrayList have, use the size method: cars.size();
// for (int i = 0; i < cars.size(); i++) {
//   System.out.println(cars.get(i));
// }
// for (String i : cars) {
//   System.out.println(i);
// }

// Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:

// ArrayList<String> cars = new ArrayList<String>();
// cars.add("Volvo");
// cars.add("BMW");
// cars.add("Ford");
// cars.add("Mazda");
// Collections.sort(cars);  // Sort cars
   // Collections.sort(cars, Collections.reverseOrder()); // Sort myNumbers in reverse order
// for (String i : cars) {
//   System.out.println(i);
// }
// System.out.println(cars);
// // output [Mazda, Volvo, BMW, Ford]

// elements are objects
  // LinkedList classp is a doubly linked list which can be found in the java.util package. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
  // Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
  // For many cases, the ArrayList is more efficient as it is common to need access to random items in the list, but the LinkedList provides several methods to do certain operations more efficiently:
  // addFirst(), addLast(),  removeFirst(), removeLast(), getFirst(),getLast()

  // import java.util.LinkedList;

  // public class Main {
  //   public static void main(String[] args) {
  //     LinkedList<String> cars = new LinkedList<String>();
  //     cars.add("Volvo");
  //     cars.add("BMW");
  //     cars.add("Ford");
  //     cars.add("Mazda");
  //     System.out.println(cars);
  //   }
  // }
}