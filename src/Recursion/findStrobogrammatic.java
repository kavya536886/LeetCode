/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kavyareddy
 */
public class findStrobogrammatic {

    public HashMap<String, String> hmp = new HashMap<String, String>();

    public List<String> findStrobogrammatic(int n) {
        List<String> List = new ArrayList<String>();
//		hmp.put("0", "0");
        hmp.put("1", "1");
        hmp.put("8", "8");
        hmp.put("6", "9");
        hmp.put("9", "6");
      
     
      
      
        List = Method(n);
      
//		for (int i = 0; i < List.size(); i++) {
//			if(List.get(i).length()!=n){
//                            List.remove(i);
//                          i--;
//                        }
//                }
 List.remove("00");
        return List;

    }

    public List<String> Method(int n) {
        List<String> list = new ArrayList<String>();
        if (n <= 0) {
            return list;
        } else if (n == 1) {
            list.add("0");
            list.add("1");
            list.add("8");
            return list;
        } else if (n == 2) {
             list.add("00");
            list.add("69");
            list.add("11");
            list.add("88");
            list.add("96");
           
            return list;
        } else {

            List<String> temp = Method(n - 2);

            for (String str : temp) {
                for (Map.Entry<String, String> entry : hmp.entrySet()) {
                    list.add(entry.getKey() + str + entry.getValue());
                }
            }
        }
        
      
        return list;
    }

}
