package PatternBase;
import java.util.*;
public class NXN_sqaure_stars {
  public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the value for N:");
    int N=input.nextInt();
    System.out.println("Square Pattern");
    for(int i=1;i<=N;i++){
        for(int j=1;j<=N;j++){
        System.out.print("*");
        }
        System.out.println();
    }
    input.close();
    
  }  
}
