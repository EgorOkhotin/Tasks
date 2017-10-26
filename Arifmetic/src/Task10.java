public class Task10 {
    public static int Run(int v, int t)
    {
        int length = 109;
        int result = v*t;
        while(result>length) result -=length;
        return result;
    }
}
