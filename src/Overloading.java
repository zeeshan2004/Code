import javax.xml.namespace.QName;


     class Computer {
        String Name;
        int a;
        void Keyword(int a) {
            System.out.println("1 Number" + a);
        }

        void Keyword(int a, String Name) {
            System.out.println("Name " + Name + " and " + a);
        }

        void Keyword(String Name) {
            System.out.println("Name " + Name);

        }
    }
public class Overloading {
    public static void main(String[] args) {
        Computer Co = new Computer();
Co.Name="zeeshan";
Co.a = 98;
Co.Keyword( Co.a);
Co.Keyword(Co.a, Co.Name);

    }
}
