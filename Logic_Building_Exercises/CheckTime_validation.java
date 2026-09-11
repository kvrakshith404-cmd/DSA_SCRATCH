import java.util.*;
public class CheckTime_validation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Hour: ");
        int hh=input.nextInt();
        System.out.print("Enter the Minutes: ");
        int mm=input.nextInt();
        if(((0<=hh)&&(hh<=23))&&((0<=mm)&&(mm<=59))){
            System.out.println("Valid Time");
        }
        else{
            System.out.println("Not valid Time");
        }
    }
    
}
