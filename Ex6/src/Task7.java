import java.util.Scanner;

public class Task7 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = scan.nextInt();
        }
        array = SelectionSort(array);
        for(int i=0; i<n; i++)
            System.out.print(array[i] + " ");

    }

    private int[] SelectionSort(int[] array)
    {
        int maxEl = Integer.MIN_VALUE, indx = 0, tmp, indxInj = array.length-1;
        while(indxInj >= 0)
        {
            for (int i = 0; i < indxInj+1; i++)
            {
                if (maxEl < array[i])
                {
                    indx = i;
                    maxEl = array[i];
                }
            }

            tmp = array[indxInj];
            array[indxInj] = array[indx];
            array[indx] = tmp;
            indxInj--;
            maxEl = Integer.MIN_VALUE;
        }
        return array;
    }
}
