public class Task16 {
    public void Run(int n)
    {
        while(n != 1)
        {
            if((n&1)==0)
            {
                n = n>>1;
            }
            else
            {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
