package classLoadingProcess;

public class B {
    static int a ;
    static {
        System.out.println("SIB-B");
    }

}
class C{
    static {
        System.out.println("SIB-C");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println(B.a);
        System.out.println("main end ");
    }
}
