import java.util.Scanner;

public class Task16 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }

        int k =0;
        for(int i=1;i<length; i++)
        {
            if(array[i] != array[i-1]) k++;
        }

        System.out.print(k);
    }
}
