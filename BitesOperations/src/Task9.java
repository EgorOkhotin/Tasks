public class Task9 {
    public static String Run(int a)
    {
        StringBuilder builder = new StringBuilder();
        for(int i=1;i<9;i++) builder.append(Shift(a,i));
        return builder.toString();
    }

    private static int Shift(int a, int i)
    {
        return (a<<(32-i)>>>(32-i));
    }
}
