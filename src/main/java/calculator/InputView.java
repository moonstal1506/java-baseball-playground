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

    public static String[] spiltBySpace(String number) {
        return number.split(" ");
    }

}
