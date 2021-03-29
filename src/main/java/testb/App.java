package testb;

import java.io.*;

/**
 * @Author yijun.dyj
 * @Date 2020/8/27 3:24 PM
 **/
public class App {

    public static void main(String[] args) {

        File file = new File("/Users/duanyijun/Documents/test.txt");
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.readLine() != null) {
                String s = br.readLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
