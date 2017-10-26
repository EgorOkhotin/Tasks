public class Task6 {
    public void Run(int[] arr, int n, int val)
    {
        change(arr,n,val);
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

    private void change(int[] arr, int n, int val)
    {
        arr[n-1] = val;
    }
}
