public class Task5 {
    public void Run(int[] array)
    {
        System.out.print(getAverage(array));
    }

    private double getAverage(int[] array)
    {
        double sum = 0;
        for(int i=0; i<array.length; i++)
            sum+= array[i];
        return (sum/array.length);
    }
}
