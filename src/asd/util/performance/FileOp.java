package asd.util.performance;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by chenhao on 2016/10/9.
 */
public class FileOp {
    public static void main(String[] args) throws IOException {
        String fileName = "F:/code/test_java/src/asd/util/performance/a.txt";
        try {

            FileReader in = new FileReader("F:/code/test_java/src/asd/util/performance/a.txt");
            FileWriter out = new FileWriter("F:/code/test_java/src/asd/util/performance/a1.txt");
            int c ;
            while ((c=in.read())!=-1){
                out.write(c);
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> list;

        Stream<String> stream = Files.lines(Paths.get("F:/code/test_java/src/asd/util/performance/a.txt"));
//        stream.forEach(System.out::println);
        System.out.println(File.separator);
        list = stream.filter(line->line.startsWith("chen")).collect(Collectors.toList());
        list.stream().forEach(System.out::println);

        BufferedReader br  = Files.newBufferedReader(Paths.get(fileName));
        System.out.println("InputStream--------------------------");
        InputStream is = Files.newInputStream(Paths.get(fileName));
        int c;
        while ((c=is.read())!=-1){
            System.out.println(c);
        }
        System.out.println("bufferedReader-------------------");
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
        BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));
        System.out.println("---three----------------");
        while ((s=reader.readLine())!=null){
            System.out.println(s);
        }

//        list = br.lines().collect(Collectors.toList());
//        list.forEach(System.out::println);
//        String tem = Paths.get("1","2","3").toString();
//        System.out.println(tem);
//        Files.lines(Paths.get(fileName)).toString();
//        FileWriter w = new FileWriter("F:/code/test_java/src/asd/util/performance/11.txt");
//        w.write(Files.lines(Paths.get(fileName)).toString());
//        System.out.println(Files.lines(Paths.get(fileName)).toString());
//        String name = "F:/code/test_java/src/asd/util/performance/11.txt";
//        BufferedWriter bw = Files.newBufferedWriter(Paths.get(name));
//        bw.write("chenhao");
//        BufferedWriter bw1 = Files.newBufferedWriter(Paths.get("a.txt"));
//        bw1.write("123");


    }
}
