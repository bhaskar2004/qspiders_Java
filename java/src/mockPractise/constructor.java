package mockPractise;
public class constructor {

    int num;
    String name;
    constructor(int num,String name){
        this.num=num;
        this.name=name;
    }
    public void display(){
        System.out.println("name : "+ name+ " number :"+ num);
    }
    public void sound(){
        System.out.println("meow");
    }

    public static void main(String[] args) {
        constructor c = new constructor(123,"dhanush");
        c.display();
        c.sound();
    }


}



