package fifteen;

import java.io.*;
public class Demo {
    public static void main(String[] args) throws Exception {
        // 创建一个带缓冲区的输入流
        BufferedInputStream bis = new BufferedInputStream(new
                FileInputStream("source\\五环之歌.doc"));
        // 创建一个带缓冲区的输出流
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("target\\五环之歌.doc"));
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
