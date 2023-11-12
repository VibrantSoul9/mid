/*
*Write a program to input any number and check if it is Armstrong number or not
* 153 = (1*1*1)+(5*5*5)+(3*3*3)
* so 1+125+27=153
*
 */


public class Programme_10_ArmstrongNumber {
    public static void isArmstrongNumber(int num) {
        int number, temp, total = 0;
        number = num;
        while (num != 0) {
            temp = num % 10;
            total = total + temp * temp * temp;
            num /= 10;
        }
        if (total == number) {
            System.out.println(number + "is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
