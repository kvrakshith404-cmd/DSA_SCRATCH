import java.util.*;
public class Even_in_range {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the starting point of range:");
        int s=input.nextInt();
        System.out.print("Enter the Ending point of range:");
        int e=input.nextInt();
        System.out.println("Even numbers in Range "+s+" to "+e);
        
        for(int i=s;i<=e;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }
}
