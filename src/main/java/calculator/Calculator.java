package calculator;

import java.util.Scanner;

public class Calculator {

    public String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public String[] split(String value) {
        return value.split(" ");
    }

    public int makeInt(String value) {
        return Integer.parseInt(value);
    }

    public int add(int result, int num) {
        return result + num;
    }

    public int subtract(int result, int num) {
        return result - num;
    }

    public int multiply(int result, int num) {
        return result * num;
    }

    public int divide(int result, int num) {
        return result / num;
    }

    public static void main(String[] args) {

    }
}
