package Constractor;

public class default_constractor {
    String name = "Zeeshan";
    String adress = "3518 New Creek Roa City Albertville";
    int age = 16;
    int  number = 076212311 ;


    int display() {

        System.out.println("Name : " + name);
        System.out.println("Adress : " + adress);
        System.out.println("Age : " + age);
        System.out.println("Number : " + number);
        return 0;
    }

    public static void main (String arg[]){
        default_constractor obj = new default_constractor();
        obj.display();
    }
}
