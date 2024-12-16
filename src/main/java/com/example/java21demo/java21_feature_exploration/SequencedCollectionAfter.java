package com.example.java21demo.java21_feature_exploration;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
/**
 * Represents benefits of SequencedMap in Collection.
 *
 * @author Coral Monisha P S
 * @version 1.0
 * @since 2024
 * Benefits:
 * No Manual iteration
 * Simplified operation
 */
public class SequencedCollectionAfter {
    public static void main(String[] args) {
        SequencedMap<String,Integer> map=new LinkedHashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        System.out.println(map.firstEntry().getKey()+" is the first key");
        System.out.println(map.lastEntry().getKey()+" is the last key");
    }
}
