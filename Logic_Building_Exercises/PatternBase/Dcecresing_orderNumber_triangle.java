package PatternBase;
import java.util.*;
class Dcecresing_orderNumber_triangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n=input.nextInt();
 for(int i=1;i<=n;i++){
    for(int j=n;j>(n-i);j--){
        System.out.print(j+" ");
          }
    System.out.println();
                      } 
 input.close();  
    }

    
}
