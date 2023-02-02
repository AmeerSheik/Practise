/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Ameer
 */
public class Ex1 {
    public static void main(String[] args) {
        
         JSONObject jobj1 = new JSONObject();
         jobj1.put("name", "java");
         jobj1.put("version","1.8");
         System.out.println(jobj1);
         JSONObject jobj2 = new JSONObject();
         jobj2.put("name", "pythin");
         jobj2.put("version","1.0");
         System.out.println(jobj2);
         JSONArray jarr = new JSONArray();
         jarr.put(jobj1);
         jarr.put(jobj2);
         System.out.println(jarr);
    }
}
