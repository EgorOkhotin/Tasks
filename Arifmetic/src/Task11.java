public class Task11 {
    public static void Run(int n)
    {
        int minutesInDay = 60*24;
        while(n>minutesInDay) n -= minutesInDay;
        System.out.print(n/60 + " : " + n%60);
    }
}
