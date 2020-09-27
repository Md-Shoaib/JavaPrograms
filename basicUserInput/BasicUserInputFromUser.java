package basicUserInput;

import java.util.Scanner;

public class BasicUserInputFromUser {

    public static void main(String[] args) {
        //Creating a scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a no: ");
        int no1 = scanner.nextInt();

        System.out.println("Please enter second no: ");
        int no2 = scanner.nextInt();

        no1 = no1+no2;
        System.out.println("Addition of two numbers: "+no1);


    }

}
