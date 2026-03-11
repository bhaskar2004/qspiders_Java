package classLoadingProcess;

public class A1 {
    static int a=10;
    static {
        System.out.println("SIB A1");
        a=a+5;
    }
}
class B1{
    static int b=A1.a;
    static {
        System.out.println("SIB B1");
        b=b+10;
    }

    static {
        System.out.println("SIB B2");
        b=b+3;
    }
}

class C1{
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(A1.a);
        System.out.println(B1.b);
    }
}
