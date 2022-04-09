package calculator;

import java.util.Scanner;

public class Calculator {

    public String input(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }

    public String[] split(String value){
        String[] values = value.split(" ");

        return values;
    }

    public static void main(String[] args) {

    }
}
