import java.util.Scanner;

public class Task7 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }

        for(int i=0; i<length; i++)
        {
            if((array[i]&1)==0) System.out.println(array[i]);
        }
    }
}
