package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * An example of implicit promotion
 * with losing precision
 */

public class ImplicitPrecisionLoss {
    public static void main(String[] args) {
        int number = 987654321;
        float transformed = number;
        int restored = (int) transformed;
        System.out.println(restored - number); //15

    }
}
