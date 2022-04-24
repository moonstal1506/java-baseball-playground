package baseballgame;

public class ResultView {

    public void printResult(String result) {
        System.out.println(result);
        if(result.equals("3스트라이크")){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }
}
