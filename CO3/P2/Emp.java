import java.util.*;
public class Emp {
       int emp_id,emp_sal;
       String emp_name,emp_add;
       Emp(int p,String r,int q,String a){
    	   this.emp_id=p;
    	   this.emp_name=r;
    	   this.emp_sal=q;
    	   this.emp_add=a;
       }
class Teacher extends Emp{
	   String dept,subj;
	   Teacher(int p,String r,int q,String a,String t,String u){
		   super(p,q,r,s);
		   this.dept=t;
		   this.dept=u;
	   }
	   void diplay() {
		   System.out.println("ID:"+emp_id);
		   System.out.println("NAME:"+emp_name);
		   System.out.println("DEPARTMENT:"+dept);
		   System.out.println("SUBJECT:"+subj);
		   System.out.println("SALARY:"+emp_sal);
		   System.out.println("ADDRESS:"+emp_add);
	   }
}
public class mainclass{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=s.nextInt();
		s.nextLine();
		
		Teacher t[] = new Teacher[n];
		for(int i=0;i<n;i++) {
	    System.out.println("Teacher"+(i+1));
	    System.out.println("Enter the employee id");
	    int p=s.nextint();
	    s.nextLine();
	    System.out.println("Enter the employee name");
	    String r=s.nextLine();
	    System.out.println("Enter the department");
	    String t=s.nextLine();
	    System.out.println("Enter the subject");
	    String u=s.nextLine();
	    System.out.println("Enter the employee salary");
	    int q=s.nextint();
	    s.nextLine();
	    System.out.println("Enter the address");
	    String a =s.nextLine();
	    t[i] = new Teacher(p,r,t,u,q,a);
		}
		System.out.println("DETAILS\n");
		for(int i=0;i<n;i++){
			System.out.println("Teacher "+(i+1));
			t[i].display();
	}

}
