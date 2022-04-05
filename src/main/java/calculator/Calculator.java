package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        int sum = Integer.parseInt(values[0]);
        int number = 0;

        for (int i = 2; i < values.length; i += 2) {

            number = Integer.parseInt(values[i]);

            if (values[i - 1].equals("+")) {
                sum += number;
            }
            if (values[i - 1].equals("-")) {
                sum -= number;
            }
            if (values[i - 1].equals("/")) {
                sum /= number;
            }
            if (values[i - 1].equals("*")) {
                sum *= number;
            }
        }
        System.out.println(sum);


    }
}
