package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Demonstrates some features of object references (pointers)
 */

public class ObjectPointersVsPrimitives{
    public static void main(String[] args) {
        //Primitive types
        int a = 10;
        int b = a;
        b = 100;
        System.out.println("Primitives: ");
        System.out.println("a=" + a + "; b=" + b + " - independent variables");
        //Object pointers
        System.out.println("Objects:");
        MyClass o1; //No instance, no constructor, non-initialized
        MyClass o2 = new MyClass(10); //New instance
        MyClass o3 = o2; //No copying; other pointer
        o3.a = 100;
        System.out.println(o2.a + " " + o3.a + " - the same object");


    }
}

class MyClass {
    int a;

    public MyClass(int a) {
        System.out.println("Constructor called");
        this.a = a;
    }
}
