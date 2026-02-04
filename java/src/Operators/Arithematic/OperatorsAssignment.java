package Operators.Arithematic;

public class OperatorsAssignment {

    public static void emma(){
        double price = 45.0;
        int numBooks=3;
        System.out.println("the total price : "+ (price*numBooks)+ "rs");
    }

    public static void attendance(){
        int strength=60;
        int absent=18;
        System.out.println("the number of students present : "+ (strength-absent));
    }

    public static void salary(){
        double perdaysal=1200.0;
        int days=26;
        System.out.println("the salary for 26 days is : "+(perdaysal*days)+ "rs");
    }

    public static void waterBottels(){
        int totalBottels=145;
        int cap=12;
        System.out.println("the total number of full boxes : "+(totalBottels/cap));
        System.out.println("the total num of bottel left :"+(totalBottels%cap));

    }

    public static void examMarks(){
        int[] a =new int[4];
        a= new int[]{78, 85, 69, 88};
        int total=0;
        for(int i=0;i<4;i++){
            total+=a[i];
        }
        double average=total/4;
        System.out.println("the total marks scored : "+ total);
        System.out.println("the Average score :"+ average);
    }

    public static void main(String[] args) {
        emma();
        attendence();
        salary();
        waterBottels();
        examMarks();


    }

}
