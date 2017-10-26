public class Task5 {
    public static void Run(int a, int b, int c)
    {
        if(a==b)
        {
            if(a==c) System.out.print(3);
            else System.out.print(2);
        }
        else
        {
            if(b==c) System.out.print(2);
            else System.out.print(0);
        }
    }
}
