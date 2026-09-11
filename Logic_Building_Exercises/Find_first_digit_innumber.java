import java.util.*;
public class Find_first_digit_innumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=input.nextInt();
        while(n>=10){
            n=n/10;
        }
        System.out.println("First digit of a number :"+n);
        
    }
    
}
