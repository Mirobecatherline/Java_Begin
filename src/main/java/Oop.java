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

// we created a static method, which means that it can be accessed without
// creating an object of the class, unlike public, which can only be accessed by
// objects:
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
// A constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created. It can be
// used to set initial values for object attributes:
// Note that the constructor name must match the class name, and it cannot have
// a return type (like void).
// Create a Main class
// public class Main {
// int x; // Create a class attribute

// // Create a class constructor for the Main class
// public Main() {
// x = 5; // Set the initial value for the class attribute x
// }

// public static void main(String[] args) {
// Main myObj = new Main(); // Create an object of class Main (This will call
// the constructor)
// System.out.println(myObj.x); // Print the value of x
// }
// }

// // Outputs 5

// public class Mirobe{
// String mother;
// int siblings;

// public Mirobe(int y, String name){
// mother=name;
// siblings=y;
// }
// public static void main(String[] args){
// Mirobe myMirobe= new Mirobe(2, "Cate");
// System.out.println(myMirobe.mother);
// System.out.println(myMirobe.siblings);
// }
// }

// java modifiers
// We divide modifiers into two groups:

// Access Modifiers - controls the access level
// Non-Access Modifiers - do not control access level, but provides other
// functionality

// Access Modifiers
// public The class is accessible by any other class
// default The class is only accessible by classes in the same package. This is
// used when you don't specify a modifier. You will learn more about packages in
// the Packages chapter

// For attributes, methods and constructors, you can use the one of the
// following:
// public The code is accessible for all classes
// private The code is only accessible within the declared class
// default The code is only accessible in the same package. This is used when
// you don't specify a modifier. You will learn more about packages in the
// Packages chapter
// protected The code is accessible in the same package and subclasses. You will
// learn more about subclasses and superclasses in the Inheritance chapter

// Non-Access Modifiers
// ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
// In Java, **getters** and **setters** are methods used to retrieve and update
// the values of private variables in a class. They follow the principles of
// **encapsulation**, one of the four pillars of object-oriented programming,
// which aims to restrict direct access to the fields of a class and provide
// controlled access through methods.

// ---

// ### **What Are Getters and Setters?**

// 1. **Getter**:
// - A method that retrieves the value of a private variable.
// - Its name typically starts with `get`, followed by the capitalized name of
// the variable.

// Example:
// ```java
// public String getName() {
// return name;
// }
// ```

// 2. **Setter**:
// - A method that sets or updates the value of a private variable.
// - Its name typically starts with `set`, followed by the capitalized name of
// the variable.

// Example:
// ```java
// public void setName(String name) {
// this.name = name;
// }
// ```

// ---

// ### **Why Use Getters and Setters?**

// 1. **Encapsulation**:
// - Protects the internal state of the object by making variables private.
// - Provides controlled access to the variables.

// 2. **Validation**:
// - Allows you to add logic to validate data before updating a variable's
// value.
// - For example, ensure an age value is non-negative.

// ```java
// public void setAge(int age) {
// if (age > 0) {
// this.age = age;
// } else {
// throw new IllegalArgumentException("Age must be positive");
// }
// }
// ```

// 3. **Read-Only or Write-Only Access**:
// - You can define only a getter to make a variable read-only.
// - You can define only a setter to make a variable write-only.

// 4. **Flexibility**:
// - You can later change the internal implementation without affecting the
// external interface.

// ---

// ### **Example**

// ```java
// public class Person {
// // Private variables
// private String name;
// private int age;

// // Getter for name
// public String getName() {
// return name;
// }

// // Setter for name
// public void setName(String name) {
// this.name = name;
// }

// // Getter for age
// public int getAge() {
// return age;
// }

// // Setter for age with validation
// public void setAge(int age) {
// if (age > 0) {
// this.age = age;
// } else {
// throw new IllegalArgumentException("Age must be positive");
// }
// }
// }
// ```

// ---

// ### **Using the Class**

// ```java
// public class Main {
// public static void main(String[] args) {
// Person person = new Person();

// // Set values using setters
// person.setName("Alice");
// person.setAge(25);

// // Get values using getters
// System.out.println("Name: " + person.getName()); // Output: Name: Alice
// System.out.println("Age: " + person.getAge()); // Output: Age: 25
// }
// }
// ```

// ---

// ### **Benefits**

// - **Encapsulation**: Protects data integrity.
// - **Validation**: Adds a layer of data safety.
// - **Future-Proofing**: Easy to modify logic without breaking external code.

// ---

// ### **Common Pitfalls**

