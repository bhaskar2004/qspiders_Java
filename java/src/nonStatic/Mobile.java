package nonStatic;

public class Mobile {
    String name;
    double price;

}

class Test{
    public static void dispaly(String name , double price){
        System.out.println("name : "+ name);
        System.out.println("price : "+ price);
    }

    public static void main(String[] args) {
        Mobile m1= new Mobile();
        m1.name="apple";
        m1.price=79999;
        dispaly(m1.name,m1.price);

        Mobile m2= new Mobile();
        m2.name="pixel";
        m2.price=74999;
        dispaly(m2.name,m2.price);
    }
}
