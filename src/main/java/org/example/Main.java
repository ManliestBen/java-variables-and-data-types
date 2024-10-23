package org.example;

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
        System.out.println(Math.pow(2,5)); // squaring a number
        System.out.println(Math.sqrt(64)); // square root of a number
    }
}
