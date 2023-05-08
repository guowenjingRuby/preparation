package third;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/2/28 16:15
 */
public class Competition {

    public float calAvg(float[] scores ){
        float sum=0;
        for(int i =0;i<scores.length;i++){
            sum+=scores[i];
        }
        return sum/scores.length;
    }

    public float calMax(float[] scores ){
        float max=scores[0];
        for(int i =1;i<scores.length;i++){
            if(max<scores[i]){
                max=scores[i];
            }
        }
        return max;
    }

}
