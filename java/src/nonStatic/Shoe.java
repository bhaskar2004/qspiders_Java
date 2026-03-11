package nonStatic;

public class Shoe {
    String name;
    double price;
}

class Test2{
    public static void dispaly(String name,double price){
        System.out.println("name"+ name);
        System.out.println("price"+ price);
    }

    public static void main(String[] args) {
        Shoe s1=new Shoe();
        s1.name="nike";
        s1.price=6999;
        dispaly(s1.name,s1.price);

        Shoe s2= new Shoe();
        s2.name="Adidas";
        s2.price=4500;
        dispaly(s2.name, s2.price);
    }
}
