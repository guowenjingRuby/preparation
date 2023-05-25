package fifteen.practice;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtil {
    //字段分隔符
    public static final String SEPARATE_FIELD = ",";
    public static final String SEPARATE_LINE = "\r\n";

    /*
     * 保存商品信息
     * */

    public static void saveBooks(Good good) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        //拼接文件名
        String name = "D:\\进货记录" + format.format(date) + ".csv";

        //可获取输入流，则存在文件，采取修改文件方式
        createFile(name, true, good);

    }

    private static void createFile(String name, boolean b, Good good) {
        BufferedOutputStream out = null;
        StringBuffer stringBuffer = new StringBuffer();
        if (b) {
            try {
                out = new BufferedOutputStream(new FileOutputStream(name, true));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                out = new BufferedOutputStream(new FileOutputStream(name));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        String[] fieldSort = new String[]{"商品编号", "商品名称", "购买数量", "单价", "总价", "联系人" };

        for (String field : fieldSort) {
            stringBuffer.append(field).append(SEPARATE_FIELD);
        }
        stringBuffer.append(SEPARATE_LINE);
        stringBuffer.append(good.getId()).append(SEPARATE_FIELD);
        stringBuffer.append(good.getName()).append(SEPARATE_FIELD);
        stringBuffer.append(good.getNumber()).append(SEPARATE_FIELD);
        stringBuffer.append((double) good.getPrice()).append(SEPARATE_FIELD);
        stringBuffer.append((double) good.getTotalmoney()).append(SEPARATE_FIELD);
        stringBuffer.append(good.getPeople()).append(SEPARATE_FIELD);
        stringBuffer.append(SEPARATE_LINE);
        String str = stringBuffer.toString();
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            try {
                out.write(bytes[i]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
