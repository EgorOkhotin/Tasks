public class Task10 {
    public int Run(int a, int n)
    {
        Task7 obj = new Task7();
        int sum =1 + a;
        for(int i = 2; i<=n; i++) sum += obj.Run(i,i);
        return sum;
    }
}
