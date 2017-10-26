import java.util.Scanner;

public class Task9 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = scan.nextInt();
        }
        array = InsertionSort(array);
        for(int i=0; i<n; i++)
            System.out.print(array[i] + " ");
    }

    private int[] InsertionSort(int[] array)
    {
        int tmp,j;
        for (int i = 1; i < array.length; i++)
        {
            tmp = array[i];
            j = i;
            while (j > 0 && tmp < array[j - 1])
            {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
        }
        return array;
    }
}
