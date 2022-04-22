package calculator;

public class Number {

    private String number;
    private String[] numbers;

    public Number(String number) {
        checkValidation(number);
        this.number = number;
        this.numbers= spiltBySpace();
    }

    private void checkValidation(String number) {
        if (isNullOrEmpty(number)) {
            throw new IllegalArgumentException("값을 입력해야합니다.");
        }
    }
    private boolean isNullOrEmpty(String number) {
        return number == null || number.equals("");
    }

    private String[] spiltBySpace() {
        return number.split(" ");
    }

    public String[] getNumbers() {
        return numbers;
    }
}
