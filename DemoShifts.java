package javatraining.oletsky.datatypes;

/**
 * Illustrating shifts
 */
public class DemoShifts {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(a>>1); //3
        System.out.println(a<<1); //12
        System.out.println(a<<5); //192
        System.out.println(a>>2); //1
        System.out.println("-----------");
        int q = -6;
        System.out.println(q >> 1); // -3
        System.out.println(q << 1); // -12
        System.out.println(q >> 2); // -2
        System.out.println(q >>> 1); //2147483645

    }

}
