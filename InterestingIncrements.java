package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Some interesting cases of increments
 */
public class InterestingIncrements {
    public static void main(String[] args) {
        int x=5;
        x+=x++; //10
        System.out.println(x);
        int y=5;
        System.out.println((y++)-(y++)); //-1


    }
}
