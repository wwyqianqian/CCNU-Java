import java.util.Calendar;
public class CalendarBean {
    String []day;
    int year = 2008, month = 0;
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public String []getCalendar() {
        String []a = new String[64];
        Calendar ca = Calendar.getInstance(); // 日期类的创建
        ca.set(year, month-1, 1);

        int dayOfWeek = (ca.get(Calendar.DAY_OF_WEEK) + 5) % 7; // day of week，周一为第一天。

        int day = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = 30;
        }
        if (month == 2) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                day = 29;
            } else {
                day = 28;
            }
        }

        for (int i = 0; i < dayOfWeek; i++) {
            a[i] = " ";
        }
        for (int i = dayOfWeek, n = 1; i < dayOfWeek + day; i++) {
            a[i] = String.valueOf(n);
            n++;
        }
        for (int i = dayOfWeek + day; i < a.length; i++) {
            a[i] = " ";
        }
        System.out.println("");

        return a;
    }
}