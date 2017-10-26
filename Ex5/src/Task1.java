public class Task1 {
    public void Run(int a, int b, int c, int d)
    {
        //(a/b)+(c/d) = ac/bd = m/n
        int n = b*d;
        int m = a*c;
        if(m%n==0) System.out.print(m/n);
        else
        {
            int k = 2;
            while((k<m) | (k<n))
            {
                if((m%k==0) & (n%k==0))
                {
                    m = m/k;
                    n = n/k;
                }
                k++;
            }
        }
        System.out.print(m + "/" + n);

    }
}
