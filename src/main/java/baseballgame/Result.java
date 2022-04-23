package baseballgame;

import java.util.List;

public class Result {

    private int strike=0;
    private int ball=0;

    public int countStrike(List<Integer> computerBalls,List<Integer> userBalls){
        for(int i=0;i<computerBalls.size();i++){
            if(computerBalls.get(i).equals(userBalls.get(i))){
                strike++;
            }
        }
        return strike;
    }

    public int countBall(List<Integer> computerBalls,List<Integer> userBalls){
        int equalBallNumber=0;
        for(int i=0;i<computerBalls.size();i++){
            if(computerBalls.contains(userBalls.get(i))){
                equalBallNumber++;
            }
        }
        this.ball=equalBallNumber-strike;
        return ball;
    }
}
