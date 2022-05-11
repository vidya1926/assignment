package day1;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am learning selenium" + "Today";

		// String newline= System.lineSeparator();

		int[] arr= new int[6];
		arr[1]=0;
		arr[2]=0;
		System.out.println(arr.length);
		
		
		
		System.out.println("Hello" + '\n' + "vidya");

		String s6 = "hello" + '\n' + "vidya";

		System.out.println(s6);
		String replaceAll = s6.replaceAll("[\n]", "");
		System.out.println(replaceAll);

		String s1 = "training Session";

		String s3 = "TRAINING SESSION";

		// equals and equalsignorecase

		if (s.equals(s1)) {
			System.out.println("Both the values are same");
		} else {
			System.out.println("Both are different");
		}

		if (s.equalsIgnoreCase(s1)) {
			System.out.println("Both the values are same");
		} else {
			System.out.println("Both are different");
		}

		boolean contentEquals = s.contentEquals("Training");
		System.out.println(contentEquals);

		boolean contains = s.contains(s1);
		System.out.println(contains);

		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		int indexOf = s.indexOf('s');// firstOccurence
		System.out.println(indexOf);

		int lastIndexOf = s.lastIndexOf('s');
		System.out.println(lastIndexOf);

		char charAt = s.charAt(4);
		System.out.println(charAt);

		String[] split2 = s.split("e");
		System.out.println(Arrays.toString(split2));

		char[] charArray = s.toCharArray();

		System.out.println(Arrays.toString(charArray));

		String str = "Test123";
		String substring = str.substring(5, 7);
		System.out.println(substring);
		String numbers = str.replaceAll("\\D", "");
		System.out.println(numbers);

		String replace2 = str.replace("3", "4");
		System.out.println(replace2);

		String words = str.replaceAll("\\d", "");
		System.out.println(words);
	

		boolean startsWith = s3.startsWith("TRAIN");
		System.out.println(startsWith);

		String space = s3.replaceAll("\\s", "r");
		System.out.println(space);

		int number = Integer.parseInt(numbers);
		System.out.println(number + 10);

		StringBuilder text = new StringBuilder("Testleaf");
		StringBuilder append = text.append(s);
		System.out.println(append);
		StringBuilder reverse = text.reverse();
		System.out.println(reverse);

	}

}
