package com.atmecs.employeeapp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		//System.out.println("test");
		
		String input = "SincroDigital, An Ansira Company";
		
		Test obj = new Test();
		Integer in = 9;
		obj.printfreChar(in);
		
	}
	
	
	void printfreChar(Integer input) {
		
		
		
		Integer[] intarray = {1, 2, 3, 5, 6, 7, 8};
		
		List<Integer> list = Arrays.asList(intarray);
				
			if(list.contains(input)) {
		
				System.out.println(list.indexOf(input));
			
			}else {
				
				//int findindex=0;
				/*
				 * for(Integer obj:list) { if(input<obj) {
				 * 
				 * } }
				 */
				
				for(int i=0;i<list.size()-1;i++) {
					
					
					if(list.get(i)<input && list.get(i+1)>input) {
						
						System.out.println(i+1);
					}
					
				}
				
			}
		
		
		
		
		
		
		/*HashMap<String, Integer>  hm = new HashMap<>();
		
		String[] strArray = input.split("");
		
		for(String strchar:strArray) {
			
			//System.out.println(strchar);
			
			if(hm.containsKey(strchar)) {
				
				hm.put(strchar, hm.get(strchar)+1);
			}else {
				hm.put(strchar,1);
			}
			
			
		}
		
		for(Entry<String, Integer>  hmobj: hm.entrySet()) {
			
			
			if(hmobj.getValue()>1) {
				
				System.out.println(hmobj.getKey()+":"+hmobj.getValue());
				
			}
			
			
		}
   
		
		
	*/	
	}
	

}
