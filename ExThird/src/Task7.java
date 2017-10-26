public class Task7 {
    public int Run(int a, int n)
    {
        if(((a<<31)>>31) == 0)
        {
            while(n !=1)
            {
                a *= a;
                n = n/2;
            }
            return a;
        }
        else
        {
            int k = a;
            n--;
            while(n !=1)
            {
                a *= a;
                n = n/2;
            }
            return a*k;
        }
    }
}
