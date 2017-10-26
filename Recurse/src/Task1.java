public class Task1 {
    public int Run(int a, int n)
    {
        return a*Run(a,n-1);
    }

}
