package inheritance;

class Baap {
    void bolo() {
        System.out.println("say's");
    }
}

class bach1 extends Baap {
    void mano() {
        System.out.println("Agree");
    }
}

class bach2 extends Baap {
    void Zahirkaro() {
        System.out.println("Explain");
    }
}

public class Hierarchial_Inheritance_pratice {
    public static void main(String[] args) {

        bach1 obj = new bach1();
        System.out.println("Hierarchhial level Inheritance");

        obj.mano();
        obj.bolo();
    }
}

