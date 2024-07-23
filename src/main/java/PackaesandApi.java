public class PackaesandApi {
  // A package in Java is used to group related classes. Think of it as a folder
  // in a file directory.
  // The library is divided into packages and classes. Meaning you can either
  // import a single class (along with its methods and attributes), or a whole
  // package that contain all the classes that belong to the specified package.
  // import package.name.Class; // Import a single class
  // import package.name.*; // Import the whole package
  // the Scanner class, which is used to get user input,
  // import java.util.Scanner; java.util is a package, while Scanner is a class of
  // the java.util package.
  // import java.util.*; import all the classes in the package
}
// import java.util.Scanner;
// class Myclass{
// public static void main(String[] args){
// Scanner myobject= new Scanner (System.in);
// System.out.println("Enter username");
// String userName = myobject.nextLine();
// System.out.println("Username is: " + userName);
// }
// }

// User-defined Packages.
// To create your own package, you need to understand that Java uses a file
// system directory to store them. To create a package, use the package keyword:
// └── root
// └── mypack
// └── MyPackageClass.java
// -
// example
// package mypack;
// class MyPackageClass {
// public static void main(String[] args) {
// System.out.println("This is my package!");
// }
// }
// Then compile the package:

// C:\Users\Your Name>javac -d . MyPackageClass.java
// Note: The package name should be written in lower case to avoid conflict with
// class names.
// To run the MyPackageClass.java file, write the following:

// C:\Users\Your Name>java mypack.MyPackageClass