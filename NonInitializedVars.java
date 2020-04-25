package javatraining.oletsky.datatypes;

public class NonInitializedVars {
    public static void main(String[] args) {
        int a=5;
        int b;

        if (a==5) b=10;
        if (a!=5) b=50;
        System.out.println(b);

    }

}
