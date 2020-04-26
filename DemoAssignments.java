package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Demonstration of saaignments
 */
public class DemoAssignments {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        a = (a+1)*(b-1); //12
        System.out.println(a);
        //In expressions
        int c = (a=2)*(b=5); //10
        System.out.println(c);
        //Chain assignments
        int q=b=c=20;
        System.out.println(q); //20

    }
}
