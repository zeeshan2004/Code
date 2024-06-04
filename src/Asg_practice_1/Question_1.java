package Asg_practice_1;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sum, a, b;
        System.out.println("Enter number for Operate Arithmetic  operate : \n 1 For Addition \n 2 For Subtractions \n 3 For Multiplication\n 4 For Division");
        Sum = sc.nextInt();
        System.out.println("Enter  a :");
        a = sc.nextInt();
        System.out.println("Enter  b :");
        b = sc.nextInt();
        switch (Sum) {
            case 1: {
                int c = a + b;
                System.out.println("The Addition of a : " + a + " and  " + b + " is " + c);
                break;
            }
            case 2: {
                int c = a + b;
                System.out.println("The Subtraction of a : " + a + " and  " + b + " is " + c);
                break;
            }
            case 3: {
                int c = a + b;
                System.out.println("The Multiplication of a : " + a + " and  " + b + " is " + c);
                break;
            }
            case 4: {
                int c = a + b;
                System.out.println("The Division of a : " + a + " and  " + b + " is " + c);
                break;
            }


        }
    }
}
