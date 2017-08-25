import java.util.Scanner;

/**
 * Created by BaIcy on 2016/12/2.
 */
public class ReverseString {


    public static void main(String[] args){
        while (true){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            if (str.equals("end")){
                return;
            }
            boolean flag = true;
            for (int i = 0 ;i <= str.length()/2; ++i){
                char head = str.charAt(i);
                char tail = str.charAt(str.length()-i-1);
                if (head != tail){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println("该字符串是回文串.");
            }else{
                System.out.println("该字符串不是回文串.");
            }

        }
    }


}
