public class Task12 {
    public static int Run(int h,int m, int s)
    {
        double gradusPerSecond = 0.000277778;
        double gradusPerMinute = 0.25;
        double gradusPerHour = 15.0;
        double result = gradusPerHour*(double)h + gradusPerMinute*(double)m + gradusPerSecond*(double)s;
        if(result>180) return 360-(int)result;
        else return (int)result;
    }
}
