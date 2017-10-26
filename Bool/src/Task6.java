public class Task6 {
    public void Run(int n)
    {
        System.out.print(DigitsSum(n));
    }

    private int DigitsSum(int n)
    {
        int sum = 0;
        while(n!=0)
        {
           sum+= n%10;
           n=n/10;
        }
        return sum;
    }
}
