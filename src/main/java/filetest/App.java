package filetest;

import java.io.*;

/**
 * @Author yijun.dyj
 * @Date 2020/8/31 2:17 PM
 **/
public class App {

    public static void main(String[] args) throws IOException {

        String path = "/Users/duanyijun/Documents/fileone/test.txt";
        File file = new File(path);

        if (file.exists()) {
            file.delete();
        }

        BufferedWriter bw = null;
        bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

        bw.newLine();
        bw.write("123");
        bw.flush();
        // File file = new File(path);

        //if (file.exists()) {
        //    file.delete();
        //}

        //BufferedWriter bw = null;
        //try {
        //    bw = new BufferedWriter(new FileWriter(path));
        //    bw.write("123");
        //    bw.newLine();
        //    bw.write("321");
        //    bw.flush();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //} finally {
        //    bw.close();
        //}

    }
}
