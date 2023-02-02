/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ameer
 */
public class Ex3 {
    
    
   
 
    public static void main(String[] args) {
        List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Delhi");
        list1.add("Mumbai");
        listOfLists.add(list1);
 
        ArrayList<String> anotherList = new ArrayList<String>();
 
        anotherList.add("Beijing");
        anotherList.add("Shanghai");
        listOfLists.add(anotherList);
        System.out.println(listOfLists);
        listOfLists.forEach((list)  ->
        {
            list.forEach((city)->System.out.println(city));
        }
                );
    }

    
    
}
