package fourteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件复制：先读一个，然后在写。所以必须创建一个读对象，一个写对象
*
* */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("source//五环之歌.doc");
        FileOutputStream fileOutputStream = new FileOutputStream("target//五环之歌.doc");
        //定义一个缓存的数组，也就是例子中的卡车,你想让卡车一次拉多个个b走，长度就写多少
        byte[] carbuff=new byte[1024];
        //读之前记录当前的时间
        long startTime = System.currentTimeMillis();
        while(true){
            if((fileInputStream.read(carbuff))==-1){
                break;
            }
            //将b的内容写入target目录下五环之歌.doc
            fileOutputStream.write(carbuff);

        }
        //记录读写结束的时间
        long endTime=System.currentTimeMillis();
        System.out.println("复制用的时间是："+(endTime-startTime));
        fileInputStream.close();
        fileOutputStream.close();
    }
}
