package baseballgame;

import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);
    private int continueState;

    public String input(){
        System.out.print("숫자를 입력해 주세요 :");
        return scanner.nextLine();
    }

    public void restartInput(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        continueState= scanner.nextInt();
    }

    public boolean isContinue(){
        return continueState==1;
    }
}
