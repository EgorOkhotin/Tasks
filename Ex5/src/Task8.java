import java.util.Scanner;

public class Task8 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }
        int k=0;
        for(int i=0; i<length; i++)
        {
            if(array[i]>0) k++;
        }
        System.out.print(k);
    }
}
