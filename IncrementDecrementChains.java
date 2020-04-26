package javatraining.oletsky.datatypes;

public class IncrementDecrementChains {
    public static void main(String[] args) {
        int in = 2;
        int out = ++in * 7 / in-- - --in;
        System.out.println("in is " + in);
        System.out.println("out is " + out);

    }
}
