import java.util.*;
import java.lang.*;
public class sort_pg1 {
	public static void main(String[] args){
		String a;
		char temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		a=in.nextLine();
		char s [] = a.toCharArray();
		for(int i = 0;i < a.length();i++){
			for(int j = 0;j < a.length();j++){
				if(s[i]<s[j]){
					temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		a = String.valueOf(s);
		System.out.println(a);
		
	}
}
