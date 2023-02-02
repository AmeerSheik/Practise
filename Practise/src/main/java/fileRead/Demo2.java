/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileRead;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;

/**
 *
 * @author Ameer
 */
public class Demo2 
{
    public static void main(String[] args) throws Exception
    {
        //String f1="C:\\Users\\Ameer\\Downloads\\GF2047 -- U Swathi__Dr DMR patient.doc";
//        String f2="D:\\demo2.docx";
        //name(f1);
//        name(f2);
        List list=null;
        Demo2 d=new Demo2();
        list=d.name();
        System.out.println(list);
        }
    public List name() 
    {
        List list2=new LinkedList();
        list2.add(10);
        list2.add(20);
        return list2;
    }
}
