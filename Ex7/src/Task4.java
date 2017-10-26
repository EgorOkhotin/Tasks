public class Task4 {
    public void Run(int[] array, int start,int end)
    {
        System.out.print(sumRange(start,end,array));
    }

    private int sumRange(int start, int end, int[] array)
    {
        int sum = 0;
        for(int i=start; i<end;i++)
            sum+=array[i];
        return sum;
    }
}
