public class Task2 {
    public int Run(int n)
    {
        int s=1, k=1;
        while(k<=n)
        {
            s += (k-1)*k;
            k++;
        }
        return k;
    }
}
