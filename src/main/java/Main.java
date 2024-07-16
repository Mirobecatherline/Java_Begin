
public class Main {
  static int age= 20;
  public static void main(String[] args) {
    int age= 20;
    String name= "John";
    double number1= 5.8;
    int number2= (int)number1;
    System.out.println("Hello world!");
    System.out.println(age);
    System.out.println(number2);
    System.out.println(name);
    Loops.main(new String[0]);
    if (number1> 4) {
       System.out.println("greater than 4");
} else {
      System.out.println("less than4");
}
    System.out.println(name.toUpperCase());
  }
}
// for (int i = 0; i < 10; i++) {
//   if (i == 4) {
//     continue;
//   }
//   System.out.println(i);
// } 
// counts but skips 4
// switch(expression) {
//   case x:
//     // code block
//     break;
//   case y:
//     // code block
//     break;
//   default:
//     // code block
// }
// Math.max(x,y)
// Non-primitive data types are called reference types because they refer to objects.
// Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. 
// String - stores text, such as "Hello". String values are surrounded by double quotes
// int - stores integers (whole numbers), without decimals, such as 123 or -123
// float - stores floating point numbers, with decimals, such as 19.99 or -19.99
// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
// boolean - stores values with two states: true or false
// final int myNum = 15;
// String studentName = "John Doe";
// int studentID = 15;
// int studentAge = 23;
// float studentFee = 75.25f;
// char studentGrade = 'B';
// byte	1 byte	Stores whole numbers from -128 to 127
// short	2 bytes	Stores whole numbers from -32,768 to 32,767
// int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
// boolean	1 bit	Stores true or false values
// char	2 bytes	Stores a single character/letter or ASCII values
// +	Addition	Adds together two values	x + y	
// -	Subtraction	Subtracts one value from another	x - y	
// *	Multiplication	Multiplies two values	x * y	
// /	Division	Divides one value by another	x / y	
// %	Modulus	Returns the division remainder	x % y	
// ++	Increment	Increases the value of a variable by 1	++x	
// --	Decrement	Decreases the value of a variable by 1	--x