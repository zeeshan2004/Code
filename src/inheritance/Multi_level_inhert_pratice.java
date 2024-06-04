package inheritance;

class Baa {
    void hukumat() {
        System.out.println("bhet jao ");
    }
}

class bacha1 extends Baa {
    void Agree1() {
        System.out.println("G acha");
    }
}

class bacha2 extends bacha1 {
    void Agree2() {
        System.out.println("G sahi");
    }
}

class bacha3 extends bacha2 {
    void Agree3() {
        System.out.println("G ok");
    }
}

    public class Multi_level_inhert_pratice {

        public static void main(String[] args) {

            System.out.println("Multi level Inheritance");

            bacha3 obj = new bacha3();
            obj.hukumat();
            obj.Agree3();
            obj.Agree2();
        }
    }