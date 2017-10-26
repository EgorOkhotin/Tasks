public class Task6 {
    public int Run(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if((a&1)==0)
        {
            if((b&1)==0)
            {
                return Run(a>>1,b>>1) << 1;
            }
            else
            {
                return Run(a>>1,b);
            }
        }
        else
        {
            if((b&1)==0)
            {
                return Run(a,b>>1);
            }
            else
            {
                if(a>b) return Run(a-b,b);
                return Run((b - a) >> 1, a);
            }
        }
    }
}
