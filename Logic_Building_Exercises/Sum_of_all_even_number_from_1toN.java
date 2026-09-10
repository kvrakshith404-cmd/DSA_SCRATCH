import java.util.*;
public class Sum_of_all_even_number_from_1toN {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter value for N:");
        int N=input.nextInt();
        int Sum=0;
        for(int i=1;i<=N;i++){
            // check even 
            if(i%2==0){
                Sum+=i;
            }
        }
        System.out.println("Sum = "+Sum);
    }
    
}
