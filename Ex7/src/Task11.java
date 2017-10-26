import java.lang.Math;
public class Task11 {
    public void Run(int n)
    {
        int[] array = generateRandomArray(n);
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i]+" ");
        }

    }

    private int[] generateRandomArray(int n)
    {
        int[] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = (int)( Math.random() * (200+1)-100 );
        }
        return array;
    }
}
