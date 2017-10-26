public class Task22 {
    public int Run(int n)
    {
        int k=1, sum =1, lastFact = 1;
        while(k<=n)
        {
            sum += 1 / lastFact;
            lastFact *= (lastFact + 1);
        }
        return sum;
    }
}
