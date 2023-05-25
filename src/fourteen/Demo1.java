package fourteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        InputStream input=null;
        try{
        FileInputStream in=new FileInputStream("D:\\code\\java\\preparation\\src\\fourteen\\test1.txt");
        int b=0;
        while(true){
            b=in.read();
            if(b==-1){
                break;
            }
            System.out.println(b);
        }}finally {
            if(input!=null){
                input.close();
            }
        }
    }
}
