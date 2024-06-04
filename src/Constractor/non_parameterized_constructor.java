

package Constractor;

public class non_parameterized_constructor {

        String name;
        String processor;
        String operating_system;
        String ram;
        String memory;

        non_parameterized_constructor(String n , String p , String o , String r , String m) {
            name  = n;
            processor = p;
            operating_system =o ;
           ram= r;
            memory = m;
        }

        void print(){
            System.out.println("Name : " +name);
            System.out.println("Proccessor : "+processor);
            System.out.println("Operating system : " + operating_system);
            System.out.println("Ram : "+ram );
            System.out.println("memory : "+memory);
        }
        public static void main (String arg[]){
         non_parameterized_constructor obj = new non_parameterized_constructor("Qmobile","intel 17 v3","android 1.0 ","16gb ram","256 gb");
            obj.print();
        }
    }


