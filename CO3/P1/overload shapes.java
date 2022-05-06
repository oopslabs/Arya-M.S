package P;
import java.util.*;
class overloadd {
	void area(float x){
		System.out.println("The area of the square is "+Math.pow(x,2)+" units");
	}
  void area(float x,float y){
	  System.out.println("The area of the rectangle "+x*y+" sq units");
  }
  void area(double x)
  {
      double z = 3.14 * x * x;
      System.out.println("the area of the circle is "+z+" sq units");
  }
}
  class overload 
  {
	public static void main(String args[]) {
		overloadd ob= new overloadd();
		ob.area(4);
		ob.area(3,7);
		ob.area(3.4);

	}

}
