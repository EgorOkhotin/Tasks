public class FirstExManager {
    static void run()
    {
        String inputFileName = "First/input.txt";
        String outputFileName = "First/output.txt";
        StringBuilder builder = FileWorker.read(inputFileName);

        int i =0;
        while(!isSpace(builder.charAt(i))) i++;

        int j = i + 1;
        while(isSpace(builder.charAt(j))) j++;

        String num2 = builder.substring(j,builder.length()-1);
        String num1 = builder.substring(0,i);
        i = Integer.parseInt(num1);
        j = Integer.parseInt(num2);
        i+=j;
        FileWorker.write(outputFileName, Integer.toString(i));
    }

    private static boolean isSpace(char ch)
    {
        if((ch == ' ') | (ch == '\n') | (ch== '\t')) return true;
        return false;
    }
}
