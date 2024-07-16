public class Loops {
  public static void main(String[] args){
     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    int[] myNumnerArray = {1,2,3,4,5,6,7,8,9,10};
      // System.out.println(cars[0]);
    // static means that the method belongs to the Main class and not an object of the Main class
    System.out.println(cars[0]);
    for (int i = 0; i < cars.length; i++){
      System.out.println(cars[i]);
    }
  }

}
// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (int i = 0; i < cars.length; i++) {
//   System.out.println(cars[i]);
// }
// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (String i : cars) {
//   System.out.println(i);
// }
// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
// System.out.println(myNumbers[1][2]); // Outputs 7