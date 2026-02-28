package typeCasting;

public class doubleTOlong {
    public static void main(String[] args) {
        double d=435.4556;
        long l = (long)d; // narrowing , explicit conversion
        System.out.println(d+" "+l);
    }

}
