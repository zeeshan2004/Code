package inheritance;
import java.util.*;

class shapes {
    void area() {
        System.out.println("The shape is : Cricle");
    }
}

class triangles extends shapes {
    void display(int b, int a) {
        a = b * a;
        System.out.println("Ans is :" + a);

    }

}
public class single_level_inheritance_pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        triangles t1 = new triangles();
        t1.display(a, b);
        t1.area();
    }
}


