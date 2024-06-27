package Ds_project;

import java.util.Scanner;

public class Copy_of_ds_project {

     static class contact {
        String name;
        int number;

//     contact(String n , int num){   // Making the ContactConstructor TO transfer the Data in to Main Varibles
//       this.name=n;
//           this.number=num;
//    }
           void  print(){
            System.out.println("Name : "+ name);
            System.out.println("Number " + number);
        }
    }
// Scanner For switch case
    public static void main(String[] args) {
        contact obj = new contact();


        Scanner sc = new Scanner(System.in);

        obj.name = sc.nextLine();
        obj.number = sc.nextInt();

        System.out.println("Enter ");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                obj.print();
                break;

        }


    }
}


