package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerBalls {
     private List<Integer> balls = new ArrayList<>();
     private Random random = new Random();
     private final int BALLS_SIZE=3;

     public List<Integer> createBalls(){
        while(checkBallsSize()){
            balls.add(random.nextInt(9)+1);
        }
        return balls;
     }

     private boolean checkBallsSize(){
         return balls.size()<BALLS_SIZE;
     }
}
