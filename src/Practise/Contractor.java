package Practise;

public class Contractor {
    String name;
    int number;
    int startDay, startMonth, startYear;
    float pay;

    Contractor(String name, int number, int startMonth, int startYear , int day) {
        this.name = name;
        this.number = number;
        this.startDay=day;
        this.startYear = startYear;
        this.startMonth = startMonth;
    }

    void display() {
        System.out.println(name);
        System.out.println(number);
        System.out.println(startDay);
        System.out.println(startMonth);
        System.out.println(startYear);
    }

    public static void main(String[] args) {
        Contractor obj1 = new Contractor("Unknow", 25,02,2024,14);
//        obj1.display();
        Contractor obj2 = new Contractor("Zeeshan", 87,10,2014,15);
        obj1.display();
        obj2.display();
    }
}
