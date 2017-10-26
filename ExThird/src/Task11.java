import java.util.Scanner;

public class Task11 {
    public void Run()
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            int sum=0;
            for(int i=0; i< k; i++) sum += scanner.nextInt();
            System.out.print(sum);
        }
        catch(Exception ex)
        {

        }
    }
}
