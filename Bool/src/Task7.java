import java.util.ArrayList;

public class Task7 {
    public void Run(int n)
    {
        System.out.print(Reverse(n));
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
}
