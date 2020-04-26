package javatraining.oletsky.datatypes;

public class BinOctHexLiterals {
    public static void main(String[] args) {
        System.out.println(0b101); //Binary, 5
        System.out.println(0101); //Octal, 65
        System.out.println(0x101); //Hex, 257
        System.out.println(0xff); //255
        System.out.println(0x2e); //46
        //Be cautious, it's a trap
        System.out.println(050*2); //NOT 100
    }
}
