public class Programme_5_PallindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(99099));
        System.out.println(isPalindrome(12345));
    }
    // write a method called isPalindrome with one int parameter called number//
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        //find reverse of the given number.
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}

