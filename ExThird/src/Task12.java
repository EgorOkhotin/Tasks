public class Task12 {
    public void Run(int a, int x)
    {
        int doubleSum = 2*a*x, result = 0;
        boolean b = false;
        for(int i=10; i<=99; i++)
            if (i == doubleSum)
            {
                b = true;
                result = i;
                break;
            }

        if(b == true)
        {
            System.out.print(result);
        }
        else System.out.print("Nof find");
    }
}
