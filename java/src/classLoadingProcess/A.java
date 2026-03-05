package classLoadingProcess;

public class A {
    static int a;
    static {
        System.out.println(a);
        a=10;
    }
    static {
        System.out.println(a);
        a=++a;
    }

}
class Test1{
    static int a;
    static {
        System.out.println(a);
        a=A.a;
        a++;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(A.a);
    }
}
