import java.util.*;
public class sum_of_square_of_firstN_naturalnumbers {
    public static void main(String[] args) {
        // pow(1,2)+pow(2,2)+pow(3,2)+....+pow(N,2) time_complexity=O(n)
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        int N=input.nextInt();
        // pow(1,2)+pow(2,2)+pow(3,2)+....+pow(N,2) = (N(N+1)(2N+1))/6 time_complexity=O(1) better approach
        int Sum=(N*(N+1)*(2*N+1))/6;
        System.out.println("Sum of square of natural numbers :"+Sum);
    }
    
}
