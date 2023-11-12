public class Programme_7_FirstAndLAstDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(346));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-6));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }
}
