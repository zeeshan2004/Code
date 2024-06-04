package inheritance;

class shape {
    void area(){
        System.out.println("Shape");
    }
}

    class triangle extends shape{
        void area(int l , int h){
            System.out.println(2*l+h);
        }
}



public class single_level_inheritance {
    public static void main(String[] args) {


triangle obj = new triangle();
obj.area(4,5);
obj.area(); //                 they print "shape"
    }
}
