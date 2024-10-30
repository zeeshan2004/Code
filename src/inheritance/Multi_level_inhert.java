package inheritance;


class Company {
    void area(){
        System.out.println("Wellcome to the company ");
    }
}

class SideBusiness extends Company{
    void Side(){
        System.out.println("Hey the name of the SideBusiness in Hello ");
    }
}
class MainBusiness extends SideBusiness{
    void Main(){
        System.out.println("Hey the name of the MainBusiness in HelloWorld ");
    }
}
public class Multi_level_inhert {
    public static void main(String arg[]){
        MainBusiness obj = new MainBusiness();
        obj.Side();     //MainBusiness call the uper class mehtode with the help of inheritance
    }
}
