//  阅读课本 P209 例 9.17 中的程序，做如下修改:
// • 将原始程序中的“输入年和月份”改为“输入年”，输出则 为一年12个月的所有日历页。12 个月的日历的排列方式可以自己设计，清晰即可。
// • 目前程序设定的每周第一天是“周日”，修改为“周一”。 
// • 将程序中所有的中文变量名改为英文变量名。


import java.util.*;

public class Exa {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("input year: ");
        int year = reader.nextInt();
//        System.out.println("input month: ");
        int month = 0;

        CalendarBean cb = new CalendarBean();
        cb.setYear(year);

        for (int theForMon = 1; theForMon <= 12; theForMon++) {
            cb.setMonth(theForMon);

            String[] a = cb.getCalendar();

            System.out.println("\t" + year + "年" + theForMon + "月的日历");


            char[] str = "一二三四五六日".toCharArray();

            for (char c : str) {
                System.out.printf("%3c", c);
            }
            for (int i = 0; i < a.length; i++) {
                if (i % 7 == 0) {
                    System.out.println("");
                }
                System.out.printf("%4s", a[i]);
            }
        }
    }
}