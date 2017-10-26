import java.util.Scanner;

public class Task14 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length; i++)
        {
            array[i] = scan.nextInt();
        }

        int tmp = array[length-1], tmp0 = array[0], tmp1;
        for(int i=1; i<length-1;i++)
        {
            tmp1 =array[i];
            array[i] = tmp0;
            tmp0=tmp1;
        }
        array[0] = tmp;

        for(int i=0;i<length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
