package baseballGame;

import java.util.Scanner;

public class Prompt {

    public void runPrompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        String userNumber= scanner.nextLine();
    }

    public static void main(String[] args) {

    }
}
