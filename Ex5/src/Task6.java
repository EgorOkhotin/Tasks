import java.util.Scanner;

public class Task6 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }

        for(int i=0; i<length; i+=2)
        {
            System.out.println(array[i]);
        }
    }
}
