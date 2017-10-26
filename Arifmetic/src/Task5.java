public class Task5 {
    public static int Run(int x)
    {
        int x1 = x;
        x = x*x;
        x = x*x*x*x1;
        x = x*x*x;
        return x;
    }
}
