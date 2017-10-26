import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array1 = new int[n];
        for(int i=0; i<n; i++)
        {
            array1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] array2 = new int[m];
        for(int i=0; i<m; i++)
        {
            array2[i] = scan.nextInt();
        }

        int[] array = Insertion(array1,array2);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
    }

    private int[] Insertion(int[] array1, int[] array2)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<array1.length; i++)
        {
            for(int j=0; j<array2.length; j++)
                if(array1[i] == array2[j])
                    list.add(array1[i]);
        }
        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++)
            result[i] = list.get(i);
        return result;
    }
}
