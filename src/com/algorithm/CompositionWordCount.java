package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CompositionWordCount {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(5);
        newNumbers.add(6);
        System.out.println("ArrayList2: " + newNumbers);

        boolean value = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + value);
        CompositionWordCount obj = new CompositionWordCount();
        String st = "aabbbbbbbbbbbbbbtttttttttttffffjljljljsldfjsljfljfsdljfljf";
        Map<String, Integer> mp =  obj.worCount(st);
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
        	//System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
        mp.forEach((k,v)->{
        	System.out.println("Item : " + k + " Count : " + v);
        });
       
	}
	private Map<String, Integer> worCount(String st) {
		List<String> lst = Arrays.asList(st.split(""));
		System.out.println(lst);
		Map<String,Integer> map = new LinkedHashMap<>();
		for(String s: lst) {
			map.put(s,Collections.frequency(lst, s));
		}
		
		return map;
		
	}

}
