public class Task9 {
    public double Run (int n)
    {
        double res = 1;
        int k= 3,
                i=-1;
        while(k !=(2*n-1))
        {
            res += 1.0/(i*k);
            k += 2;
            i *= (-1);
        }

        return res;
    }
}
