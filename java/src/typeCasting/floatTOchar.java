package typeCasting;

public class floatTOchar {

    public static void narrowing(float f , char c){

        c=(char) f;
        System.out.println("float to char "+ f + " "+c);

    }

    public static void widening(char c,float f){
        f=c;
        System.out.println("char to float "+ c+ " "+f);
    }

    public static void main(String[] args) {
        narrowing(65.34F,' ');
        widening('a',0.0F);

    }
}
