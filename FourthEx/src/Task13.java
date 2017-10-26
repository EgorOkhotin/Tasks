import java.util.Scanner;

public class Task13 {
    public int Run()
    {
        Scanner scan = new Scanner(System.in);
        int a = 0, b;
        while (true)
        {
            b = scan.nextInt();
            if (b == 0) break;
            a++;
        }
        return a;
    }
}
