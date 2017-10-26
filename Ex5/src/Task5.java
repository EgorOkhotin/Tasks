public class Task5 {
    public void Run(int n)
    {
        if((n&1)==0)
        {
            int x1 = 1, x2 = n - 1;
            while (x1 != x2)
            {
                if(IsSimple(x1) & IsSimple(x2))
                {
                    System.out.print(x1+" "+x2);
                    return;
                }
                x1++;
                x2--;
            }
        }
    }

    private boolean IsSimple(int x)
    {
        for(int i=x-1; i>1; i--)
        {
            if(x%i==0) return false;
        }
        return true;
    }
}
