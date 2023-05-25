package fifteen.practice1;

import java.io.*;

/*测试不同方法的读写速度*/
public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream("D:\\文档\\蓝桥杯省赛\\算法视频\\问题.mp4");
        FileOutputStream outputStream=new FileOutputStream("D:\\文档\\问题.mp4");
        byte[] bytes=new byte[1024];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        long startTime=System.currentTimeMillis();
//        while((inputStream.read(bytes))!=-1){
//            outputStream.write(bytes);
//        }
//        int len;
        while((bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes);
        }

//        inputStream.close();
//        outputStream.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        long endTime=System.currentTimeMillis();
        System.out.println("用时："+(endTime-startTime));
    }
}
