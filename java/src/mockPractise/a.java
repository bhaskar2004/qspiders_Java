package mockPractise;

public interface a {

    default void dispaly(){
        System.out.println("hi i am A");
    }


}
interface b{
    default void display(){
        System.out.println("hi i am B");
    }
}

class c implements a,b{

    @Override
    public void display(){
        a.super.dispaly();
        b.super.display();

    }
    public static void main(String[] args) {

       c c2=new c();
       c2.display();

    }

}


