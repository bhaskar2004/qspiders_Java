package mockPractise;
import java.util.Scanner;
public class areofCircle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius");
        double radius=s.nextDouble();
        double area=(3.14)*radius*radius;
        System.out.println("the area is :"+area);

    }
}
