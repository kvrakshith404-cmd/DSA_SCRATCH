package DSA_SCRATCH.Logic_Building_Exercises.PatternBase;

public class Hour_glass {
    public static void main(String[] args) {
        int n = 4;
        // 1st Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}