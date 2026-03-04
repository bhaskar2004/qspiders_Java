package classLoadingProcess;

public class example {
    static int a;
    static {
        System.out.println(a);
        a=10;
    }
    public static void dispaly(){
        a++;
    }
    static {
        System.out.println(a);
        dispaly();
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
