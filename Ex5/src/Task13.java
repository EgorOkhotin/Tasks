import java.util.Scanner;

public class Task13 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }

        int k = 1;
        int tmp = 0;
        while(k < array.length)
        {
            tmp = array[k-1];
            array[k-1] = array[k];
            array[k] = tmp;
            k+=2;
        }
    }
}
