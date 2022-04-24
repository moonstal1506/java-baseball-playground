package calculator;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        Number number = new Number(inputView.input());

        Calculator calculator = new Calculator();
        int result = calculator.calculate(number.getNumbers());

        ResultView resultView = new ResultView();
        resultView.print(result);
    }
}
