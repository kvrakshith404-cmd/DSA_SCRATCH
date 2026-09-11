import java.util.*;
public class Largest_digit_in_number {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Ener the number :");
        int n=input.nextInt();
        if(n==0){
            System.out.println("Largest Digit in a number : "+n);
            return;
        }
        int L=Integer.MIN_VALUE;

        while(n!=0){
            int last =n%10;
            n=n/10;
            if(last>L){
                L=last;
            }
        }
        System.out.println("Largest Digit in a number: "+L);

    }
    
}
