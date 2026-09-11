import java.util.*;
public class check_palindrome_of_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=input.nextInt();
        // number less than 0 or negative number not palindrome
        if(n<0){
            System.out.println("Number is not Palindrome");
            return ;
        }
        // copy number to N to check palindrome after find its rev.
        int N=n;
        int rev=0;
        while(n!=0)
        {
     int l=n%10;
     rev=(rev*10)+l;
     n=n/10;
        }
        if(N==rev){
            System.out.println("Number is palindrome.");
        }
        else{
            System.out.println("Number is not palindrome");
        }


    }
    
}
