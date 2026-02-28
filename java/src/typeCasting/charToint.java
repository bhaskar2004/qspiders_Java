package typeCasting;

public class charToint {
    public static void main(String[] args) {
        char c = 'a';
        int i = c; // widening , implicit conversion
        System.out.println(c+" "+i);

        i=(int) c; // widening explicit conversion
        System.out.println(c+" "+i);


        i=3;
        c=(char) i;
        System.out.println(i+" "+c);
    }
}
