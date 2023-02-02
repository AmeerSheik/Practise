/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileRead;

import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.microsoft.OfficeParser;
import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
import org.apache.tika.sax.BodyContentHandler;
/**
 *
 * @author Ameer
 */
public class FirstTika 
{
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream is=new FileInputStream("D:\\GF2047 -- U Swathi__Dr DMR patient.doc");
        BodyContentHandler handler = new BodyContentHandler();
        Metadata meta = new Metadata();
        ParseContext context = new ParseContext();
        OfficeParser parser = new OfficeParser();
        parser.parse(is, handler, meta, context);
        String[] data=meta.names();
        for(String name : data)
            System.out.println(name);
        FirstTika t = new FirstTika();
       // t.stream();
    }
    /*public String stream() throws Exception
    {
        BodyContentHandler handler =new BodyContentHandler();
        AutoDetectParser parser= new AutoDetectParser();
        Metadata metadata = new Metadata();
        try(InputStrem stream = ContentHandler)
    }*/
}
