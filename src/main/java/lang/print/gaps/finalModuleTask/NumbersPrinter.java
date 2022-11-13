package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void main(String[] args) {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        numbersPrinter.printIsPositive(15);
    }

    public void printIsPositive(int number) {
        if (number % 2 == 0)
            System.out.println(true);
        else{
            System.out.println(false);
        }
    }
}
