import java .util.*;
public class Sum_of_N_numbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=input.nextInt();
        if(n==0){
            System.out.print("Sum = 0");
            return;
        }
        int sum=0;
        for(int i=1;i<=n;i++)
        {
                sum+=i;
        }
        System.out.println("Sum of numbers = "+sum);    
    }
}
