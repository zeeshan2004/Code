package Practise;

public class OverlodingConstorctor {


    //instance variables of the class
    int id;
    String name;

    OverlodingConstorctor() {
        System.out.println("this a default constructor");
    }

    OverlodingConstorctor(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
//object creation
        OverlodingConstorctor s = new OverlodingConstorctor();
        System.out.println("\nDefault Constructor values: \n");
s.id=23;
s.name="Zeeshan";
        System.out.println("Student Id : " + s.id + "\nStudent Name : " + s.name);

        System.out.println("\nParameterized Constructor values: \n");
        OverlodingConstorctor student = new OverlodingConstorctor(10, "David");
        System.out.println("Student Id : " + student.id + "\nStudent Name : " + student.name);
    }
}

