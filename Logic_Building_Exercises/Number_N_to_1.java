import java.util.*;
public class Number_N_to_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value for N: ");
        int N=input.nextInt();
        System.out.println("Number from "+N+" to 1:");
        for(int i=N;i>0;i--){
            System.out.print(i+" ");
        }
    }
    
}
