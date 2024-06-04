package basic_java;


import java.util.*;

public class Quiz_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Str = "kitten";


        System.out.println("Enter Number :");
        int a = sc.nextInt();
        System.out.println(Str.substring(a));

    }


}
//Mistakes
/*
        for (a = 0; a <= Str.length(); a++) {
        }// System.out.println();
public class Quiz_1 {
    public static void main(String[] args) {

        class hn {

            void missingChar(String str, int n) {
                Scanner sc = new Scanner(System.in);
str= sc.next();
                n = 0;
                String h = "kitten";
                String print = str.substring(n + 1, str.length());

                System.out.println( print + h);
            }
        }
    }
}*/
