import java.util.*;
public class Q5{
	 public static void main(String[] args) {
			result obj= new result();
			obj.display();

	 }		}
 class result implements student,sports{
	
	 void display(){
	             System.out.println("\n Student id:"+sid+"\n Student name:"+Sname+"\n Sports name:"+type);
          }
}

interface student{
	int sid=101;
	String Sname="Arun M.S";
	
}
interface sports{
	String type="cricket";
}
