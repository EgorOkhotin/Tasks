import java.util.ArrayList;

public class Task8 {
    public void Run(int k)
    {
        int count = 0;
        for(int i=1; i<k;i++)
        {
            if(IsPolindrom(i)) count++;
        }
        System.out.print(count);
    }

    private int Reverse(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0)
        {
            list.add(n%10);
            n=n/10;
        }
        int result = 0;
        for(int i =0; i<list.size();i++)
        {
            result *=10;
            result += list.get(i);
        }
        return result;
    }

    private boolean IsPolindrom(int n)
    {
        if(n == Reverse(n)) return true;
        else return false;
    }
}
