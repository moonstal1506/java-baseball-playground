package calculator;

public class Calculator {

    private static int result = 0;

    public static int calculate(String[] numbers) {
        result = Integer.parseInt(numbers[0]);
        for (int position = 2; position < numbers.length; position += 2) {
            result = selectOperator(numbers, position);
        }
        return result;
    }

    private static int selectOperator(String[] numbers, int position) {
        if (numbers[position - 1].equals("+")) {
            return add(parseInt(numbers[position]));
        }
        if (numbers[position - 1].equals("-")) {
            return subtract(parseInt(numbers[position]));
        }
        if (numbers[position - 1].equals("*")) {
            return multiply(parseInt(numbers[position]));
        }
        if (numbers[position - 1].equals("/")) {
            return divide(parseInt(numbers[position]));
        }
        return 0;
    }

    public static int parseInt(String number) {
        return Integer.parseInt(number);
    }

    public static int add(int number) {
        return result + number;
    }

    public static int subtract(int number) {
        return result - number;
    }

    public static int multiply(int number) {
        return result * number;
    }

    public static int divide(int number) {
        if (number == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return result / number;
    }

}
