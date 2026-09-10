import java.util.*;
public class SumofDigitOf_NUmber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the NUmber : ");
        int n=input.nextInt();
        int Sum=0;
        while(n!=0){
           int last_digit =n%10;
           Sum+=last_digit;
           n=n/10;
         }
         System.out.println("Sum of Digits of a number = "+Sum);
         
        }
    
}
