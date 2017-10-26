import java.util.Scanner;

public class Task5 {
    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        String s = getLine(scan);
        System.out.print(getWordsCount(s));
    }

    private String getLine(Scanner scan)
    {
        return scan.nextLine();
    }

    private int getWordsCount(String s)
    {
        String[] array = s.split(" ");
        int k =0;
        for(int i=0; i<array.length; i++)
        {
            array[i].replace(" ","");
            if(array[i].length() > 0) k++;
        }
        return k;
    }
}
