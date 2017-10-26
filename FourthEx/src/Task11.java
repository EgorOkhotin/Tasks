import java.util.Scanner;

public class Task11
{
    public int Run()
    {
        Scanner scan = new Scanner(System.in);
        int a = Integer.MIN_VALUE, b;
        while (true)
        {
            b = scan.nextInt();
            if (b == 0) break;
            else
            {
                if (a >= b) continue;
                else a = b;
            }
        }
        return a;
    }
}
