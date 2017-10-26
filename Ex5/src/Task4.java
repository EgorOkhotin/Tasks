public class Task4 {
    public void Run(int n)
    {
        int[] sqArr = new int[4];
        int a=0;
        for(int k=0; k<3; k++)
        {
            while((a*a)<n)
            {
                a++;
            }
            a--;
            n = n - (a*a);
            sqArr[k] = a;
            a = 0;
        }

        while((a*a)<n)
        {
            a++;
        }
        //a--;
        n = n - (a*a);
        sqArr[3] = a;
        a = 0;
        System.out.print(sqArr[0]+" "+sqArr[1]+" "+sqArr[2]+" "+sqArr[3]);
    }
}
