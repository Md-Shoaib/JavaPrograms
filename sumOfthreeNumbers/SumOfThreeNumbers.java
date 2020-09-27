package sumOfthreeNumbers;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a no:");
        int a = scanner.nextInt();

        System.out.println("Please enter a no:");
        int b = scanner.nextInt();

        System.out.println("Please enter a no:");
        int c = scanner.nextInt();

        int ans = a+b+c;

        System.out.println("Sum of three numbers are: "+ ans);

    }
}
