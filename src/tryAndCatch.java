import java.util.*;

public class tryAndCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.println("Enter First number");
            a = sc.nextInt();
            System.out.println("Enter Second number");
            b = sc.nextInt();

            System.out.println("Enter Third number");
            c = sc.nextInt();

            a = a * b;
            c = a + c;
            System.out.println("the result " + c);
        } catch (Exception Z) {
            System.out.println("Something was wrong");
        } finally {
            System.out.println("The END : )");
        }

    }
}
