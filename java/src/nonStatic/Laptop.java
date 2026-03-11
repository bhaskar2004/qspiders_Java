package nonStatic;

public class Laptop {
    String name;
    double price;
}

class Test1{
    public static void dispaly(String name , double price){
        System.out.println("name : "+ name);
        System.out.println("price : "+ price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.name="hp";
        l1.price=65000;
        dispaly(l1.name, l1.price);

        Laptop l2 = new Laptop();
        l2.name="dell";
        l2.price=95000;
        dispaly(l2.name, l2.price);
    }
}
