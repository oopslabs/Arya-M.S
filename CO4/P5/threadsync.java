package arya;

import java.util.Scanner;
class Prime extends Thread
{
	 public synchronized void run()
	    {
	        int i = 0;
	        int num = 0;
	        String primeNumbers = "";
	        
	        for (i = 1; i <= 10; i++) {
	            int counter = 0;
	            for (num = i; num >=1; num--) {
	               
	                // condition to check if the number is prime
	                if (i % num == 0) {
	                   
	                    // increment counter
	                    counter = counter + 1;
	                }
	            }
	           
	            if (counter == 2) {
	                primeNumbers = primeNumbers + i + " ";
	            }
	        }
	       
	        System.out.println("\nPrime numbers from 1-10 : \n"
	            + primeNumbers);
	       
	        System.out.println();
	    }
	}
class FiveTable extends Thread
{
	public synchronized void run()
	{ 
		System.out.println("Multiplication Table of 5");
		for(int i=1;i<=10;++i)
		{
			System.out.println("5 * "+i+"="+(5*i));
		}
	}
}
public class ThreadSync {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Prime p=new Prime();
        p.start();
		FiveTable f=new FiveTable();
		f.start();
	}
	

}
{
	public synchronized void run()
	{ 
		System.out.println("Multiplication Table of 5");
		for(int i=1;i<=10;++i)
		{
			System.out.println("5 * "+i+"="+(5*i));
		}
	}
}
public class ThreadSync {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Prime p=new Prime();
        p.start();
		FiveTable f=new FiveTable();
		f.start();
	}
	

}
