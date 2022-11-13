package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(4378);
    }
    public void calculateSum(int number) {
        int sum = 0;
        int currentDigit;
        int current;
        int numberOne;

        currentDigit = number % 10;
        sum = sum + currentDigit;
        System.out.println(sum);
        number = number/10;
        currentDigit = number % 10;
        sum = sum + currentDigit;
        System.out.println(sum);
        number = number/10;
        currentDigit = number % 10;
        sum = sum + currentDigit;
        System.out.println(sum);
        number = number/10;
        sum = sum + number;
        System.out.println(sum);
    }
}
