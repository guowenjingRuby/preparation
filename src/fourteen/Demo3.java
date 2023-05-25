package fourteen;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        InputStream in=new FileInputStream("source/五环之歌.doc");
        OutputStream out = new FileOutputStream("target/五环之歌.doc");
        int len;
        long begintime = System.currentTimeMillis();
        while((len=in.read())!=-1){
            out.write(len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("复制文件所消耗的时间是："+(endtime-begintime)+"毫秒");
        in.close();
        out.close();
    }
}
