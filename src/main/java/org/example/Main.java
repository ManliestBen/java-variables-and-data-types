package org.example;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
//      Declarations
        int num1 = 4;
        int num2 = 6 / 4;
//        System.out.println(num1);
//        System.out.println(num2);  // shows up as 1 because of int

        float num3 = 6 / 4;
//        System.out.println(num3);  // still doesn't work, 6 and 4 are int types

        float num4 = 6f / 4f;
//        System.out.println(num4); // works perfectly

//      Math operators
//        System.out.println(Math.pow(2,5)); // squaring a number
//        System.out.println(Math.sqrt(64)); // square root of a number


//      NaN
//        System.out.println(Math.sqrt(-3)); // results in NaN
//        System.out.println(Double.isNaN(Math.sqrt(-3)));  // check for NaN

//      Random Numbers
//        System.out.println(Math.random()); // double between 0.0 and 0.99999999 (up to but not including 1)

        int max = 100;
        int min = 1;

//        System.out.println((Math.random() * (max - min)) + min);

//      One way of checking the type of primitive
        Object random = (Math.random() * (max - min)) + min;
//        System.out.println(random.getClass().getName());

//      Getting a random rounded float
        float random2 = Math.round((Math.random() * (max - min)) + min);
//        System.out.println(random2);

//      Getting a random int
        int randomInt = ThreadLocalRandom.current().nextInt(min, max + 1);
//        System.out.println(randomInt);

//      Java variables are pass by value
//      If the value stored in a variable is a primitive, it's similar to making a copy
//      at that point in time

        int theseWaffles = 5;
        int thoseWaffles = theseWaffles;

        theseWaffles += 10;

//        System.out.println("theseWaffles = " + theseWaffles);
//        System.out.println("thoseWaffles = " + thoseWaffles);

//      When using objects (created by a class), the variables hold references
//      to the value in memory, rather than just the value itself

        int[] someNums = {1, 2, 3, 4, 5};
        int[] moreNums = someNums;

        someNums[0] = 4; // This changes the value that both variables point to
//        someNums = new int[] {3, 4, 5, 6, 9}; // This makes a new array at a new memory address
//        System.out.println("someNums = " + Arrays.toString(someNums));
//        System.out.println("moreNums = " + Arrays.toString(moreNums));

//      Strings are immutable, a new value is stored in a new memory address when reassigned to

        String favFood = "waffle";
        String otherFavFood = favFood;

        favFood = "taco"; // This technically creates a new string at a new memory address

//        System.out.println("favFood = " + favFood);
//        System.out.println("otherFavFood = " + otherFavFood);  // Still points to the old memory address

//      Multiple ways to define strings
        String myFirstName = "Ben";
        String myLastName = new String("Manley");
        String myMiddleName; // initialized as null
        myMiddleName = "Thomas";

//      String methods

//      Find the length of a string
        System.out.println(myFirstName.length());
//      Find a character at a specific index
        System.out.println(myFirstName.charAt(2));
//      Replace part of a string
        System.out.println(myLastName.replace("M", "St"));
//      Uppercase
        System.out.println(myLastName.toUpperCase());
//      Lowercase
        System.out.println(myLastName.toLowerCase());
//      Compare lexicographically (0 means equal, <0 if less than arg, >0 if greater than arg)
        System.out.println(myLastName.compareTo(myFirstName));
        System.out.println(myLastName.compareTo(myMiddleName));
        System.out.println(myLastName.compareTo("Manley"));
//      Use compareToIgnoreCase() to ignore case
        System.out.println(myLastName.compareTo("manley"));
//      Check if string contains a set of characters
        System.out.println(myLastName.contains("Man"));
//      Checking equality
        System.out.println(myMiddleName.equals("Banana"));
    }
}
