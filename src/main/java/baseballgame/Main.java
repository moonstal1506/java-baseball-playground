package baseballgame;

public class Main {

    public static void playGame(){
        ComputerBalls computerBalls =new ComputerBalls();
        System.out.println(computerBalls.createBalls());
        boolean isAnswer=false;
        while(!isAnswer){
            InputView inputView = new InputView();
            UserBalls userBalls = new UserBalls(inputView.input());
            Counter counter = new Counter();

            int equalNumber= counter.countEqualNumber(computerBalls.createBalls(),userBalls.getBalls());
            int equalSpace= counter.countEqualSpace(computerBalls.createBalls(),userBalls.getBalls());

            Judgement judgement = new Judgement(equalNumber,equalSpace);
            isAnswer = judgement.isAnswer();
            ResultView resultView = new ResultView();
            resultView.printResult(judgement.judge());
        }
    }

    public static void main(String[] args) {
        boolean isContinue=true;
        while(isContinue){
            playGame();
            InputView inputView = new InputView();
            inputView.restartInput();
            isContinue=inputView.isContinue();
        }

    }
}
