import java.util.*;
public class Average_of_5_marks {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the 5 subjects marks");
        int sum=0;
        for(int i=1;i<=5;i++){
            int m=input.nextInt();
            sum+=m;
        }
        System.out.println("Avreage of 5 subjects marks: "+(sum/5));
        input.close();
    }
    
}
