import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first;
        double second;
        String operator;
        try {
            System.out.println("Podaj pierwszą liczbę: ");
            first = Double.parseDouble(sc.next());
            System.out.println("Podaj drugą liczbę: ");
            second = Double.parseDouble(sc.next());

            System.out.println("Podaj operator (*,-,/,+)");
            operator = sc.next();

            switch (operator) {
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                case "/":
                    if (second == 0) {
                        System.out.println(" Nie dziel przez zero ");
                    } else {
                        System.out.println(first / second);
                    }
                    break;
                default:
                    System.out.println(" Nie prawidłowa operacja ");
            }
        } catch (Exception ex) {
            System.out.println("Wprowadzono złe dane");
        }

    }
}
