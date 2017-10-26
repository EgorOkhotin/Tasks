public class Task3 {
    public void Run(int n)
    {
        for(int i=2; i<n; i++)
        {
            if(n%i == 0)
            {
                if(IsSimple(i)) System.out.print(i + " ");
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
