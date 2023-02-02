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
public class Ex2 {
    private static final String REGEX = "\\bcat\\b";
   private static final String INPUT = "cat cat cat cattie cat";

   public static void main( String args[] ) {
       Pattern p = Pattern.compile(REGEX);
       Matcher m = p.matcher(INPUT);   // get a matcher object
       int count = 0;

       while(m.find()) {
         count++;
         System.out.println("Match number "+count);
         System.out.println("start(): "+m.start());
         System.out.println("end(): "+m.end());
      }
   }
}
