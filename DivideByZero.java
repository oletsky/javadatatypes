package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Is it possible to divide by zero?
 * Yes - for doubles
 */
public class DivideByZero {
    public static void main(String[] args) {
        System.out.println(5./0); //Positive infinity
        System.out.println(-5./0); //Negative infinity
        System.out.println(0./0); //NaN

        System.out.println(5./Double.POSITIVE_INFINITY); //0
        System.out.println(5./Double.NEGATIVE_INFINITY); //-0
    }
}
