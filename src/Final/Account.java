package Final;
public class Account {
    public static void main(String[] args) {
        class Bank {
            void userName() {
                System.out.println("Name : Zeeshan");
            }

//            final void password() {
             void password() {
                System.out.println("Password : 0987");
            }
        }

        class theif extends Bank {
            void userName() {
                System.out.println("Name : Zeeshan");

            }
            void password() {
                super.password();

            }
        }
        theif ob = new theif();
        ob.userName();
        ob.password();


    }
}