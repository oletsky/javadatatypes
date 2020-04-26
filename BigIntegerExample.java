package javatraining.oletsky.datatypes;

import java.math.BigInteger;

/**
 * @author O.Oletsky
 * An example of using Biginteger
 */

public class BigIntegerExample {
    public static void main(String[] args) {
        String s1="22222222222222222222222222222222222222222222222222";
        String s2="55555555555555555555555555555555555555555555555555";
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        b1 = b1.add(b2);
        System.out.println(b1);
    }
}
