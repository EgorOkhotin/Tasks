public class Task3 {
    public void Run(int n)
    {
        int k=1;
        while(k!=n)
        {
            if (n % k == 0) System.out.print(k);
            k++;
        }
    }
}
