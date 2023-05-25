package fifteen.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\test.txt");
        int b;
        while((b=fileReader.read())!=-1){
//            System.out.println(b);
            System.out.println((char)b);
        }
        fileReader.close();
    }
}
