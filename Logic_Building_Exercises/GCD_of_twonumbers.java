import java.util.*;
public class GCD_of_twonumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the the two numbers :");
        int a=input.nextInt();
        int b=input.nextInt();
         while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD of Two numbers = "+a);
    }
    
}
