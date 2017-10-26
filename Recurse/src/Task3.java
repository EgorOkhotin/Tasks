public class Task3 {
    public int Run(int a, int n)
    {
        if(n==1) return a;
        if((n&1)==0)
        {
            return Run(a,n/2)* Run(a,n/2);
        }
        else
        {
            return a* Run(a,n/2);
        }
    }
}
