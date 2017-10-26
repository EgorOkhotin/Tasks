import java.util.Scanner;

public class Task12 {
    public int Run()
    {
        Scanner scan = new Scanner(System.in);
        int a = Integer.MAX_VALUE, b;
        while(true)
        {
            b=scan.nextInt();
            if(b ==0) break;
            else
            {
                if(a<=b) continue;
                else a = b;
            }
        }
        return a;
    }
}
