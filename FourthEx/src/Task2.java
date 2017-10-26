public class Task2{
    public int Run()
    {
        int a;
        for(int i=100; i<1000; i++)
        {
            a = i%100;
            if(a*7 == i) return i;
        }
        return 0;
    }
}
