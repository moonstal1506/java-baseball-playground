package baseballgame;

import java.util.List;

public class Result {

    private int strike=0;

    public int countStrike(List<Integer> computerBalls,List<Integer> userBalls){
        for(int i=0;i<computerBalls.size();i++){
            if(computerBalls.get(i).equals(userBalls.get(i))){
                strike++;
            }
        }
        return strike;
    }

}
