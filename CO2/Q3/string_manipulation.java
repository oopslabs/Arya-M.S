import java.util.*;
public class string_manipulate {

	public static void main(String[] args) {
		String text2="Programming";
		char a1=text2.charAt(0);
		int n1=text2.length();
		String text1="Java ";
		String text3=text1.concat(text2);
		String text4=text1+text2;
		System.out.println(text3);
		System.out.println(text4);
		
		System.out.println("Character at position 0:" +a1);
		System.out.println(text2.replace('P','T'));
		System.out.println(text2.length());
		System.out.println(text2.isEmpty());
		System.out.println("Index of character 'v':" + text1.indexOf('v'));
		System.out.println("Compare to 'Java':" + text1.compareTo("JAVA"));
		System.out.println("Equals to 'Java':" + text1.equals("JAVA"));
		System.out.println("Lowercase to 'Java':" + text1.toLowerCase());
		System.out.println("Uppercase to 'Java':" + text1.toUpperCase());
		System.out.println("Remove whitespace of 'Java':" + text1.trim());
		System.out.println("String into an array of substring:" + text1.split("Java"));
		System.out.println(" Match 'Java':" + text1.matches("JAVA"));
	}

}
