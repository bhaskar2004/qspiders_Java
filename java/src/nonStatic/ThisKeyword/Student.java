package nonStatic.ThisKeyword;

public class Student {
    int id;
    String name;
    String branch;

    Student(int id , String name ,String branch){
        this.id=id;
        this.name=name;
        this.branch=branch;
    }
    public void study(){
        System.out.println(name + " : is studying");
        System.out.println("--------------------------------------");

    }

}

class StudentTest{
    public static void display(Student s){
        System.out.println("ID : "+ s.id);
        System.out.println("Name : "+ s.name);
        System.out.println("branch : "+ s.branch);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"Bhaksar","CSE");
        display(s1);
        s1.study();

        Student s2 = new Student(2,"Dharshan","ISE");
        display(s2);
        s2.study();

    }

}
