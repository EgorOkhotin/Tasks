public class Task2 {
    public int Run(int n, int m)
    {
        if(n%m == 0) return m;
        else
        {
            return Run(n%m, m);
        }
    }
}
