class st {

}
class check{
    private String name="Zeeshan";
    protected String n="Protected";


        String get(){
          return name;
    }
void set(String a){
          this.name=a;
}
}
class chi extends check{

}
    class bike {
        void met() {
            System.out.println("Methode 1 " );
        }
    }
        class thief extends bike {

            void met() {

                super.met();
                System.out.println("Methode 1 ");
            }
        }
      /*  void met(int a, int b) {
            System.out.println(b + "Methode 1 " + a);
        }*/





/*    obj.met(23);
    obj.met(23,9);*/
//    obj.met(23,"Zeshan");

    public class PApar {
        static String na;

        static {
            System.out.println("sajos");
        }
        public static void main(String[] args) {
            check obj = new check();
            chi ob = new chi();
            obj.get(); System.out.println("the name is "+ obj.get());
            obj.set("SAM");
//            String n = ob.n;
            System.out.println(ob.n);
            System.out.println("the name is "+ obj.get());
PApar oi= new PApar();

            PApar.na="static variable";

            System.out.println(oi.na);

        }
}

