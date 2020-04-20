package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Increments are applicable to chars, doubles, object wrappers
 * But not to boolean
 */
public class OtherTypeIncrements {
    public static void main(String[] args) {
        char c = 'A';
        c++; //B
        System.out.println(c);
        double d = 1.5;
        d++; //2.5
        System.out.println(d);
        Integer x = 10;
        x++; //11
        System.out.println(x);
        boolean b = false;
        //b++; Syntax error
        System.out.println(b);



    }
}
