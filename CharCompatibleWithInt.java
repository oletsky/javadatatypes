package javatraining.oletsky.datatypes;

public class CharCompatibleWithInt {
    public static void main(String[] args) {
        int a='A';
        System.out.println(a);
        char c=65;
        System.out.println(c);
        System.out.println(a==c); //true
        System.out.println(a+'\u0001'); //66
        System.out.println((char)(a+'\u0001')); //B
        System.out.println(c+'B'); //131
        System.out.println((char) (c+32)); //a
        System.out.println(c*'B'); //4290
        System.out.println((char)(1.5*c)); //a

    }
}
