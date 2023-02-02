/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javafx.scene.control.Cell;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.CharacterRun;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.hwpf.usermodel.TableCell;
import org.apache.poi.hwpf.usermodel.TableIterator;
import org.apache.poi.hwpf.usermodel.TableRow;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ameer
 */
public class Demo5 
{
    Map<String,String> map=new LinkedHashMap<String,String>();
    static String st;
    FileInputStream fis;
    POIFSFileSystem pfs;
    HWPFDocument doc;
    public static void main(String[] args) throws Exception
    {
        String file1="D:\\GF2047 -- U Swathi__Dr DMR patient.doc";
        String file2="D:\\COVERING LETTER_GF2047 -- U N Swathi.doc";
        Demo5 d=new Demo5();
        d.readFileByRow(file1);
        //d.readFileByRow(file2);
        //d.readFileByColumn(file1);
    }
    public void readFileByRow(String file) throws Exception
    {
        fis = new FileInputStream(file);
        pfs = new POIFSFileSystem(fis);
        doc = new HWPFDocument(pfs);
        WordExtractor ext = new WordExtractor(doc);
        Range r = doc.getRange();
        TableIterator itr = new TableIterator(r);
        while(itr.hasNext())
        {
            Table table = itr.next();
            for(int rowIndex =0;rowIndex < table.numRows();rowIndex++)
            {
                TableRow row=table.getRow(rowIndex);
                for(int cellIndex = 0;cellIndex < row.numCells();cellIndex++)
                {
                    TableCell cell = row.getCell(cellIndex);
                    //System.out.println(cell.getParagraph(0).text());
                    st= cell.getParagraph(0).text();
                    //System.out.println(st);
                    Demo5 d=new Demo5(); 
                   
                    if(st.startsWith("Referred By"))
                        checking(st);
                    if(st.startsWith("Reference Inst"))
                        checking(st);
                    if(st.startsWith("Reference Code"))
                        checking(st);
                    if(st.startsWith("Sample type"))
                        checking(st);
                    if(st.startsWith("Collection Date"))
                        checking(st);
                    if(st.startsWith("Sample ID"))
                        checking(st);
                    if(st.startsWith("Patient"))
                        checking(st);
                    /* if(st.startsWith("Patien))
                        checking(st);*/
                    if(st.startsWith("Test Type"))
                        checking(st);
                    if(st.startsWith("Sample received"))
                        checking(st);
                    if(st.startsWith("Reported on"))
                        checking(st);
                    if(st.startsWith("Clinical symptoms and Investigations done"))
                    {
                        checking(st);
                        if(st.startsWith("FNAC"))
                            checking(st);
                    
                    if(st.startsWith("FNAC"))
                        checking(st);
                    if(st.startsWith("Clinical suspicion"))
                        checking(st);
                    }if(st.startsWith("Family history"))
                        checking(st);
                }
                
            }
            //System.out.println(st);
        }
        //System.out.println(st);
        System.out.println(map);
    }
    public void checking(String s)
    {
        String[] parts=s.split(":");
        String part1=parts[0].trim();
        String part2=parts[1].trim();
        if(!part1.equals("") && !part2.equals(""))
        {   
            map.put(part1, part2);
        }
    }
    public void readFileByColumn(String file) throws Exception
    {
        fis = new FileInputStream(file);
        pfs = new POIFSFileSystem(fis);
        doc = new HWPFDocument(pfs);
        WordExtractor ext = new WordExtractor(doc);
        Range r=doc.getRange();
        TableIterator itr = new TableIterator(r);
        while(itr.hasNext())
        {
            
        }
    }
}
