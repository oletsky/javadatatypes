package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * A simple example which illustrates local variables and fields of classes
 */
public class LocalsAndFields {
    static String otherString = "This is a field of a class";

    public static void main(String[] args) {
        String s = "This is a local variable";
        System.out.println(s);
        System.out.println(otherString);
    }
}
