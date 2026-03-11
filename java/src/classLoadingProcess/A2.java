package classLoadingProcess;

public class A2 {
    static int a=5;
    static {
        System.out.println("SIB A");
        a=a*2;
    }
    static void display(){
        System.out.println("display : "+ a);
    }
}
class B2{
    static int b=A2.a;
    static {
        System.out.println("SIB B2");
        b=b+10;

    }
    static void show(){
        A2.display();
        System.out.println("B2 show : "+ b);
    }
}

class c2{
    public static void main(String[] args) {
        B2.show();
    }
}
