import java.util.Scanner;

public class Task6 {
    public void Run()
    {
        int[] controlArray = new int[9];
        Scanner scan = new Scanner(System.in);
        int tmp;
        while(true)
        {
            tmp = scan.nextInt();
            if(tmp==0)
            {
                break;
            }
            else
            {
                controlArray[tmp - 1]++;
            }
        }

        for(int i=0; i<controlArray.length; i++)
        {
            System.out.print(controlArray[i]+ " ");
        }
    }
}
