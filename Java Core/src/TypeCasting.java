public class TypeCasting {

    public static void main(String[] args) {
        int a = 10;
        float b = a;
        System.out.println(b);
        narrow();
    }

//  this is Widening Casting

    //Below is NARROWING CASTING
    public static void narrow() {
        double d = 10.99;
        int i = (int) d;
        System.out.println(i);
    }
}