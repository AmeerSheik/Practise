/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import org.apache.poi.hslf.util.LocaleDateFormat;
import org.apache.poi.util.LocaleID;

/**
 *
 * @author Ameer
 */
public class Ex1 {

    public static void main(String[] args) {
        
        LocalDateTime dt=LocalDateTime.now();
        
        System.out.println(dt);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm");
        String fdt=dt.format(f);
        System.out.println(fdt);
        LocalDate d=LocalDate.now();
        System.out.println(d);
//        DateFormat df=new DateFormat("dd-MM-yyyy");
    }
    
}
