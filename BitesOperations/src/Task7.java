public class Task7 {
    public static int Run(int a, int n)
    {
        return ((a<<32-n)>>>(32-n));
    }
}
