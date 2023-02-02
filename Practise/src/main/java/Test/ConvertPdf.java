/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import org.apache.tika.Tika;


/**
 *
 * @author Ameer
 */
public class ConvertPdf 
{
    public static void main(String[] args) throws Exception 
    {
        File f=new File("D:\\GF1965_ Sickle Thalassemia _report.doc");
        Tika t=new Tika();
        String s=t.parseToString(f);
        LinkedList<String> list = new LinkedList<String>();
        FileInputStream fis = new FileInputStream("C:\\Users\\Ameer\\Documents\\NetBeansProjects\\Thalassemia\\src\\main\\java\\parser.properties");
        Properties prop = new Properties();
        prop.load(fis);
        Scanner sc;
        sc = new Scanner(s);
        String str = "";
        Set keys = prop.keySet();
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            for (Object key : keys) {
                String keyInProperty = (String) key;
                String valueInProperty = prop.getProperty(keyInProperty);
                if (str.contains(valueInProperty)) {
                    str = str.trim();
                    list.add(str);
                }

            }
        }
        //System.out.println(list);
        Object detailsObj[] = list.toArray();
        for (int i = 0; i < detailsObj.length; i++) {
            String str2 = (String) detailsObj[i];
            String arr[] = str2.split(":");
            String part1 = arr[0];
            String part2;
            if(arr.length<2)
                part2="-";
            else
                part2=arr[1];
            System.out.println(part1+":"+part2);
        }
    }
}
