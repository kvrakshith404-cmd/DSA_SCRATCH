import java.util.*;
public class N_star_inRow {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value for N:");
        int N=input.nextInt();
        for(int i=1;i<=N;i++){
            // Star Pattern
            System.out.print("*");
        }
        input.close();
    }
}
