package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerBalls {
    private final List<Integer> balls = new ArrayList<>();
    private final Random random = new Random();
    private final int BALLS_SIZE = 3;

    public ComputerBalls() {
        createBalls();
    }

    private void createBalls() {
        while (checkBallsSize()) {
            int ball = random.nextInt(9) + 1;
            if (!balls.contains(ball)) {
                balls.add(ball);
            }
        }
    }

    private boolean checkBallsSize() {
        return balls.size() < BALLS_SIZE;
    }

    public List<Integer> getBalls() {
        return balls;
    }
}
