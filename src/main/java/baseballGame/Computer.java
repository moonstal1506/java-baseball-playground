package baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    List<Integer> computerNumbers= new ArrayList();

    public List<Integer> createNumbers(){
        Random random = new Random();
        while(computerNumbers.size()<3){
            int number=random.nextInt(9)+1;
            if(!isDuplicated(number)){
                computerNumbers.add(random.nextInt(9)+1) ;
            }
        }
        return computerNumbers;
    }

    public boolean isDuplicated(int number){
        return computerNumbers.contains(number);
    }
}
