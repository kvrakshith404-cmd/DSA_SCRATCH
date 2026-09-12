package PatternBase;
import java.util.*;
public class Inverted_right_angleTriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Value for N:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
