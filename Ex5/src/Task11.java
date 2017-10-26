import java.util.Scanner;

public class Task11 {
    public int Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }

        int k=0;
        for(int i=1;i<array.length-1;i++)
        {
            if((array[i]>array[i-1]) & (array[i]>array[i+1]))
            {
                k++;
                i++;
            }
        }
        return k;
    }
}
