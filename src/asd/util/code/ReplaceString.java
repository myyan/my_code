package asd.util.code;

import java.util.Scanner;

/**
 * Created by chenhao on 2016/10/11.
 */
public class ReplaceString {
    private static final String str = "%20";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(replaceString(sc.nextLine()));;
        }

    }
    public static String replaceString(String s){
        StringBuffer sb = new StringBuffer();
        char [] chars = s.toCharArray();
        for (int i = 0;i<chars.length;i++){
            if (chars[i]==' '){
                sb.append(str);
            }else{
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
