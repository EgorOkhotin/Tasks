import java.lang.Math;
public class Task10 {
    public void Run(int max, int min)
    {
        int[] array = new int[15];
        for(int i=0; i<15; i++)
        {
            array[i] =(int)( Math.random() * (14-0) );
        }
        clampArr(array,max,min);
        for(int i=0; i<15; i++)
        {
            System.out.print(array[i]+" ");
        }
    }

    private void clampArr(int[] arr, int max, int min)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max) arr[i] = max;
            if(arr[i]<min) arr[i] = min;
        }

    }
}
