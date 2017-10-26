public class Task17 {
    public void Run(int n)
    {
        int a =1, k=0;
        while(a<n)
        {
            System.out.print(k+ " ");
            a = a<<1;
            k++;
        }
    }
}
