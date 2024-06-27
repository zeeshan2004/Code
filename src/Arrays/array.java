package Arrays;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] marks = new int [3];
        System.out.println("Enter Physics Number: ");
        marks [0]=sc.nextInt();
        System.out.println("Enter Math Number: ");

        marks [1]=sc.nextInt();
        System.out.println("Enter English Number:");
        marks [2]=sc.nextInt();

for(int i = 0 ; i<3;i++){
    System.out.println(marks[i]);

}
    }
}
