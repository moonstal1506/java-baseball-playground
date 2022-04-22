package calculator;

public class Number {

    private String number;

    public Number(String number) {
        checkValidation();
        this.number=number;
    }

    private boolean isNullOrEmpty() {
        return number == null || number.equals("");
    }

    private void checkValidation() {
        if (isNullOrEmpty()) {
            throw new IllegalArgumentException("값을 입력해야합니다.");
        }
    }
}
