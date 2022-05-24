package oopp;
import java.util.*;
class NegativeExce extends Exception{
	NegativeExce(String msg)
	{
		super(msg);
	}
}
public class ExcepAverage {
	public static void main (String args[]) {
		
		float average=0.0f;
		float sum=0.0f,count=0.0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of numbers");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		float a[]=new float[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextFloat();
			try{
				if(a[i]<0)
					throw new NegativeExce("Negative number");
				else {
					sum=sum+a[i];
					count=count+1;
				}
				
			}
			catch(NegativeExce e) {
				System.out.println(e);
			}
		}
		
	}
}
