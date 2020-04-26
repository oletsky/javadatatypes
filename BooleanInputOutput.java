package javatraining.oletsky.datatypes;

import java.util.Scanner;

/**
 * Demonstrates input and output of boolean values
 */

public class BooleanInputOutput {
    public static void main(String[] args) {
        System.out.println("Input boolean value");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        System.out.println("You entered "+b);

    }
}
