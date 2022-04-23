package baseballgame;

import java.util.ArrayList;
import java.util.List;

public class UserBalls {
    private List<Integer> balls= new ArrayList<>();
    private final int BALLS_SIZE=3;

    public UserBalls(String balls) {
        createBalls(balls);
    }

    private void createBalls(String balls){
        checkBallsSize(balls);
        for (String ball : splitBalls(balls)){
            addBall(CheckNumber((toInts(ball))));
        }
    }
    private String[] splitBalls(String balls){
        return balls.split("");
    }

    private int toInts(String ball){
          return Integer.parseInt(ball);
    }

    private void addBall(int ball){
        balls.add(ball);
    }

    private void checkBallsSize(String balls){
        if(balls.length()!=BALLS_SIZE){
            throw new IllegalArgumentException("숫자 3개를 입력해주세요");
        }
    }

    private int CheckNumber(int ball){
        if( !(1<=ball&&ball<=9)){
            throw new IllegalArgumentException("1~9까지 입력해주세요");
        }
        return ball;
    }

    public List<Integer> getBalls() {
        return balls;
    }
}
