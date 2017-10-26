public class Task1 {
    public void Run(int a,int b, int c, int d)
    {
        if(a>b)
        {
            if(c>d)
            {
                if(d>b) System.out.print(b);
                else System.out.print(d);
            }
            else
            {
                if(c>b) System.out.print(b);
                else System.out.print(c);
            }
        }
        else
        {
            if(c>d)
            {
                if(d>a) System.out.print(a);
                else System.out.print(d);
            }
            else
            {
                if(c>a) System.out.print(a);
                else System.out.print(c);
            }
        }
    }
}
