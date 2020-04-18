package javatraining.oletsky.datatypes;

/**
 * @author Oleksiy Oletsky
 * How to change the case of a character using one XOR only
 * Provided that the argument is correct
 */

public class RegisterChange {
    public static void main(String[] args) {
        System.out.println(change('a'));
        System.out.println(change('A'));
    }

    public static char change(char c) {
        return (char) (c^32);
    }
}

