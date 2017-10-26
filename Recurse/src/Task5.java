public class Task5 {
    public int Run(int n, int k)
    {
        if((k==0) || (k==n)) return 1;
        else
        {
            return Run(n-1,k-1) + Run(n-1,k);
        }
    }
}
