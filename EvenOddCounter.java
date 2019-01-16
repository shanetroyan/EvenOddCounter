package evenoddcounter;

import java.util.Scanner;

public class EvenOddCounter {
//Author: Shane Troyan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int CounterValue;
        System.out.println("Even or Odd Counter: A Basic Counter That Counts Down From The Number That Has Been Input By The User (It Cannot Be Negative) and Displays whether the Number Displayed is Even or Odd");
        System.out.println("Enter a Counter Value to Start the Countdown");
        CounterValue = input.nextInt();

        if (CounterValue < 0) {
            System.out.println("Counter Number Cannot Be Negative");
        }

        for (i = CounterValue; i > 0;) {

            while (i % 2 == 0) { //while the number is even
                System.out.println("I'm Even" + " " + i); 
                i = i - 1;

            }
            while (i % 2 != 0) { //while the number is odd 

                System.out.println("I'm Odd" + " " + i);  
                i = i - 1;
            }
        }

    }
}
