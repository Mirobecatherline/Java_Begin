public class Oop {
  // attributes/fields of a class or variables within a class
  // can acces atrributes by creating objects and using dot syntax (.)
  // by using final, you can change the attribute final int x=50;
  int x = 5;

  public static void main(String[] args) {
    System.out.println("hello world");
    // So, a class is a template for objects, and an object is an instance of a
    // class.

    // When the individual objects are created, they inherit all the variables and
    // methods from the class.
    // To create an object of Main, specify the class name, followed by the object
    // name, and use the keyword new
    // You can also modify attribute values:
    // myObj.x = 40;
    // System.out.println(myObj.x);
    Oop myObject = new Oop();
    Oop myObject2 = new Oop();
    Oop myObject3 = new Oop();
    System.out.println(myObject.x);
    System.out.println(myObject2.x);
    System.out.println(myObject3.x);
  }
}
// (one class has all the attributes and methods, while the other class holds
// the main() method (code to be executed)).

// Main.java
// public class Main {
// int x =5;
// }

// Second.java
// public class Second{
// Main myObject4= new Main();
// System.out.println(myObject4.x);
// }

// public class Main {
// int x = 5;

// public static void main(String[] args) {
// Main myObj1 = new Main(); // Object 1
// Main myObj2 = new Main(); // Object 2
// myObj2.x = 25;
// System.out.println(myObj1.x); // Outputs 5
// System.out.println(myObj2.x); // Outputs 25
// }
// }

// we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:
// public class Main{
// String name="cate";
// static void myStaticMethod(){
// System.out.println("my satic method");
// }

// public void myPublicMethod(){
// System.out.println("my public method");
// }
// public static void main(String[] args){
// myStaticMethod();
// Main myObj= new Main();
// myObj.myPublicMethod();
// }
// }

// Main.java
// public class Main {
// public void fullThrottle() {
// System.out.println("The car is going as fast as it can!");
// }

// public void speed(int maxSpeed) {
// System.out.println("Max speed is: " + maxSpeed);
// }
// }
// Second.java
// class Second {
// public static void main(String[] args) {
// Main myCar = new Main(); // Create a myCar object
// myCar.fullThrottle(); // Call the fullThrottle() method
// myCar.speed(200); // Call the speed() method
// }
// }

// *******************************************
// constuctors
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
// Note that the constructor name must match the class name, and it cannot have a return type (like void).
// Create a Main class
// public class Main {
//   int x;  // Create a class attribute

//   // Create a class constructor for the Main class
//   public Main() {
//     x = 5;  // Set the initial value for the class attribute x
//   }

//   public static void main(String[] args) {
//     Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
//     System.out.println(myObj.x); // Print the value of x
//   }
// }

// // Outputs 5

// public class Mirobe{
//   String mother;
//   int siblings;
  
//   public Mirobe(int y, String name){
//     mother=name;
//     siblings=y;
//   }
//   public static void main(String[] args){
//     Mirobe myMirobe= new Mirobe(2, "Cate");
//     System.out.println(myMirobe.mother);
//     System.out.println(myMirobe.siblings);
//   }
// }

// java modifiers
// We divide modifiers into two groups:

// Access Modifiers - controls the access level
// Non-Access Modifiers - do not control access level, but provides other functionality

// Access Modifiers
// public	The class is accessible by any other class	
// default	The class is only accessible by classes in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter

// For attributes, methods and constructors, you can use the one of the following:
// public	The code is accessible for all classes	
// private	The code is only accessible within the declared class	
// default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
// protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter

// Non-Access Modifiers
// For classes, you can use either final or abstract: