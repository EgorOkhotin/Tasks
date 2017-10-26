public class Task20 {
    public void Run(int x,int y)
    {
        int k =0;
        while(k<y)
        {
            k +=x;
            x += (x/10);
        }
        System.out.print(k);
    }
}
