package Assingment;

import java.util.Scanner;

public class Ex_1 {
    double mark1;
    double mark2;
    double mark3;



    public void inputMarks() {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = SC.nextDouble();
        System.out.print("Enter mark 2: ");
        mark2 = SC.nextDouble();
        System.out.print("Enter mark 3: ");
        mark3 = SC.nextDouble();
    }

    void calculateSum() {
        double total = mark1 + mark2 + mark3;
        System.out.println("Total : " + total);
    }

    void calculateAvg() {

        double Sum = mark1 + mark2 + mark3;
        double Result =  Math.round(Sum / 300.0 * 100) ; // for rounding  the number
        System.out.println("The Average of the Student mark's is  " + Result + "%");

    }

    // Constructor initializes all data members to zero
    Ex_1() {
        mark1 = 0.0;
        mark2 = 0.0;
        mark3 = 0.0;
    }
    public static void main(String[] args) {

        Ex_1 Obj = new Ex_1();

        Obj.inputMarks();
        Obj.calculateSum(); // calling the function Who's print Total Marks Number's
        Obj.calculateAvg();   // calling the function how's print avg of 3 number

    }
}







