package calculator;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public String input() {
        return scanner.nextLine();
    }
}
