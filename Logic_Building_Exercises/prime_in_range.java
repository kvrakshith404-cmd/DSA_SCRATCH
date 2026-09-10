import java.util.*;
public class prime_in_range {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the start point:");
      int  s=input.nextInt();
        System.out.print("Enter the end point:");
        int e=input.nextInt();
        System.out.println("Prime in range "+s+" to "+e+" :");
        for(int i=s;i<=e;i++){
            if(i<=1)
                {
                continue;
                }
            boolean check=true;
            for(int j=2;j<i;j++){
                if((i%j)==0){
                    check=false;
                  }
            }
            if(check){
                System.out.print(i+" ");
            }
        }
    }   
}
