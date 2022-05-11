package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>mobile=new HashMap<String,Integer>();
		
		
		mobile.put("OnePlus Nord CE 5G",24999);
		mobile.put("OnePlus Nord 2 5G", 27999);
		mobile.put("Nokia G20 ", 12490);
		mobile.put("Nokia 105", 1349);
		mobile.put("Nokia 105",1249);
		System.out.println(mobile);
	  mobile.remove("OnePlus Nord 2 5G");
	  System.out.println(mobile);
	  System.out.println(mobile.containsKey("OnePlus Nord 2 5G"));
	  //mobile.clear();
	  for (Entry<String, Integer> entry : mobile.entrySet()) {
		 
		  //System.out.println(entry.getKey());
		  System.out.println(entry.getValue());
	  }
	  System.out.println( mobile.entrySet());
	}
	
		
	
	
	
	
	}

