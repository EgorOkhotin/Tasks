public class Task1 {
    public int Run(int n)
    {
        int k=1;
        while(n>1)
        {
            k += n*n;
            n--;
        }
        return k;
    }
}
