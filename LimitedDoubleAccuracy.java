package javatraining.oletsky.datatypes;

/**
 * @author O.Oletsky
 * Illustrating dangers connected to
 * limited precision of representing doubles
 */
public class LimitedDoubleAccuracy {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(2.0-1.1);
        System.out.println(1./49.*49==1.);
        System.out.println(Double.compare(1./49.*49,1.));
        double d=0.;
        while (d!=1.) {
            System.out.println(d);
            d+=0.1;
            Thread.sleep(1000);
        }

    }
}
