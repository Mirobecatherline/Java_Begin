
public class Enum {
  public static void main(String[] args){
    // enums are used to declare constants.
    enum means enumerations,, is a special class that represent a group of constants ie final
  }
  To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

  ExampleGet your own Java Server
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  Why And When To Use Enums?
  Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
}
The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

import java.time.LocalDate;
import java.util.Scanner; // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine(); // Read user input
    System.out.println("Username is: " + userName); // Output user input
  }
}

To display the current date, import the java.time.LocalDate class, and use its now() method:
LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); 