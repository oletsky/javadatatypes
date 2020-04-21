package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Are you sure that x==x is always true?
 * If you think so you are wrong
 *
 */

public class WhenValueNotEqualsItself {
    public static void main(String[] args) {
        double x=Double.NaN;
        System.out.println(x==x); //false
    }
}
