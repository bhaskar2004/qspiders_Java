package typeCasting;

public class intTofloat {
    public static void main(String[] args) {
        int i =10;
        float f=i; // widening implicit conversion
        System.out.println(i+" "+f);

        f=(float) i; // widening explicit conversion
        System.out.println(i+" "+f);
    }
}
