import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenhao on 2016/9/22.
 */
public class TestDate {

    public static void main(String []args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long start = sdf.parse("2016-09-22").getTime();
        long end = sdf.parse("2016-9-25").getTime();
        System.out.println((end-start)/1000/60/60);
        TestDate t = new TestDate();
        Class c = t.getClass();
    }
}
