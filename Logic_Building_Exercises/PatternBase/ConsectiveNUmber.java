package PatternBase;
import java.util.*;
public class ConsectiveNUmber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers of rows :");
        int n=input.nextInt();
        int val=1;
        // pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
        System.out.print(val+" ");
        val+=1;  //value increase by 1
    }
    System.out.println();
}
input.close();

    }
}
