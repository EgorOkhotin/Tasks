public class Task3 {
    public static void Run(int a, int b, int c)
    {
        if(a>=b)
        {
            if(a<=c) System.out.print(c);
            else System.out.print(a);
        }
        else
        {
            if(b<=c) System.out.print(c);
            else System.out.print(b);
        }
    }
}
