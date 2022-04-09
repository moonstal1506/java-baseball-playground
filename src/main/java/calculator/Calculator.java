package calculator;

import java.util.Scanner;

public class Calculator {

    public String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public String[] split(String value){
        return value.split(" ");
    }

    public int makeInt(String value){
        return Integer.parseInt(value);
    }

    public static void main(String[] args) {

    }
}
