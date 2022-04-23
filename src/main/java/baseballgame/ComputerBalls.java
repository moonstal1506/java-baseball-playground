package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerBalls {
    private List<Integer> balls = new ArrayList<>();
    private Random random = new Random();
    private final int BALLS_SIZE = 3;

    public List<Integer> createBalls() {
        while (checkBallsSize()) {
            int ball = random.nextInt(9) + 1;
            if (!balls.contains(ball)) {
                balls.add(ball);
            }
        }
        return balls;
    }

    private boolean checkBallsSize() {
        return balls.size() < BALLS_SIZE;
    }
}
