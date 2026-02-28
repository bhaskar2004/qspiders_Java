package typeCasting;

public class longTodouble {
    public static void main(String[] args) {
        long l=89345L;
        double d =l; // widening , implicit conversion
        System.out.println(l+" "+d);

        d=(double) l;
        System.out.println(l+" "+d);

    }
}
