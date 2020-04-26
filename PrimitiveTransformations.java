package javatraining.oletsky.datatypes;

public class PrimitiveTransformations {
    public static void main(String[] args) {
        //Promotions and castings
        byte b = 5;
        short s = b;
        //byte b1 = s; //Impossible
        byte b2 = (byte) s;
        //Illegal byte
        //byte b1 = 200; //Impossible
        byte b3 = (byte) 200;
        System.out.println(b3); //-56


    }
}
