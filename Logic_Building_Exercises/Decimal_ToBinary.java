import java.util.*;
public class Decimal_ToBinary {
    public static void Binary_Convert(int Dec){
        int Bi=0;
        int n=Dec;
        int p=0;
        while(n>0){
            int rem=n%2;
            n=n/2;
            Bi=Bi+(int)Math.pow(,p)*rem;
            p++;
        }
        System.out.println("Binary Conversion of "+Dec+" = "+Bi);
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ENter the Decimal Number :");
        int  Dec=input.nextInt();
        Binary_Convert(Dec);
    }
    
}
