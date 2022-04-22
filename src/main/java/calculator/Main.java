package calculator;

public class Main {
    public static void main(String[] args) {
        print();
    }

    private static void print(){
        System.out.println(Calculator.calculate(InputView.giveNumbers()));
    }
}
