package day4;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "";
		Map<String,String> flight=new TreeMap<String,String>();
		
		flight.put("chennai","Indigo");
		flight.put("Hyderabad", "Spicejet");
		flight.put("Bangalore", "Indigo");
		flight.put("Mumbai", "AirIndia");
		flight.put("Mumbai", "AirAsia");
		String cities = flight.get("chennai");
		
		flight.put("Kolkata", "Spicejet");

		System.out.println(cities);
		int count=0;
		
		System.out.println(flight.values());
		System.out.println(flight.keySet());
		System.out.println(flight.entrySet());
		for(Entry<String,String> m:flight.entrySet())
		{
			if(m.getValue().contains("Spice")){
				count++;
				System.out.println(m.getKey());
			}
		}
		System.out.println(count);
		
	
}
}