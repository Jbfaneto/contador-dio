import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number");
        int number2 = sc.nextInt();

        try {
            contar(number1, number2);
        } catch (InvalidParamsException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }

    static void contar(int number1, int number2) throws InvalidParamsException {
        if (number1 > number2){
            throw new InvalidParamsException("The first number must be greater than the second number");
        }
        int count = number2 - number1;
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
}