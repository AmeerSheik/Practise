/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileRead;

import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class Demo1 
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fis= new FileInputStream("D:\\demo.docx");
            XWPFDocument doc = new XWPFDocument(fis);
            List<XWPFParagraph> paregraphList = doc.getParagraphs();
            for(XWPFParagraph paragraph:paregraphList)
                System.out.println(paragraph.getText());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
