    package Arrays;

    import java.util.Scanner;

    public class Q_one {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the Size  of Array : ");

            int size = sc.nextInt();
            int Numbers[]=new int[size];



            System.out.println("enter the Number  of Array : ");
            for(int a = 0 ; a<size ;a++){
                Numbers[a] = sc.nextInt();
            }
            System.out.println("The Arrays : ");

            for(int b = 0 ; b<size;b++){
                System.out.println(Numbers[b]);
            }
            /* FIRST  ATTEMPT
             for find the array
            System.out.println("to find the number:");
            int find = sc.nextInt();
            System.out.println("finding the .........."+find);
            if(find==find){
                System.out.println("Achived");
                System.out.println(Numbers[size]);  // check her
            }
            else {
                System.out.println("Boss");
            }*/

            // Now find the array and also the address
            System.out.println("to find the number:");

            int find = sc.nextInt();
            boolean found = true;
            System.out.println("finding the .........."+find);

            for(int i = 0 ; i<size;i++){

            if(find==Numbers[i]) {
                System.out.println("found the  Array number : "+ Numbers[i] +" on index : " + i);
                break;
            }
            /*   else  {
                               System.out.println("Not found on index"+ i );

                    System.out.println("Not found :(");
                }*/
if (!found){
                System.out.println("Not found :(");
            }



            }
        }
    }
