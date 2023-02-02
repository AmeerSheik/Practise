/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ameer
 */
public class Ex1 {
    
    public static void main(String[] args) {
        
        String pattern = "(In)";
        Pattern p = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("To change this license header, choose License Headers in Project Properties.");
        boolean matched = m.find();
        if(m.find()) {
//            System.out.println("matched:"+m.group(0));
            System.out.println("matched:"+m.group(1));
//            System.out.println("matched:"+m.group(2));
            
        }else
            System.out.println("not matched");
    }
}
