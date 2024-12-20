package com.example.java21demo.java21_feature_exploration;

import java.util.*;

/**
 * Represents drawbacks of iteration in Map.
 *
 * @author Coral Monisha P S
 * @version 1.0
 * @since 2024
 * Drawbacks:
 * Manual iteration
 */
public class SequencedCollectionsBefore {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        String firstKey=map.keySet().iterator().next();
        String lastKey="";
        for(String key:map.keySet()){
            lastKey=key;
        }
        System.out.println(firstKey+" is the firstkey");
        System.out.println(lastKey+" is the lastKey");

        //List
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        Collections.reverse(list);
        System.out.println(list+" is the reversed list");
    }
}
