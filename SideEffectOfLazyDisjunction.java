package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * The plan was to increment i and synchronously.
 * But something went wrong.
 * Nry to replace lazy operation with non-lazy one
 */
public class SideEffectOfLazyDisjunction {
    public static void main(String[] args) {
        final int MI=12;
        final int MJ=10;
        int i=6;
        int j=6;
        while ((++i<=MI)||(++j<=MJ)) {
            System.out.println("i="+i+"; j="+j);
        }

    }
}
