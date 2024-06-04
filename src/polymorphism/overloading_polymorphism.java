package polymorphism;


      class Example_1{
        void display(String Name){
            System.out.println(Name);
        }

        void display(int age){
            System.out.println(age);
        }
        void display(String Name,int age){
            System.out.println(Name + " " +age );
        }

    }
public class overloading_polymorphism {
    public static void  main(String[] args) {
Example_1 obj = new Example_1();

obj.display(7);
        obj.display("Zeeshan",7);
        obj.display("Jonh");

    }
}
