package calculator;

public class Calcultor {

    private int result;

    public int calculate(String[] numbers) {
        result = toInt(numbers[0]);
        for (int position = 2; position < numbers.length; position += 2) {
            result = selectOperator(numbers[position - 1], toInt(numbers[position]));
        }
        return result;
    }

    private int selectOperator(String operator, int number) {
        if (operator.equals("+")) {
            return Operator.add(result, number);
        }
        if (operator.equals("-")) {
            return Operator.subtract(result, number);
        }
        if (operator.equals("*")) {
            return Operator.multiply(result, number);
        }
        if (operator.equals("/")) {
            return Operator.divide(result, number);
        }
        throw new IllegalArgumentException("연산기호가 아닙니다.");
    }

    private int toInt(String number) {
        return Integer.parseInt(number);
    }

}
