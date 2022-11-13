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
        int number1;

        currentDigit = number%10;
        current = number%100;
        current = current/10;
        sum = sum + currentDigit+current;
        number = number/100;
        number1 = number%10;
        sum = sum + number1;
        number = number/10;
        sum = sum + number;
        System.out.println(sum);
    }
}
