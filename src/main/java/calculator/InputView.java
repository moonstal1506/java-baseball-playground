package calculator;

import java.util.Scanner;

public class InputView {

    public static String[] giveNumbers() {
        return spiltBySpace(input());
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void checkValidation(String input) {
        if (isNullOrEmpty(input)) throw new IllegalArgumentException("값을 입력해야합니다.");
    }

    private static boolean isNullOrEmpty(String input) {
        return input == null || input.equals("");
    }

    public static String[] spiltBySpace(String number) {
        return number.split(" ");
    }

}
