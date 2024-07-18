public class Oop {
  // attributes/fields of a class or variables within a class
  // can acces atrributes by creating objects and using dot syntax (.)
  // by using final, you can change the attribute final int x=50;
  int x=5; 
  public static void main(String[] args) {
    System.out.println("hello world");
    // So, a class is a template for objects, and an object is an instance of a class.

    // When the individual objects are created, they inherit all the variables and methods from the class.
    // To create an object of Main, specify the class name, followed by the object name, and use the keyword new
    // You can also modify attribute values:
    // myObj.x = 40;
    // System.out.println(myObj.x);
    Oop myObject = new Oop();
    Oop myObject2 =new Oop();
    Oop myObject3 =new Oop();
    System.out.println(myObject.x);
    System.out.println(myObject2.x);
    System.out.println(myObject3.x);
  }
}
// (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

// Main.java
// public class Main {
//   int x =5;
// }

// Second.java
// public class Second{
//   Main myObject4= new Main();
//   System.out.println(myObject4.x);
// }

// public class Main {
//   int x = 5;

//   public static void main(String[] args) {
//     Main myObj1 = new Main();  // Object 1
//     Main myObj2 = new Main();  // Object 2
//     myObj2.x = 25;
//     System.out.println(myObj1.x);  // Outputs 5
//     System.out.println(myObj2.x);  // Outputs 25
//   }
// }

// we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:
// public class Main{
//   String name="cate";
//   static void myStaticMethod(){
//     System.out.println("my satic method");
//   }

//   public void myPublicMethod(){
//     System.out.println("my public method");
//   }
//   public static void main(String[] args){
//     myStaticMethod();
//     Main myObj= new Main();
//     myObj.myPublicMethod();
//   }
// }

// Main.java
// public class Main {
//   public void fullThrottle() {
//     System.out.println("The car is going as fast as it can!");
//   }

//   public void speed(int maxSpeed) {
//     System.out.println("Max speed is: " + maxSpeed);
//   }
// }
// Second.java
// class Second {
//   public static void main(String[] args) {
//     Main myCar = new Main();     // Create a myCar object
//     myCar.fullThrottle();      // Call the fullThrottle() method
//     myCar.speed(200);          // Call the speed() method
//   }
// }

// *******************************************
// constuctors 
