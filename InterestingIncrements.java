package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Some interesting cases of increments
 */
public class InterestingIncrements {
    public static void main(String[] args) {
        int x=5;
        x+=x++;
        System.out.println(x);
        int y=5;
        System.out.println((y++)-(y++)); 
        int z=5;
        System.out.println(z++/z);


    }
}
