package javatraining.oletsky.datatypes;

public class OperationsWithNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        System.out.println(x);
        System.out.println((int) x); //0
        System.out.println(x==x); //false
        System.out.println(x+5); //NaN
    }
}
