public class Task5 {
    public int Run(int a, int n)
    {
        if((n&1) == 0)
        {
            while(n!=1)
            {
                a *= a;
                n = n/2;
            }
        }
        else
        {
            a *=a;
            n--;
            while(n!=1)
            {
                a *= a;
                n = n/2;
            }
        }
        return a;
    }
}
