package baseballGame;

import java.util.ArrayList;
import java.util.List;

public class User {
    public List<Integer> splitUserNumber(String userNumber){
        List<Integer> userNumbers = new ArrayList<>();
        for (String number : userNumber.split("")){
            userNumbers.add(Integer.parseInt(number));
        }
        return userNumbers;
    }
}
