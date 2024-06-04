package This;
public class Fried {
    String name;
    int number ;

    Fried(String name , int number){
        this.name =name;
        this.number=number;
    }

    public static void main (String arg[]){
        Fried obj = new Fried("Zeeshan",90);
        System.out.println("My name is : "+obj.name);
        System.out.println("And the number i like in : "+obj.number);

    }
}
