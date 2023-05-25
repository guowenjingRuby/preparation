package fourteen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        OutputStream out =new FileOutputStream("example.txt",true);
        String str="宁波欢迎你";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            out.write(bytes[i]);
        }
        out.close();
    }
}
