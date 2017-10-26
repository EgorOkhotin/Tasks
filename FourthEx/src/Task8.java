public class Task8 {
    public int Run(int n)
    {
        int x = 10, a =0;

        while(n != 0)
        {
            a = n%10;
            if(a<x) x = a;
            n = n%10;
        }
        return x;
    }
}
