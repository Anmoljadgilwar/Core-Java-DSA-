
import java.util.Scanner;

public class switch1 {

    public static void main(String[] args) {

        String c;
        float a, b, result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        a = sc.nextFloat();
        System.out.println("Enter the operator ");
        c = sc.next();
        System.out.println("Enter the second number ");
        b = sc.nextFloat();

        switch (c) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Please Enter valid operator");

        }

        System.out.println("result = " + result);
    }
}
