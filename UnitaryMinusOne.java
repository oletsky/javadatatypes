package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Shift of -1 to left retains it
 * Try to replace signed shift with unsigned
 */

public class UnitaryMinusOne {
    public static void main(String[] args) {
        int u = -1;
        System.out.println(u>>1);
    }
}
