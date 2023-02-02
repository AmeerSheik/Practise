/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tika;

import java.io.File;
import org.apache.tika.Tika;

/**
 *
 * @author Ameer
 */
public class TikaEx1 {

    public static void main(String[] args) throws Exception {
        File f = new File("D:\\Genome\\GF2047 -- U Swathi__Dr DMR patient.doc");
        Tika t = new Tika();
        String s = t.parseToString(f);
        System.out.println(s);
    }
}
