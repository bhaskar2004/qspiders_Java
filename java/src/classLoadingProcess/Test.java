package classLoadingProcess;

public class Test {

    static int a;
    static {
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a =10;
        System.out.println(a);
        System.out.println(Test.a);
        test();

    }
    public static void test(){
        System.out.println(a);
    }
}
