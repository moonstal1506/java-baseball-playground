package calculator;

import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);

    public String input(){
        return scanner.nextLine();
    }
}
