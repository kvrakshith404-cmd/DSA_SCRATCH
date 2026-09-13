import java.util.*;
class Ternary_prac {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in) ;
    // Program for senior citizen check
    System.out.print("Enter the age: ");
    int age=input.nextInt();
    String result=(age>=45)?"Senior" :"Not Senior";
    System.out.println(result);
    input.close();
    }
    
}