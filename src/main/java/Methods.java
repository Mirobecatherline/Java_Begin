public class Methods{//this is a class
  static void myMethod(String name, int age){//this is a method with parametors
    System.out.println("I just got executed!");
  }
  public static void main(String[] args){//this is a method
    System.out.println("hello world");
    myMethod("cate", 27);//calling the method and it has arguments
    // Methods.main(new String[0]);
    // Methods.printMessage();
  }
}
// Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.
// methos overloading 
// static int plusMethod(int x, int y) {
//   return x + y;
// }

// static double plusMethod(double x, double y) {
//   return x + y;
// }

// public static void main(String[] args) {
//   int myNum1 = plusMethod(8, 5);
//   double myNum2 = plusMethod(4.3, 6.26);
//   System.out.println("int: " + myNum1);
//   System.out.println("double: " + myNum2);
// }
// Multiple methods can have the same name as long as the number and/or type of parameters are different.

// method scope
// public class Main {
//   public static void main(String[] args) {

//     // Code here CANNOT use x

//     int x = 100;

//     // Code here can use x
//     System.out.println(x);
//   }

// Code here CANNOT use x
// }

// Recursion is the technique of making a function call itself.
// recursion is a technique of making a function call itself.
// we have Base Case: This is the condition under which the recursion ends. 
// Recursive Case: This part of the method includes a call to itself with a modified argument, gradually moving towards the base case.