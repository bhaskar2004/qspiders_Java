package classLoadingProcess;

public class example2 {
    static int a;
    static {
        System.out.println(a);
        a=17;
    }
    static {
        System.out.println(a);
        a=test(21);
    }
    public static int test(int a){
        return a+4;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }

}
