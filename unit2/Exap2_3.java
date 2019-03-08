import java.util.Scanner;

public class Exap2_3 {
    public static void main(String args[]) {
        System.out.println("输入若干数字，每一个数字回车确认");
        System.out.println("输入任何非数字结束。");

        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;

        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            m = m + 1;
            sum = sum + x;
        }

        System.out.println(m + "个数字的总和是" + sum);
        System.out.println("平均值是" + sum / m);
    }

}