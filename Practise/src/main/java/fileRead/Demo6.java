/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileRead;

import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.hwpf.usermodel.TableIterator;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author Ameer
 */
public class Demo6 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("D:\\GF2047 -- U Swathi__Dr DMR patient.doc");
        POIFSFileSystem fs = new POIFSFileSystem(fis);
        HWPFDocument doc = new HWPFDocument(fs);
        Range r = doc.getRange();
        TableIterator itr = new TableIterator(r);
        while(itr.hasNext())
        {
            Table table=itr.next();
//            for(int rowIndex = 0;rowIndex<table.length;)
        }
    }
}
