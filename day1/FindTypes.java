package day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//// Here is the input
		
		String cname= "Paypal software software company ";
		
		
		String[] wordArray = cname.split(" ");
		
		Set<String> words=new LinkedHashSet<String>(Arrays.asList(wordArray));
		
		System.out.println(words);
		
		for(String w:words){
			System.out.println(w);
		}
		
		
		//index[0]=PayPal
		//index[1]=software   --->erawtfos
		//index[2]=company
		
		
		//write the loop contition--for(){
		
		//write if condition--if(i%2==0) or if(i!=0)
		{
			//split[i].toCharArray()
			//for(j=arraylength ,j>0,j--)
			{
				//System.out.println(ch[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		int letter=0;
		
		
		char[] charArray = cname.toCharArray();
		
		
		for(int i=0;i<charArray.length;i++) {
			
			if(Character.isLetter(charArray[i])) {
				letter++;
				
			}else {
				System.out.println();
			}
						
					
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String str=cname.toLowerCase(); //paypal yl char[] ch=str.toCharArray();
		 * 
		 * Set<Character> charSet =new HashSet<Character>(); Set<Character> dupcharSet
		 * =new HashSet<Character>();
		 * 
		 * for (Character eachChar : ch) { if(!charSet.add(eachChar)) {
		 * dupcharSet.add(eachChar); }
		 * 
		 * } System.out.println(dupcharSet); //charSet.retainAll(dupcharSet);
		 * 
		 * charSet.removeAll(dupcharSet);
		 * 
		 * // yl
		 * 
		 * System.out.println("Charset");
		 * 
		 * for (Character eachCh : charSet) { if(eachCh!=' ')
		 * System.out.println(eachCh); }
		 * 
		 */
	}

}
