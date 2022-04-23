package baseballgame;

public class Main {
    public static void main(String[] args) {
        ComputerBalls computerBalls =new ComputerBalls();
        System.out.println(computerBalls.createBalls());
        int equalSpace=0;
        while(equalSpace!=3){
            InputView inputView = new InputView();
            UserBalls userBalls = new UserBalls(inputView.input());
            Counter counter = new Counter();

            int equalNumber= counter.countEqualNumber(computerBalls.createBalls(),userBalls.getBalls());
            equalSpace= counter.countEqualSpace(computerBalls.createBalls(),userBalls.getBalls());

            Judgement judgement = new Judgement(equalNumber,equalSpace);
            ResultView resultView = new ResultView();
            resultView.printResult(judgement.judge());
        }

    }
}
