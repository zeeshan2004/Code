package Practise;

class CopyContractor {
    String name;
    int number;
    int startDay, startMonth, startYear;
    float pay;

    CopyContractor(CopyContractor Ref) {
       name = Ref.name;
        number = Ref.number;
       startDay = Ref.startDay;
      startYear = Ref.startYear;
      startMonth = Ref.startMonth;
    }

    void display() {
        System.out.println(name);
        System.out.println(number);
        System.out.println(startDay);
        System.out.println(startMonth);
        System.out.println(startYear);
    }

    CopyContractor() {

    }

    public static void main(String[] args) {
        CopyContractor obj1 = new CopyContractor();
        obj1.name = "Unknow";
        obj1.number = 25;
        obj1.startDay = 02;
        obj1.startYear = 2024;
        obj1.startMonth = 02;

        CopyContractor obj3 = new CopyContractor();
            obj3.name = "Zeeshna";
            obj3.number = 244;
            obj3.startDay = 04;
            obj3.startYear = 1224;
            obj3.startMonth = 121;


        CopyContractor obj2 = new CopyContractor(obj3);

        obj2.display();
    }
}
