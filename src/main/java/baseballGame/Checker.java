package baseballGame;

import java.util.List;

public class Checker {
    public int countEqualNumber(List<Integer> computerNumbers, List<Integer> userNumbers){
        int count=0;
        for(int i=0;i<computerNumbers.size();i++){
            if(computerNumbers.contains(userNumbers.get(i))){
                count++;
            };
        }
        return count;
    }

}
