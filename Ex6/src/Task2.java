import java.util.Scanner;

public class Task2 {
    public int Run()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int m = Integer.MIN_VALUE, k = 0;
        for(int i=0; i<n; i++)
        {
            a[i] = scan.nextInt();
            if(a[i] > m)
            {
                k=1;
                m = a[i];
            }
            else if(a[i] == m)
            {
                k++;
            }
        }
        return k;
    }
}
