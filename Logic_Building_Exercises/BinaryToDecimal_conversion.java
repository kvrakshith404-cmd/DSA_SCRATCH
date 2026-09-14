import java.util.*;
public class BinaryToDecimal_conversion {
    public static void Decimal_Conersion(int bi){
        int dec=0;
        int p=0;
        int n=bi;
        while(n>0){
            int l=n%10;
            n=n/10;
            dec=dec+(int)Math.pow(2,p)*l;
            p++;
        }
        System.out.println("Decimal of "+bi+" = "+dec);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Binary Number:");
        int bi=input.nextInt();
        Decimal_Conersion(bi);
    }

    
}
