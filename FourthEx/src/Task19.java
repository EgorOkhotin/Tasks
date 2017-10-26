public class Task19 {
    public void Run(int x, int y)
    {
        int k =0;
        while(x<y)
        {
            x += (x/10);
            k++;
        }
        System.out.print(k);
    }
}
