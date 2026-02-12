package mockPractise;

public class xyz extends singelLevelInheritance{
    public void sleep(){
        System.out.println("i am sleeping");
    }

    public static void main(String[] args) {
        xyz x = new xyz();
        x.sleep();
        x.eat();

    }
}
