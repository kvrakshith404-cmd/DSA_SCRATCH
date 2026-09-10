import java.util.*;
public class Count_digits_in_a_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N=input.nextInt();
        int count=0;
        while(N!=0){
            N=N/10;
            count+=1;
        }
        System.out.println("NUmber of digits : "+count);
    }
    
}
