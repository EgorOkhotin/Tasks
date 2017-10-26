public class Task12 {
    public void Run()
    {
        int[] array = {1,3,1,4,1,5};
        Integer size = 0;
        int[] res = localMax(array,size);
        for(int i=0; i<res.length; i++)
        {
            if(res[i] != Integer.MIN_VALUE)
                System.out.print(res[i]+" ");
        }
    }

    private int[] localMax(int[] array, Integer size)
    {
        int[] result = new int[array.length/2];
        int j=0;
        for(int i=1; i<array.length -1 ; i+=2)
        {
            if((array[i-1]<array[i])&(array[i]>array[i+1]))
            {
                result[j] = array[i];
                j++;
            }
        }
        if(array[array.length-1]> array[array.length-2])
        {
            result[j] = array[array.length-1];
            j++;
        }
        for(int i = j; i<result.length; i++)
        {
            result[j] = Integer.MIN_VALUE;
        }
        return result;
    }
}
