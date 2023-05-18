package fourteen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* OutputStream:抽象的字节流写的方法
*   write(int b):向输出流写入一个字节
*   write(byte[] b):把参数b指定的字节数组中所有的字节都写入输出流中
*   write(byte[] b,int off,int len):指定从字节数组b的某个位置开始固定长度的写入输出流中。
*   flush():强制性的将写的内容存储到磁盘空间
*   close():
*
* */
/*往test.txt中写入内容*/
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\preparation\\src\\fourteen\\test.txt",true);
        String str="\n春眠不觉晓，处处闻啼鸟";
        /*往test.txt中写入str的内容*/
        //获取字符串所对应的字节码
        byte[] bytes = str.getBytes();
//        for (int i = 0; i < bytes.length; i++) {
//            fileOutputStream.write(bytes[i]);
//        }
        fileOutputStream.write(bytes);

        /*
        * 本身test.txt文件中的   好好学习  字符串去哪里了？当前的写的方法，每次都会先清除文件里的内容，再写入。
        * 不想让它清除之前的内容，直接在之前的内容后面写？
        * */
        //关闭文件对象
        fileOutputStream.close();
    }
}
