package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * It's an issue how to cast double to int correctly
 * It's better to use Math.round() than (int)
 */

public class DoubleToIntExplorer {
    public static void main(String[] args) {
        double[] testValues = {-10.9, -10.5, -10.1, -10., 0.,
        10., 10.1, 10.5, 10.9};
        //Using int
        System.out.println("Using (int):");
        for (var v:testValues) {
            System.out.printf("%8.4f - %d\n", v, (int) v);
        }
        //Using Math.round()
        System.out.println("Using Math.round()");
        for (var v:testValues) {
            System.out.printf("%8.4f - %d\n", v, Math.round(v));
        }
    }

}
