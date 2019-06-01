// 2. 字节-字符

import java.io.*;

public class file2 {
    public static void main(String args[]) {
        int b;
        byte tom[] = new byte[256];
        try {
            File f = new File("/Users/qianqian/Desktop/javaqwq/src",
                    "2-read.txt");
            FileInputStream in = new FileInputStream(f);
            while ((b = in.read(tom, 0, 256)) != -1) {
                String s = new String(tom, 0, b);
                System.out.print(s);

                try {
                    File writeF = new File("/Users/qianqian/Desktop/javaqwq/src/2-write.txt");

                    FileWriter out = new FileWriter(writeF);
                    out.write(s, 0, s.length());
                    out.close();

                } catch (IOException e) {
                    System.out.println("File write error: " + e);
                }

            }
            in.close();

        } catch (IOException e) {
            System.out.println("File read error: " + e);
        }

    }
}