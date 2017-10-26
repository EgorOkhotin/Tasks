import java.util.Scanner;

public class Task8 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = scan.nextInt();
        }
        array = BubbleSort(array);
        for(int i=0; i<n; i++)
            System.out.print(array[i] + " ");

    }

    private int[] BubbleSort(int[] array)
    {
        int tmp;
        for(int i=0; i<array.length-1; i++)
        {
            for(int j=i; j<array.length-i;i++)
            {
                if(array[j]>array[j+1])
                {
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
