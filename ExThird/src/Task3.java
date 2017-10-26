public class Task3 {
    public int Run(int n)
    {
        int k =1;
        int s =0;
        while(k<=n)
        {
            for(int i=1; i<=k; i++) s += i;
            k++;
        }
        return s;
    }
}
