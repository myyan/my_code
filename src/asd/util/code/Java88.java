package asd.util.code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chenhao on 2016/10/12.
 */
public class Java88 {
    public static void main(String[] args) throws IOException {
        //test optinal
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);
        Integer s = list.stream().findFirst().orElse(10);
        System.out.println(s);
        //
        Path path = Paths.get("F:/code/test_java/src/asd/util/performance/a.txt");


    }
}
