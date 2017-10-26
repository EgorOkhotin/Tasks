public class Task2 {
    public void Run(double a, int n)
    {
        double b = a;
        if((n&1)==0)
        {
            while(n != 1)
            {
                a *= a;
                n = n/2;
            }
        }
        else
        {
            n--;
            while(n != 1)
            {
                a *= a;
                n = n/2;
            }
            a*=b;
        }
        System.out.print(a);
    }
}
