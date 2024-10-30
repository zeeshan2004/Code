
import java.util.Scanner;

public class try1 {
    static {
        System.out.println("Press 1001 for the Calculator \nPress 1002 for Enter the Id and Password:");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Choose = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        if (Choose == 1002) {
            System.out.println("Wellcome to Our bank 🙏 \n Plese forward the details : \n Name : \n Number : " );

            class Details {

                String name = sc.next(); // Mistake stringScanner.next(); not nextline();
                int number = sc.nextInt();
            }

            class Data extends Details {
                void Locker() {
                    System.out.println("Hacked  data  ");
                    System.out.println("Name  : " + name);
                    System.out.println("Password : " + number);
                }
            }


            class hacker extends Details {
                void hack_name() {
                    System.out.println("the Hack name :" + name);
                }

            }
            class hacker1 extends hacker {
                void hack_pass() {
                    System.out.println("The Password : " + number);
                }
            }
/**/
            Data Hack = new Data();
//            hacker1 hc = new hacker1();
//            hc.hack_name();
//            hc.hack_pass();
            Hack.Locker();

//            sc.close();
        }


        try {
            // Calculator start *_*_*_*

            if (Choose == 1001) {


                int sum, red = 0, blue = 0, yellow = 0;
                float Subtraction = red - blue - yellow;
                System.out.println("enter the first Number Please :");
                red = sc.nextInt();
                System.out.println("enter the second Number Please :");
                blue = sc.nextInt();
                System.out.println("enter the third Number Please :");
                yellow = sc.nextInt();
                System.out.println("What you Want : \n 1: + \n 2:- \n 3:* \n 4:/ ");
                sum = sc.nextInt();
                int addition = red + blue + yellow;
               int  Multiplication = red * blue * yellow;
//                int Subtraction =
                switch (sum) {
                    case 1: {
                        System.out.println("Addition : " + addition);
                        break;
                    }


                    case 2: {
                        System.out.println("Subtraction : " + Subtraction);
                        break;
                    }
                    case 3: {
                        System.out.println("Multiplication  : " + red * blue * yellow);
                        break;
                    }
                    case 4: {
                        System.out.println("Division : " + addition/ 3);
                        break;
                    }
                }
            }

        } catch (Exception Z) {
            System.out.println("You enter a Wrong Word Crtl+r Please ");
        } finally {
            System.out.println("The End : { ");
        }


    }

}