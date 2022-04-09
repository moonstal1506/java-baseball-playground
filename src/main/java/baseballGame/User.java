package baseballGame;

import java.util.ArrayList;
import java.util.List;

public class User {

    public boolean validationCheck(String userNumber){
        return userNumber.length()==3;
    }

    public List<Integer> splitUserNumber(String userNumber){
        List<Integer> userNumbers = new ArrayList<>();
        for (String number : userNumber.split("")){
            userNumbers.add(Integer.parseInt(number));
        }
        return userNumbers;
    }
}
