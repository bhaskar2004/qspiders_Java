package mockPractise;

public class addition {

    public void  add(){
        int a=10;
        int b=20;
        System.out.println(a+b);

    }

    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public int add(int a ,int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        addition a1 = new addition();
        a1.add();
        a1.add(10,30);
        System.out.println(a1.add(12,14,16));




    }
}
