import java.util.HashMap; // import the HashMap class
public class MyHashMap {
    // In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

    // One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
   
    
    public static void main(String[] args) {
        
        System.out.println("Hello, World!");
        // Create a HashMap object called capitalCities that will store String keys and String values:
         HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        // {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
        // To access a value in the HashMap, use the get() method and refer to its key:
        capitalCities.get("England");
        capitalCities.remove("England");
        capitalCities.clear();
        capitalCities.size();

        // Loop through the items of a HashMap with a for-each loop.

        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        for (String i : capitalCities.keySet()) {
          System.out.println(i);
        }
        // Print values
        for (String i : capitalCities.values()) {
          System.out.println(i);
        }
        // Print keys and values
        for (String i : capitalCities.keySet()) {
          System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
  
}

