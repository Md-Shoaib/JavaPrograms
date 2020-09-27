/* WAP to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects
must be taken as a input from the keyboard (Marks are out of 100)
* */

package calculatePercentage;

import java.util.Scanner;

public class CalculatePercentage {
    //method
    public void marks() {
        System.out.println("Please enter your Marks:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for History:");
        float history = scanner.nextFloat();

        System.out.println("Enter marks for Geography:");
        float geography = scanner.nextFloat();

        System.out.println("Enter marks for Maths:");
        float maths = scanner.nextFloat();

        System.out.println("Enter marks for Physics:");
        float physics = scanner.nextFloat();

        System.out.println("Enter marks for Biology:");
        float biology = scanner.nextFloat();

        float percentage = (history + geography + maths + physics + biology) / 5;

        System.out.println("Your percentage are: " + percentage);

    }

}
