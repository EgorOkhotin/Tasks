import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a1 = new int[n];
        for(int i=0; i<n; i++)
        {
            a1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] a2 = new int[m];
        for(int i=0; i<m; i++)
        {
            a2[i] = scan.nextInt();
        }
        int[] a3 = new int[n+m];
        int j=0, k=0;
        for(int i=0; i<a3.length; i++)
        {
            if((j<n) & (k<m))
            {
                if(a1[j]>a2[k])
                {
                    a3[i] = a2[k];
                    k++;
                }
                else
                {
                    a3[i] = a1[j];
                    j++;
                }
            }
            else
            {
                if(k<m)
                {
                    a3[i] = a2[k];
                    k++;
                }
                else
                {
                    a3[i] = a1[j];
                    j++;
                }
            }
            System.out.print(a3[i]+" ");
        }
    }
}
