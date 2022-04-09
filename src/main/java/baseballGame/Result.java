package baseballGame;

public class Result {

    public String judge(int equalNumber,int equalSpace){
        int ball=equalNumber-equalSpace;
        int strike=equalSpace;
        if(ball==0&&strike!=0){
            return strike+"스트라이크";
        }
        if(ball!=0&&strike==0){
            return  ball+"볼";
        }
        if(ball!=0&&strike!=0){
            return  ball+"볼 "+strike+"스트라이크";
        }
        return "낫싱";
    }
}
