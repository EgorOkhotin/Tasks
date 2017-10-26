public class Task8 {
    public static int Run(int a, int i)
    {
        return (a<<(32-i)>>>(32-i));
    }
}
