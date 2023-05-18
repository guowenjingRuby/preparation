package fourteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* InputStream:读的字节抽象类（read()/read(byte[] b)/read(byte[] b,int off,int len)）
*   FileInputStream实现类
*
* */
public class Demo {
    public static void main(String[] args) throws IOException {
        //创建一个字节输入流的对象
//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\preparation\\src\\fourteen\\test.txt");
        FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\preparation\\src\\fourteen\\test1.txt");
        //用字符流来对文件
        FileReader fileReader = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\preparation\\src\\fourteen\\test1.txt");
        int d=0;
        while(true){
            d=fileReader.read();
            if(d==-1){
                break;
            }
            System.out.println((char)d);
        }
        fileReader.close();
/*        //定义一个变量记录读到的内容，初始值设为0
        int b=0;
        while(true){
            //先写退出循环的条件，文件读完了就退出循环，读的数不在0-255之间就退出循环，实际上读结束了会返回-1.
            b=fileInputStream.read();
            if(b==-1){
                break;
            }
            System.out.println(b);
        }*/
        //定义一个变量记录读到的内容，初始值设为0
        int c=0;

        while(true){
            //先写退出循环的条件，文件读完了就退出循环，读的数不在0-255之间就退出循环，实际上读结束了会返回-1.
            c=fileInputStream1.read();
            if(c==-1){
                break;
            }
            System.out.println(c);
        }
/*
* test1.txt文件的码表用utf-8.从我们实践结果来看一个汉字对应3个字节
* */

        /*
        * 新的练习：新建一个test1.txt。里面录入汉字内容。然后去这个文件。并有断点Debug模式查看读取的过程
        *
        * */
//        //读一个试试
//        int first = fileInputStream.read();
//        System.out.println(first);
//        /*a---97  A---65
//            b---98
//            c---99
//            d---100
//            e---101
//            f---102
//            g---103
//            h---104
//            i---105*/
//        //读第二个试试
//        int Second=fileInputStream.read();
//        System.out.println(Second);
//        //读第三个试试
//        int third=fileInputStream.read();
//        System.out.println(third);
//        //读第四个试试
//        int fourth=fileInputStream.read();
//        System.out.println(fourth);
        fileInputStream1.close();

    }
}
