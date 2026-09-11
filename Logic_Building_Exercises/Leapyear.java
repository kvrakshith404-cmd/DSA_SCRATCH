import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("ENter the year :");
        int n=input.nextInt();
        // Leap year is a year that comes after 4 years so it is divisble by 4 and the year with 00 not leap and the year is leap when it is divisible by 400 to to maintain exact year 
        if((((n%4)==0) && ((n%100)!=0))||(((n%400)==0))) {
            System.out.println("Leap Year.");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }

    
}
