
import java.util.*;
import java.io.*;
public class FileIO
{
    public static void main(String [] args)
    {
        try {
            System.out.println("Please enter file name");
            Scanner input = new Scanner(System.in);
            String fileName = input.next(); // gets file name

            FileReader fr = new FileReader(fileName); //opens a stream to file
            BufferedReader br = new BufferedReader(fr); //allows for manipulation of the file. Added functionality
            StringTokenizer line;
            String newLine = "";

            File yourFile = new File("score.txt");
            yourFile.createNewFile(); // if file already exists will do nothing

            FileWriter fw = new FileWriter(yourFile);
            BufferedWriter bw = new BufferedWriter(fw);


            while ((newLine = br.readLine())!= null)
            {
                bw.write(newLine);
            }
            bw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("no file exists");
            System.exit(1);
        }
        catch(IOException c)
        {
            System.out.println("IO");
            System.exit(1);
        }
    }

}

