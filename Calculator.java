import java.util.Scanner;

public class Calculator extends AppFactory {
    private static double rezult;

        static void multiplication(double a, double b) {
         rezult = a * b;
    }

    static void division(double a, double b) {
         rezult = a / b;
    }

    static void addition(double a, double b){
     rezult = a + b;
    }

    static void subtraction(double a, double b) {
     rezult = a - b;
    }

    public static void main(String[] args) {
        System.out.println("Введите выражение умножения *, деления/,вычитания - или сложения + через пробел");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String operator = scanner.next();
        double b = scanner.nextDouble();
        switch (operator) {
            case "*":
                AppFactory.message = "multiplication";
                multiplication(a, b);
                AppFactory.main(args);
                System.out.println(rezult);
                break;
            case "/":
                AppFactory.message = "division";
                division(a, b);
                AppFactory.main(args);
                System.out.println(rezult);
                break;
            case "+":
                AppFactory.message = "addition";
                addition(a, b);
                AppFactory.main(args);
                System.out.println(rezult);
                break;
            case "-":
                AppFactory.message = "subtraction";
                subtraction(a, b);
                AppFactory.main(args);
                System.out.println(rezult);
                break;
        }
    }
}