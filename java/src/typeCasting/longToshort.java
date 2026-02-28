package typeCasting;

public class longToshort {
    public static void main(String[] args) {
        long l = 12345678L;
        short s = (short) l; // narrowing , explicit conversion
        System.out.println(l+" "+ s);
    }
}
