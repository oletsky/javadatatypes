package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * It appears reasonable to simplify this code
 */
public class SimplifyExpression {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.sqrt(10+Math.exp(5.)))*
                Math.sin(Math.sqrt(10+Math.exp(5.)))+
                Math.cos(Math.sqrt(10+Math.exp(5.)))*
                        Math.cos(Math.sqrt(10+Math.exp(5.))));
    }
}
