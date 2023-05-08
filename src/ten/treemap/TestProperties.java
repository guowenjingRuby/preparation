package ten.treemap;

import java.util.Enumeration;
import java.util.Properties;

public class TestProperties
{
    public static void main(String[] args) {
        Properties p=new Properties();
        p.setProperty("Backgroup-color","red");
        p.setProperty("Font-size","14px");
        p.setProperty("Language","chinese");

        Enumeration names=p.propertyNames();
        while(names.hasMoreElements()){
            String key=(String)names.nextElement();
            System.out.println(key+":"+p.getProperty(key));
        }
    }


}
