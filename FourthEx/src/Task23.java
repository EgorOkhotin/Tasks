public class Task23 {
    public int Run(int n)
    {
        int a=1,b=1,tmpA=0,k=3;
        while(k < n)
        {
            tmpA = b;
            b += a;
            a = tmpA;
            k++;
        }
        return b;
    }
}
