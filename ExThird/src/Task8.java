public class Task8 {
    public double Run(int n)
    {
        double result=1;
        for(int i=2; i<=n; i++)
        {
            result += 1.0/i*i;
        }
        return result;
    }
}
