public class Task5 {
    public int Run(int n)
    {
        if(n>0)
        {
            int k = 1;
            for (int i = 1; i <= n; i++) k *= i;
            return k;
        }
        else return 0;
    }
}
