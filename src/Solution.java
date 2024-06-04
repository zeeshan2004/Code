class Alpha {
    void use()
    {
        System.out.println("user name:");
    }
}
class game {
    String a="Zeeshan";
    int pin=2350;
}
class beta extends game{
    void name(){
        System.out.println("name:");


        System.out.println(a);

    }}
class New extends game{
    void pin(){
        System.out.println("pin:");
        System.out.println(pin);
    }
}
class Solution {
    public static void main(String args[]){
        beta obj=new beta();
        New obj1=new New();
        obj.name();
        obj1.pin();

    }
}