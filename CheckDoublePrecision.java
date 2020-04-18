package javatraining.oletsky.datatypes;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 *
 * Don't use == for comparing doubles.
 * This code illustrates how many times adding 1./n n times doesn't make 1.
 *
 * Even Double.compare likely doesn't help
 * Think of which comparison we should use instead
 */

public class CheckDoublePrecision {
    public static void main(String[] args) {
        final int N = 100000;
        //final double EPS = 1.E-10;
        int c = 0;
        boolean notFoundBefore = true;
        int first = -1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            double b = 1. / i;
            if (sum(i) != 1.) {
                if (notFoundBefore) {
                    first = i;
                    notFoundBefore = false;
                }

                c++;
            } else {
                list.add(i);
            }
        }

        if (sum(N) != 1.) {
            if (notFoundBefore) first = N;
            c++;
        } else list.add(N);
        if (first == -1) System.out.println("Nothing found");
        else System.out.println("First number is " + first);

        System.out.println("Amount is " + c);
        System.out.printf("Ratio is %7.4f\n", c / (N + 0.));
        System.out.println(list);
    }

    static double sum(int a) {
        double d = 1. / a;
        double s = 0;
        for (int i = 0; i < a; i++) {
            s += d;
        }
        return s;
    }
}



