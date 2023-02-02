
//reading text file using bufferedreader.

package Test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Ameer
 */
public class Demo2 
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader fr = new FileReader("D:\\Demo1.txt");
            BufferedReader br=new BufferedReader(fr);
            String st;
            while((st=br.readLine())!= null)
                System.out.println(st);
            br.close();
            fr.close();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
