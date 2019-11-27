import java.util.GregorianCalendar;
public class Class {
    public static void main(String args[]) {
        GregorianCalendar gcalendar = new GregorianCalendar();
        int[] pas = new int[] {540,630,640,730,740,830,870,960,970,1060};
        int[] day_of_week = new int[] {540,730,540,830,740,830,740,1060,540,960,540,960};
        /*int day1_min = 540;
        int day1_max = 730;
        int day2_min = 540;
        int day2_max = 830;
        int day3_min = 740;
        int day3_max = 830;
        int day4_min = 740;
        int day4_max = 1060;
        int day5_min = 540;
        int day5_max = 960;
        int day6_min = 540;*/
        int day6_break_start = 730;
        int day6_break_end = 870;
        //int day6_max = 960;
        /*int par1_start = 540;
        int par1_ends = 630;
        int par2_start = 640;
        int par2_ends = 730;
        int par3_start = 740;
        int par3_ends = 830;
        int par4_start = 870;
        int par4_ends = 960;
        int par5_start = 970;
        int par5_ends = 1060;*/
        int current_time;
        int minute = gcalendar.get(gcalendar.MINUTE);
        int hour = gcalendar.get(gcalendar.HOUR_OF_DAY);
        int day = gcalendar.get(gcalendar.DAY_OF_WEEK);
        hour = hour * 60;
        current_time = hour + minute;
        day = day - 1;
        int time_left = 0;
        for (int i = 0; i < 9; i++)
        {
            if(current_time >= pas[i] && current_time < pas[i + 2])
            {
                time_left = pas[i + 1] - current_time;
                break;
            }
        }
        if (day_of_week[2 * day - 2] > current_time && day_of_week[2 * day - 1] < current_time)
        {
            time_left = 0;
        }
        if (day6_break_end > current_time && day == 6 && day6_break_start <= current_time)
        {
            time_left = 0;
        }
        if(time_left == 0)
        {
            System.out.println("В данный момент пара не идет");
        }
        else
        {
            System.out.println("Осталось " +time_left);
        }
        /*System.out.println(hour);
        System.out.println(minute);
        System.out.println(day);*/
    }
}
