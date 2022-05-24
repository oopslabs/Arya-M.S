package oopp;
import java.util.*;
interface shapes{
	void rectangle(float a,float b);
	void triangle(float c,float d);
	void square(float side);
	void circle(float radius);
	
}
 class figures implements shapes{
	public void rectangle(float a,float b) {
		 System.out.println("Area of rectangle : "+ a*b);
	}
		 public void triangle(float c,float d) {
			 System.out.println("Area of triangle : "+ 0.5*c*d);
	}
		 public void square(float side) {
			 System.out.println("Area of square : "+ side*side);
	}
		 public void circle(float radius) {
			 System.out.println("Area of triangle : "+ 3.14*radius*radius);
	}
}
public class Package {
   public static void main(String [] args) {
	   int l,b,br,h,s,r;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the length and breadth of rectangle");
	   l=sc.nextInt();
	   b=sc.nextInt();
	   System.out.println("Enter the breadth and height of triangle");
	   br=sc.nextInt();
	   h=sc.nextInt();
	   System.out.println("Enter the side of square");
	   s=sc.nextInt();
	   System.out.println("Enter the radius of circle ");
	   r=sc.nextInt();
	   figures f=new figures();
	   f.rectangle(l, b);
	   f.triangle(br,h);
	   f.square(s);
	   f.circle(r);
   }
}
