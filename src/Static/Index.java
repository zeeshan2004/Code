package Static;
class School {
    //1
    String name;
    static String School;
//2
    public static void Function() {
        System.out.println("I'm static Function ");
    }
//3 Static block
    static {
    System.out.println("static BLock");
}
}
public class Index {

    public static void main(String[] args) {
        School.School = "Iqra";
        System.out.println("Static value " + School.School);
        School Student1 = new School();
        Student1.name = "Dany";

        Student1.School = "Kasbit";
        System.out.println(Student1.name); //  call the String name
        System.out.println("Object value " + Student1.School); //  call the String name

        Student1.Function();// calling static Fuction

    }

}

