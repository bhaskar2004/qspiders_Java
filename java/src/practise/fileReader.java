package practise;


import java.io.BufferedReader;
import java.io.FileReader;

public class fileReader {
    public static void main(String[] args)throws Exception {
        FileReader f= new FileReader("/home/bhaskar2004/Documents/qspiders/java/src/practise/sample.java");
        BufferedReader b=new BufferedReader(f);
        String line =b.readLine();
        while (line!=null){
            line = line.trim();
            if(line.contains(";") && !(line.contains("package"))){

                String [] words=line.split(" ");
                if(words.length>2) {
                    String dataTypes = words[0];
                    String variables = words[1];
                    System.out.println(dataTypes);
                    System.out.println(variables);
                }


//                for (int i = 0; i < words.length; i++) {
//                    System.out.print(words[i]+" ");
//                }



            }
            line = b.readLine();
        }

    }
}

