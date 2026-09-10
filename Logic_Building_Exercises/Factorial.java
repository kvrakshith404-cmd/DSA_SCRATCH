import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        {
            Scanner input =new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n=input.nextInt();
            if(n==0){
                System.out.println("Factorial of 0 is 1");
            }
            int fact=1;
            for(int i=n;i>=1;i--){
                fact*=i;
            }
            System.out.println("Factorial of "+n+ " is "+fact);
        
        }
    }
    
}
