public class Task4 {
    public void Run(int m, int n)
    {
        if(m>=1 & n<(1000*1000*1000) & (n-m)*Math.sqrt(n)<=(1000*1000*10))
        {
            for(int i=m; i<=n; i++)
            {
                if(i == dividersSum(i)) System.out.print(i + " ");
            }
        }
    }
    private int dividersSum(int x)
    {
        int k=1;
        int sum = 0;
        while(k!=x)
        {
            if(x%k==0) sum+=k;
            k++;
        }
        return sum;
    }
}
