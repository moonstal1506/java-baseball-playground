package baseballgame;

public class Main {

    public static void playGame() {
        ComputerBalls computerBalls = new ComputerBalls();
        System.out.println(computerBalls.getBalls());
        boolean isAnswer = false;

        while (!isAnswer) {
            InputView inputView = new InputView();
            UserBalls userBalls = new UserBalls(inputView.input());

            Counter counter = new Counter();
            int equalNumber = counter.countEqualNumber(computerBalls.getBalls(), userBalls.getBalls());
            int equalSpace = counter.countEqualSpace(computerBalls.getBalls(), userBalls.getBalls());

            Result result = new Result(equalNumber, equalSpace);
            isAnswer = result.isAnswer();

            ResultView resultView = new ResultView();
            resultView.printResult(result.report());
        }
    }

    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
            playGame();
            InputView inputView = new InputView();
            inputView.restartInput();
            isContinue = inputView.isContinue();
        }
    }
}
