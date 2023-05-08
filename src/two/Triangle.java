package two;

import static java.lang.Math.sqrt;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/17 18:24
 */
public class Triangle {
    int amargin;
    int bmargin;
    int cmargin;
    public int girth(){
        return amargin+bmargin+cmargin;
    }
    public int area(){
        int p=girth();
        return (int) Math.sqrt(p*(p-amargin)*(p-bmargin)*(p-cmargin));
    }

}
