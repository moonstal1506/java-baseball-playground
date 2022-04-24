package baseballgame;

import java.util.ArrayList;
import java.util.List;

public class UserBalls {
    private final List<Integer> balls = new ArrayList<>();
    private final int BALLS_SIZE = 3;

    public UserBalls(String balls) {
        createBalls(balls);
    }

    private void createBalls(String balls) {
        checkBallsSize(balls);
        CheckIsNumber(balls);
        for (String ball : splitBalls(balls)) {
            addBall(CheckNumberRange((toInts(ball))));
        }
    }

    private String[] splitBalls(String balls) {
        return balls.split("");
    }

    private void CheckIsNumber(String balls) {
        boolean isNumber = balls.matches("[+-]?\\d*(\\.\\d+)?");
        if (!isNumber) {
            throw new IllegalArgumentException("숫자를 입력해야합니다.");
        }
    }

    private int toInts(String ball) {
        return Integer.parseInt(ball);
    }

    private void addBall(int ball) {
        if (balls.contains(ball)) {
            throw new IllegalArgumentException("중복된 숫자입니다.");
        }
        balls.add(ball);
    }

    private void checkBallsSize(String balls) {
        if (balls.length() != BALLS_SIZE) {
            throw new IllegalArgumentException("숫자 3개를 입력해주세요");
        }
    }

    private int CheckNumberRange(int ball) {
        if (!(1 <= ball && ball <= 9)) {
            throw new IllegalArgumentException("1~9까지 입력해주세요");
        }
        return ball;
    }

    public List<Integer> getBalls() {
        return balls;
    }
}
