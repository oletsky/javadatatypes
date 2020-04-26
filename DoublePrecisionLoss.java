package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Illustrating precision loss
 * occuring when adding large and smal numbers
 */

public class DoublePrecisionLoss {
    public static void main(String[] args) {
        double eps=0.000000001;
        double d1=2.E3;
        System.out.println(d1+eps);
        double d2=2.E20;
        System.out.println(d2+eps);
    }
}
