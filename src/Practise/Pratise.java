package Practise;

     class def {
        def(){

        }
        String name="unknwn";
        int number=0;
        int startDay=1, startMonth=1, startYear=2018;
        double pay=2000;
        void display(){
            System.out.println("name"+name);
            System.out.println("number"+number);
            System.out.println("startday"+startDay);
            System.out.println("startmonth"+startMonth);
            System.out.println("startyear"+startYear);
            System.out.println("name"+pay);}
        public static void main (String arg[]) {
            def obj1 = new def();
            obj1.display();
        }    }