// 1. **Overuse of Getters and Setters**:
// - Avoid adding them for every variable unnecessarily; only use them when
// needed.
// 2. **Breaking Encapsulation**:
// - Exposing all fields through getters and setters can negate the benefits of
// encapsulation.

// By using getters and setters thoughtfully, you can write clean, maintainable,
// and secure Java code.

// **Getters and Setters** and **Constructors** in Java serve different purposes
// in managing and accessing the state of an object. Here's a breakdown of the
// differences:

// ---

// ### **1. Purpose**
// - **Constructor**:
// - Initializes an object when it is created.
// - Assigns initial values to fields.
// - It is invoked automatically when using the `new` keyword.

// - **Getters and Setters**:
// - **Getter** retrieves the value of a field.
// - **Setter** updates the value of a field.
// - They are used after the object has been created to manage and access
// fields.

// ---

// ### **2. Usage**
// - **Constructor**:
// - Used only once during object creation.

// Example:
// ```java
// public class Person {
// private String name;

// // Constructor
// public Person(String name) {
// this.name = name;
// }
// }

// Person person = new Person("Alice"); // Initializes 'name' to "Alice"
// ```

// - **Getters and Setters**:
// - Used repeatedly throughout the lifecycle of the object to get or set
// values.

// Example:
// ```java
// public class Person {
// private String name;

// // Getter
// public String getName() {
// return name;
// }

// // Setter
// public void setName(String name) {
// this.name = name;
// }
// }

// Person person = new Person();
// person.setName("Alice"); // Sets 'name' to "Alice"
// System.out.println(person.getName()); // Retrieves 'name'
// ```

// ---

// ### **3. When They Are Called**
// - **Constructor**:
// - Automatically called when an object is instantiated.
// - Cannot be explicitly invoked after the object is created.

// - **Getters and Setters**:
// - Called explicitly after object creation, as needed.

// ---

// ### **4. Parameters**
// - **Constructor**:
// - Can take parameters to set initial values for fields during object
// creation.
// - Example:
// ```java
// public Person(String name, int age) {
// this.name = name;
// this.age = age;
// }
// ```

// - **Setters**:
// - Typically take one parameter to update a specific field.
// - Example:
// ```java
// public void setName(String name) {
// this.name = name;
// }
// ```

// ---

// ### **5. Encapsulation**
// - **Constructor**:
// - Focuses on object initialization but does not directly enforce
// encapsulation.
// - Usually used in combination with private fields and getters/setters.

// - **Getters and Setters**:
// - Key tools for encapsulation, as they provide controlled access to private
// fields.

// ---

// ### **6. Flexibility**
// - **Constructor**:
// - Used for setting initial state only.
// - Requires all initial values at the time of object creation.
// - Cannot change field values later.

// - **Getters and Setters**:
// - Allow dynamic modification and retrieval of field values at any time after
// the object is created.

// ---

// ### **7. Example: Combined Usage**

// ```java
// public class Person {
// private String name;
// private int age;

// // Constructor for initialization
// public Person(String name, int age) {
// this.name = name;
// this.age = age;
// }

// // Getter for name
// public String getName() {
// return name;
// }

// // Setter for name
// public void setName(String name) {
// this.name = name;
// }

// // Getter for age
// public int getAge() {
// return age;
// }

// // Setter for age
// public void setAge(int age) {
// if (age > 0) {
// this.age = age;
// } else {
// throw new IllegalArgumentException("Age must be positive");
// }
// }
// }

// public class Main {
// public static void main(String[] args) {
// // Use constructor to initialize object
// Person person = new Person("Alice", 25);

// // Use getter to retrieve data
// System.out.println(person.getName()); // Output: Alice

// // Use setter to update data
// person.setAge(30);
// System.out.println(person.getAge()); // Output: 30
// }
// }
// ```

// ---

// ### **Key Differences at a Glance**

// | Feature | Constructor | Getter/Setter |
// |------------------------|-------------------------------------|-----------------------------------|
// | **Purpose** | Initializes an object. | Accesses or modifies object data. |
// | **Invocation** | Called once during object creation. | Called explicitly
// after creation. |
// | **Parameters** | Sets initial values for fields. | Gets or updates
// individual fields. |
// | **Encapsulation** | Indirectly supports it. | Key tool for encapsulation. |
// | **Flexibility** | Static; fixed at initialization. | Dynamic; can be used
// anytime. |

// In summary, **constructors** are for initializing objects, while **getters
// and setters** are for managing and accessing the object's state after
// creation.