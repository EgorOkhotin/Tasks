public class Task4 {
    public void Run(int a, int b)
    {
        while(a <= b)
        {
            if(((a<<31)>>31) == 0) System.out.print(a + " ");
            a++;
        }
    }
}
