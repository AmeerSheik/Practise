/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folderRead;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ameer
 */
public class TestTeluguContent {

    public static void main(String[] args) {

       String str="ఆంధ్రప్రదేశ్";
        String char1 = getUnicodeCharacterOfChar(str.charAt(3));
        System.out.println("Unicode value of character d: "+char1);
        System.out.println("");
    }
    private static String getUnicodeCharacterOfChar(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}
