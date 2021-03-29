package time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author yijun.dyj
 * @Date 2020/3/19 3:32 PM
 **/
public class Dt {

    public static void main(String[] args) {
        String strDateFormat = "HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

        Date now =new Date();
        String format = sdf.format(now);
        System.out.println(format);
    }

}
