package DSA_SCRATCH.Logic_Building_Exercises;

import java.util.*;

public class Switch_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter the operator to perform operation(+,-,%,*,/):");
        char op = input.next().charAt();
        switch (op) {
            case '+':
                System.out.println("SUM = " + (a + b));
                break;
            case '-':
                System.out.println("SUBSTARCTION = " + (a - b));
                break;
            case '*':
                System.out.println("MULTIPLICATION = " + (a * b));
                break;
            case '%':
                System.out.println("MODULUS(Remainder) = " + (a % b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("DIVISION by Zero cause Error");
                } else {
                    System.out.println("DIVISION = " + (a / b));
                }
                break;
            default:
                System.out.println("NOt Valid Operator!");
        }
    }

}