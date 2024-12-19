public class Excepions {
  
  public static void main(String[] args) {

    // The try statement allows you to define a block of code to be tested for errors while it is being executed.

    // The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
    try {
      //  Block of code to try
    }
    catch(Exception e) {
      //  Block of code to handle errors
    }
    finally {
      //  Block of code that will be executed regardless of the try...catch  block result
    }
    
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
    // The throw statement allows you to create a custom error.
    // The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
// Example
    // Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":

    // public class Main {
    //   static void checkAge(int age) {
    //     if (age < 18) {
    //       throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    //     }
    //     else {
    //       System.out.println("Access granted - You are old enough!");
    //     }
    //   }

    //   public static void main(String[] args) {
    //     checkAge(15); // Set age to 15 (which is below 18...)
    //   }
    // }
    
  }
}