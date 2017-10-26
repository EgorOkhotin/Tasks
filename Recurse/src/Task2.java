public class Task2 {
    public int Run(int a, int n)
    {
        if(n==1) return a;
        if(n>0)
        {
            return a*Run(a,n-1);
        }
        else
        {
            n = n*(-1);
            return 1/(a*Run(a,n-1));
        }
    }
}
