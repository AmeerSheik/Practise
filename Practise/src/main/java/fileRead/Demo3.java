/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileRead;

import java.io.FileInputStream;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.model.ListTables;
import org.apache.poi.hwpf.model.TextPieceTable;
import org.apache.poi.hwpf.usermodel.HWPFList;
import org.apache.poi.hwpf.usermodel.HeaderStories;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.hwpf.usermodel.TableRow;

/**
 *
 * @author Ameer
 */
public class Demo3 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("D:\\GF2047 -- U Swathi__Dr DMR patient.doc");
        HWPFDocument doc = new HWPFDocument(fis);
        
        WordExtractor ext = new WordExtractor(doc);
        System.out.println(ext.getText());
        ListTables tables = doc.getListTables();
        Paragraph para;
        Range r= doc.getRange();
        /*for(int i=0;i<doc.tables;i++)
        {
            para=r.getParagraph(i);
            System.out.println("hello"+i);
        }
        */
        
    }
}
