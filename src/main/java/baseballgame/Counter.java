package baseballgame;

import java.util.List;

public class Counter {

    public int countEqualSpace(List<Integer> computerBalls, List<Integer> userBalls) {
        int equalSpace = 0;
        for (int i = 0; i < computerBalls.size(); i++) {
            if (computerBalls.get(i).equals(userBalls.get(i))) {
                equalSpace++;
            }
        }
        return equalSpace;
    }

    public int countEqualNumber(List<Integer> computerBalls, List<Integer> userBalls) {
        int equalNumber = 0;
        for (int i = 0; i < computerBalls.size(); i++) {
            if (computerBalls.contains(userBalls.get(i))) {
                equalNumber++;
            }
        }
        return equalNumber;
    }

}
