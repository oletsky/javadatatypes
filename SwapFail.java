package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * A programmer wants to swap the values of two variables.
 * But there is a mistake in this code.
 * Try to fix it
 */
public class SwapFail {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //Swapping
        a=b;
        b=a;

        System.out.println(a+" "+b);
    }
}
