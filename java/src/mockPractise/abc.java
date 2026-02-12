package mockPractise;

public class abc extends singelLevelInheritance{

    public void sound(){
        System.out.println("meow");
    }

    public static void main(String[] args) {
        abc a = new abc();
        a.eat();
        a.sound();
    }
    
}
