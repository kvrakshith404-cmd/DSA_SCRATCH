import java.util.*;
public class Prime_number_checker {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("ENter the Number :");
        int n=input.nextInt();
        int Fact=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                Fact+=1;
            }
        }
        if(Fact==2){
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not Prime number.");
        }


    }
    
}
