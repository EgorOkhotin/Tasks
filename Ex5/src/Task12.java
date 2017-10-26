import java.util.Scanner;

public class Task12 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }
        int tmp;
        for(int i=0, j=length-1; i<=j; i++,j--)
        {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        for(int i=0;i<length; i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}
