package day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Charoccurencewithmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "welcome to Selenium automation";
		char[] ch = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		System.out.println(map);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
