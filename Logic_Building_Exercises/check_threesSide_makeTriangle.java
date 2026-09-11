import java.util.*;
public class check_threesSide_makeTriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        // triangle make when sum of 2 side is Greater than 3rd number
        System.out.println("Enter three sides :");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(((a+b)>c)&&((b+c)>a)&&((a+c)>b)){
            System.out.println("This three sides make a triangle.");
        }
        else{
            System.out.println("This three sides not make a Triangle!");
        }
    }
    
}
