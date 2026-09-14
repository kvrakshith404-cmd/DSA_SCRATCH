import java.util.*;

public class BInomial_coefficient {
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n=input.nextInt();
        System.out.println("Enter value for r:");
        int r=input.nextInt();
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r=factorial(n-r);
        // Binomial coefficient =(n!)/(r!*(n-r)!)
        int B =(n_fact)/(r_fact*n_r);
        System.out.println("Binomial Coefficient : "+ B);

    }
    
}
