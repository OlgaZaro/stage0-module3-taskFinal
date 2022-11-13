package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void main(String[] args) {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        numbersPrinter.printIsPositive(15);
    }
    public void printIsPositive(int number) {
        boolean number1 = (number%2==0)? true:false;
        System.out.println(number1);

    }
}
