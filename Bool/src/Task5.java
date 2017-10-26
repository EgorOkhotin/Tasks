public class Task5 {
    public void Run(int n)
    {
        if(isSimple(n))
        {
            System.out.print("Prime");
        }
        else
        {
            System.out.print("Composite");
        }
    }

    private boolean isSimple(int n)
    {
        for(int i=n-1; i>1; i--)
        {
            if((n%i)==0) return false;
        }
        return true;
    }
}
