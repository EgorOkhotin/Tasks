public class Task4 {
    public int Run(int n)
    {
        int x1=1,x2=1, tmp;
        for(int i=2; i<=n; i++)
        {
            tmp = x2;
            x2 += x1;
            x1 = tmp;
        }
        return x2;
    }
}
