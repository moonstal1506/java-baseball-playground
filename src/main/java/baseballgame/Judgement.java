package baseballgame;

public class Judgement {

    private int strike;
    private int ball;

    public Judgement(int equalNumber,int equalSpace) {
        this.strike = equalSpace;
        this.ball = equalNumber-equalSpace;
    }

    public boolean isAnswer(){
        return strike==3;
    }

    public String judge(){
        if(isNothing()){
            return "낫싱";
        }
        if(isOnlyBall()){
            return ball+"볼";
        }
        if(isOnlyStrike()){
            return strike+"스트라이크";
        }
        return strike+"스트라이크 "+ball+"볼";
    }

    private boolean isNothing(){
        return strike==0&&ball==0;
    }

    private boolean isOnlyBall(){
        return strike==0&&ball!=0;
    }

    private boolean isOnlyStrike(){
        return strike!=0&&ball==0;
    }
}
