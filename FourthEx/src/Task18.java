public class Task18 {
    public void Run(int n)
    {
        int a =1, k=0;
        while(a<n)
        {
            a = a<<1;
            k++;
        }
        System.out.print(k);
    }
}
