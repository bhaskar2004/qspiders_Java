package mockPractise;

public class student {

    private String action;

    public void setAction(String x){
        action=x;
    }

    public String getAction(){
        return action;
    }

    public static void main(String[] args) {
        student s = new student();
        s.setAction("eatinhg");
        System.out.println(s.getAction());
    }

}
