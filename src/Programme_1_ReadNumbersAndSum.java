import java.util.Scanner;

/* Read 10 numbers from the console entered by the user and print the sum of those numbers
* Use the hasNextInt() method from the scanner to check if the user has entered an int value.
* If hasNextInt() returns false, print the message Invalid number. continue reading until you have read 10 numbers.
* Use the nextInt() method to get the number and add it to the sum.
* Before the user enters each number, print the message Enter number #x: where x represents the count 1, 2, 3, 4 etc
* For example the first message printed to the user would be Enter number # 1:, the next Enter number #2:, ...
* Hint :
* Use a While loop
* use a counter variable for counting valid numbers
* Close the scanner after you dont need it anymore
* Create a class with the name ReadingUserInputChallenge
*
 */
public class Programme_1_ReadNumbersAndSum {
    public static void readTenNumbersAndSum() {
    //Scanner declaration for reading input from console
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    int sum = 0;
    while (true) {
        int order = counter + 1;
        System.out.print("Enter number #" + order + ":");
        boolean isAnInt = scanner.hasNextInt();
        if (isAnInt) {
            int number = scanner.nextInt();
            counter++;
            sum += number;
        if (counter == 10) {
            break;
        }
    } else {
        System.out.print("Invalid number");
    }
    scanner.nextLine(); // handle end of line (enter key)
}
System.out.println("sum = " + sum);
// closing the scanner object
scanner.close();
        }
public static void main(String[]args){
        readTenNumbersAndSum();
        }
        }
