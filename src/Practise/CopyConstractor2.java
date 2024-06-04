package Practise;

class CopyConstractor2 {

    String name;
    int number;
    int age;


    CopyConstractor2(CopyConstractor2 io2) {
        name = io2.name;
        number = io2.number;
        age = io2.age;
    }

    void display() {
        System.out.println(name);
        System.out.println(number);
        System.out.println(age);
    }
CopyConstractor2(){}

    public static void main(String[] args) {
        CopyConstractor2 io = new CopyConstractor2();
        io.name = "Zeeshan";
        io.number = 89;
        io.age = 43;

        CopyConstractor2 io2 = new CopyConstractor2(io);
        io2.display();
    }
}

