import java.util.*;
public class Simple_intrest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        float p=input.nextFloat();
        System.out.print("Enter the Rate:");
        float r=input.nextFloat();
         System.out.print("Enter the Time:");
        float t=input.nextFloat();
        //SI=(p*r*t)/100
        float SI=(p*r*t)/100;
        System.out.print("SImple Intrest = "+SI);
}
    
}
