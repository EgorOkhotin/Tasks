public class Task7 {
    public static void Run(double a, double b, double c)
    {
        double d = b*b - (-4)*a*c;
        if(d>0)
        {
            double x1 = ((-b)+ Math.sqrt(d))/2;
            double x2 = ((-b)- Math.sqrt(d))/2;
            System.out.print(x1 + ' ' + x2);
        }
        else if (d==0)
        {
            double x = ((-b)+ Math.sqrt(d))/2;
            System.out.print(x);
        }
    }
}
