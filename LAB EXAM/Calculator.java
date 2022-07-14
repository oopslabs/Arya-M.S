package exam;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("MENU");
		System.out.println("1-ADD\n2-SUBSTRACTION\n3-MULTIPLICATION\n0-EXIT");
		do{
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
			case 1:System.out.println("Enter the First number");
			int a=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Second number");
			int b=sc.nextInt();
			sc.nextLine();
			System.out.println("SUM="+(a+b));
			break;
			case 2:System.out.println("Enter the First number");
			int c=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Second number");
			int d=sc.nextInt();
			sc.nextLine();
			System.out.println("SUBSTRACTION="+(c-d));
			break;
			case 3:System.out.println("Enter the First number");
			int e=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Second number");
			int f=sc.nextInt();
			sc.nextLine();
			System.out.println("PRODUCT="+(e*f));
			break;
			default:System.out.println("EXIT");
			}
			
		}while(choice!=0);

	}

}
