package baseballGame;

import java.util.List;
import java.util.Scanner;

public class BaseballGame {

    Scanner scanner = new Scanner(System.in);

    public void playBaseballGame() {
        Computer computer = new Computer();
        List<Integer> computerNumbers = computer.createNumbers();
        System.out.println(computerNumbers);
        int equalSpace = 0;
        while (equalSpace != 3) {

            System.out.print("숫자를 입력해 주세요 : ");
            String StringUserNumbers = scanner.nextLine();

            User user = new User();
            if (!user.validationCheck(StringUserNumbers)) {
                continue;
            };
            List<Integer> userNumbers = user.splitUserNumber(StringUserNumbers);

            Checker checker = new Checker();
            int equalNumber = checker.countEqualNumber(computerNumbers, userNumbers);
            equalSpace = checker.countEqualSpace(computerNumbers, userNumbers);

            Result result = new Result();
            String judgement = result.judge(equalNumber, equalSpace);
            System.out.println(judgement);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.playBaseballGame();
    }
}
