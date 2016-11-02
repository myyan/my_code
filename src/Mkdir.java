import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * Created by chenhao on 2016/10/13.
 */
public class Mkdir {
    public static void main(String[] args) {
        File file = new File("./haoiz/222");
        file.mkdir();
        boolean a = Objects.equals("123","123");
        System.out.println(a);
    }
}
