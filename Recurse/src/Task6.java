import java.util.ArrayList;
import java.util.Stack;

public class Task6 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack3 = new Stack<>();
    public void Run(int n)
    {
        for(int i=n; i>0; i--) stack1.push(i);
        Move(n,stack1,stack2,stack3);

    }

    private void out(String s)
    {
        System.out.print(s);
    }

    private void Move(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c)
    {
        if(n==1)
        {
            c.push(a.pop());
            return;
        }
        else
        {
            Move(n-1,a,c,b);
            c.push(a.pop());
            Move(n-1,b,a,c);
            return;
        }
    }

}
