package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Illustrates the difference between pre-and post-increments
 */
public class PreIncrementVsPostIncrement {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x++); // 4

        x = 4;
        System.out.println(++x); // 5
    }

}
