import java.io.*;

public class FileWorker {
    public static StringBuilder read(String fileName)
    {
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(fileName))))
        {
            String s;
            try {
                while ((s = reader.readLine()) != null) {
                    builder.append(s);
                    builder.append('\n');
                }
            }
            finally {
                reader.close();
            }
        }
        catch(IOException ex)
        {
            throw new RuntimeException(ex);
        }
        return builder;
    }

    public static void write(String fileName, String text)
    {
        File file = new File(fileName);
        try{
            if(!file.exists()){
                file.createNewFile();
            }

            PrintWriter writer = new PrintWriter(file.getAbsoluteFile());

            try{
                writer.print(text);
            }
            finally {
                writer.close();
            }
        }
        catch(IOException ex)
        {
            throw new RuntimeException(ex);
        }
    }
}
