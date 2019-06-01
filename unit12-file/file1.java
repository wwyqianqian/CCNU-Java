// 1. 字节-字节

import java.io.*;

public class file1 {
    public static void main(String args[]) {
        int b;
        byte tom[] = new byte[256];
        try {
            File f = new File("/Users/qianqian/Desktop/javaqwq/src",
            "1-read.txt");
            FileInputStream in = new FileInputStream(f);
            while ((b = in.read(tom, 0, 256)) != -1) {
                String s = new String(tom, 0, b);
                System.out.print(s);

                try {
                    FileOutputStream out = new FileOutputStream("/Users/qianqian/Desktop/javaqwq/src/1-write.txt");
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