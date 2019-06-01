// 3. 字符-字节

import java.io.*;

public class file3 {
    public static void main(String args[]) {

        try {
            File readF = new File("/Users/qianqian/Desktop/javaqwq/src/", "3-read.txt");
            FileReader in = new FileReader(readF);

            int n = 0;
            char tom[] = new char[256];
            while ((n = in.read(tom, 0, 256)) != -1) {
                String s = new String(tom, 0, n);
                System.out.println(s);

                try {
                    FileOutputStream out = new FileOutputStream("/Users/qianqian/Desktop/javaqwq/src/3-write.txt");
                    byte [] writeS = s.getBytes();
                    out.write(writeS);
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