public class Task9 {
    public int Run(int n)
    {
        int k=0;
        while(n != 0)
        {
            k++;
            n = n%10;
        }
        return k;
    }
}
