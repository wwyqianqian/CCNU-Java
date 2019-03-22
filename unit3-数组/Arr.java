public class Arr {
    public static void main (String args[]) {
        long myTwo[][];
        myTwo = new long[3][];
        myTwo[0] = new long[30]; // 素数
        myTwo[1] = new long[40]; // 奇数
        myTwo[2] = new long[50]; // 斐波那契数列

        for (int j = 2, count = 0; count < 30; j++) {
            int i;
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0)
                    break;
            }
            if (i > j / 2) {
               myTwo[0][count] = j;
                count++;
            }
        }

        for (int i = 1, count = 0; count < 40; i++) {
            if (i % 2 == 0)
                continue;
            myTwo[1][count] = i;
            count++;
        }

        myTwo[2][0] = 1;
        myTwo[2][1] = 1;
        for (int i = 2; i < 50; i++) {
            myTwo[2][i] = myTwo[2][i - 2] + myTwo[2][i - 1];
        }

        long sum = 0;
        for (long x[] : myTwo) {
            for (long e : x) {
                sum += e;
                System.out.println(e);
            }
        }

        System.out.println("------------------");
        System.out.println("平均值是" + sum/120);
    }
}