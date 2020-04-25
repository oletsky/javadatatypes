package javatraining.oletsky.javastart;

/**
 * Exercises with creating own class
 * This class should be brought to a more canonical state
 */

public class DemoOwnClass {
    public static void main(String[] args) {
        MyClass ekz=new MyClass();
        ekz.myMethod();
    }
}

class MyClass {
    String s="Very important information";

    void myMethod(){
        System.out.println("The message is: "+s);
    }
}


