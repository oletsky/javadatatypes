package javatraining.oletsky.datatypes;

import java.util.Scanner;

/**
 * @author O.Oletsky
 * A very simple example illustrating a possible trouble with using var
 * instead of explicit type declaration. If you enter 3 and 5 you get 35
 */
public class PossibleTroubleWithVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        var a = scanner.nextLine();
        System.out.println("Enter the second number");
        var b  = scanner.nextLine();
        System.out.println("The sum of your number is "+(a+b));
    }
}
