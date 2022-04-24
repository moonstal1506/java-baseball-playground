package baseballgame;

import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);

    public String input(){
        System.out.print("숫자를 입력해 주세요 :");
        return scanner.nextLine();
    }

    public int restartInput(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return scanner.nextInt();
    }

    public boolean isContinue(int startOrEnd){
        return startOrEnd==1;
    }
}
