package calculator;

public class Calcultor {

    private int result;

    public int calculate(String[] numbers) {
        result = toInt(numbers[0]);
        for (int position = 2; position < numbers.length; position += 2) {
            result = selectOperator(numbers, position);
        }
        return result;
    }

    private int selectOperator(String[] numbers, int position) {
        if (numbers[position - 1].equals("+")) {
            return Operator.add(result,toInt(numbers[position]));
        }
        if (numbers[position - 1].equals("-")) {
            return Operator.subtract(result,toInt(numbers[position]));
        }
        if (numbers[position - 1].equals("*")) {
            return Operator.multiply(result,toInt(numbers[position]));
        }
        if (numbers[position - 1].equals("/")) {
            return Operator.divide(result,toInt(numbers[position]));
        }
        return 0;
    }

    private int toInt(String number){
        return Integer.parseInt(number);
    }

}
