import java.util.Scanner;

public class Task15 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }
        int a = Integer.MIN_VALUE;
        for(int i=0;i<length; i++)
        {
            if(a<array[i]) a= array[i];
        }

        System.out.print(a);
    }
}
