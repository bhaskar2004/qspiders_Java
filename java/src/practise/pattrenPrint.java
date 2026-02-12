package practise;

public class pattrenPrint {

    public void square(){
        for(int i=0;i<=4;i++) {
            for (int j = 0; j <=4; j++) {
                if(i==0|| j==0 || i==4 || j==4 ){
                    System.out.print(" * ");
                }else {
                    System.out.print(" " + " " + " ");
                }

            }
            System.out.println();
        }
    }

    public void number(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println( );
        }
        System.out.println(" ");

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" "+i+" ");
            }
            System.out.println( );
        }

        System.out.println(" ");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                System.out.print(" "+i+" ");
            }
            System.out.println( );
        }
    }

    public void Charaters(){
        for(char i='A';i<='E';i++){
            for(char j='A';j<='E';j++){
                System.out.print(" "+i+ " ");
            }
            System.out.println( );
        }
    }

    public void triangle(){
        for(int i=1 ;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("-");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*"+"-");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattrenPrint p=new pattrenPrint();
//        p.square();
//        p.number();
//        p.Charaters();
        p.triangle();


    }
}
