import java.util.*;
public class Maximum_3numbers {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the 3 numbers :");
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();

    if((a>b)&&(a>c)){
        System.out.print("Maximum number is "+a);
    }
    else if((b>a)&&(b>c)){
        System.out.print("Maximum number is "+b);
    }
    else{
        System.out.print("Maximum number is "+c);
        }
    }
}
