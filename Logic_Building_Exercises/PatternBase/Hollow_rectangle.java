 package DSA_SCRATCH.Logic_Building_Exercises.PatternBase;
import java.util.*;
public class Hollow_rectangle {
    public static void Hollow_Pattern(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i==1)||(i==r)||(j==1)||(j==c)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number of Rows and Columns :");
        int r=input.nextInt();
        int c=input.nextInt();
        Hollow_Pattern(r, c);
        input.close();
    }

    
}