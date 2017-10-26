import java.lang.Math;
public class Task9 {
    public void Run()
    {
        int[] array = new int[15];
        for(int i=0; i<15; i++)
        {
            array[i] = i+1;
        }
        shuffleArr(array);
        for(int i=0; i<15; i++)
        {
            System.out.print(array[i]+" ");
        }


    }

    private void shuffleArr(int[] arr)
    {
        int tmp,indx1, indx2;

        for(int i=0; i<arr.length; i++)
        {
            indx1 = (int)( Math.random() * (14-0) );
            indx2 = (int)( Math.random() * (14-0) );
            tmp = arr[indx1];
            arr[indx1] = arr[indx2];
            arr[indx2] = tmp;
        }
    }
}
