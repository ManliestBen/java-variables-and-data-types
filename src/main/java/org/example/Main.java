package org.example;
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
    }
}
