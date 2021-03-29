package filetest;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yijun.dyj
 * @Date 2020/8/31 3:28 PM
 **/
public class FileTestWrite {
    static ExecutorService executors = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {

        File file = new File("/Users/duanyijun/Documents/fileone/test.txt");

        if (file.exists()) {
            file.delete();
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {
            int finalI = i;
            BufferedWriter finalBw = bw;
            int finalI1 = i;
            executors.submit(() -> {
                wirteFile(finalBw, String.valueOf(finalI1));
            });
        }

        executors.shutdown();
        while (!executors.isTerminated()){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Jieshu");
    }

    public static void wirteFile(BufferedWriter bw, String content) {
        synchronized (bw) {
            try {
                System.out.println(content + Thread.currentThread().getName());
                bw.write(content);
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
