package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Demonstration of boxing and unboxing
 * for object wrappers
 */

public class DemoBoxingUnboxing {
    public static void main(String[] args) {
        Integer a = 10; //boxing
        int b = a+5; //unboxing
        System.out.println(b);
        Double d = 1.5;
        System.out.println(d+a);

    }
}
