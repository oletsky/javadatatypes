package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Illustration of bitwise operations
 * Try to get answers mathematically before running the program
 */
public class DemoBitOperations {
    public static void main(String[] args) {
        byte a = 0b0101010;
        byte b = 0b1010110;
        System.out.println("a="+a+"; b="+b);
        System.out.println(~a);
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);

    }
}
