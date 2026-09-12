import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the radius of Circle:");
        float r=input.nextFloat();
        System.out.println("Area of Circle = "+(3.14F*r*r));
        input.close();
    }
}
