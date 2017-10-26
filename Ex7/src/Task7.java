public class Task7 {
    public void Run(int[] arr, int size)
    {

    }

    private int findMax(int[] arr, int size)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}
