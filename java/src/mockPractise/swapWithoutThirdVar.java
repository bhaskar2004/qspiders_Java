package mockPractise;

public class swapWithoutThirdVar {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("before swap a = "+a+" and b ="+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("afetr swap a = "+a+" and b ="+b);

    }
}
