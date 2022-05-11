package day1;

import java.util.Arrays;

public class LearnSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="We are learning in Doubt Session";
			
		String[] split = str.split(" ");
		
		System.out.println(Arrays.toString(split));
		
	//sentence=> are,in session;
		//arrayindex=>we, learning, doubt
		//index-0,2,4
		
		for(int i=0;i<split.length;i++)
		{
			if(i%2!=0) {
				
				char[] charArray = split[i].toCharArray();
				
				//We w,e
				
				
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}else {
				System.out.print(split[i] +" ");
			}
		}
		
		
		
		
		
		
		
	}

}
