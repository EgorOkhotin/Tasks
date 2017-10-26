public class Task6 {
    public int Run(int n, int k)
    {
        Task5 obj = new Task5();
        int nFact=obj.Run(n),
                kFact = obj.Run(k),
                knSubFact = obj.Run(n-k);
        return nFact/(kFact*knSubFact);

    }
}
