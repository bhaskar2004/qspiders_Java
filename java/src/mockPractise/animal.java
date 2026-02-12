package mockPractise;

public class animal {

    void sound(){
        System.out.println("i am making animal sound");
    }

}

class cat extends animal{
    @Override
    void sound(){
        System.out.println("meow meow ");


    }
}
class mian{
    public static void main(String[] args) {
        cat pussy=new cat();
        pussy.sound();
        pussy.sound();
    }
}