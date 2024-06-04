package This;
 class School{
    String Student;
    int id;

    void Student (String S , int i){
this.Student =S;
this.id=i;
    }


    void display(){
        System.out.println("The student name is : " +Student);
        System.out.println("The Id  is : " +id);

    }
}

public class Example_2 {
    public static void main (String arg[]){
        School obj = new School();
        obj.Student = "Zeeshan";
        obj.id=19159;
        obj.display();

// Second value of data

        School obj2 = new School();
        obj2.Student = "Ali";
        obj2.id=19187;
        System.out.println();
        obj2.display();
    }
}
