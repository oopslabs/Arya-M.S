import java.util.*;
 class Person{
	String Name,Gender,Address;
	int Age;
	Person(String pname,int page,String pgender,String paddr){
		this.Name=pname;
		this.Gender=pgender;
		this.Address=paddr;
		this.Age=page;
	}
}
class Employe extends Person{
	int Emp_id,salary;
	String Comp_name,qual;
	Employe(String pname,int page,String pgender,String paddr,int empid,String equal,String ecmpname,int esal)
	{
		super(pname,page,pgender,paddr);
		this.Emp_id=empid;
		this.qual=equal;
		this.Comp_name=ecmpname;
		this.salary=esal;
	}
}
class Teacher extends Employe{
	int teach_id;
	String subj,dep;
	Teacher(String pname,int page,String pgender,String paddr,int empid,String equal,String ecmpname,int esal,int t_id,String t_sub,String t_dep)
	{
	super(pname,page,pgender,paddr,empid,equal,ecmpname,esal);
	this.teach_id=t_id;
	this.subj=t_sub;
	this.dep=t_dep;
	}

void display() {
	System.out.println("NAME:"+Name+"\nAGE:"+Age+"\nGENDER:"+Gender+"\nADDRESS"+Address+"\nEMPLOYEE ID:"+Emp_id+"\nCOMPANY NAME:"+Comp_name+"SALARY:"+salary+"\nQUALIFICATION:"+qual+"\nTEACHER ID:"+teach_id+"\nDEPARTMENT:"+dep+"\nSUBJECT:"+subj);
}
}
public class prgm3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=s.nextInt();
		s.nextLine();
		
		Teacher T[]= new Teacher[n];
		for(int i=0;i<n;i++){
			System.out.println("Teacher "+(i+1));
			System.out.println("Enter the name");
			String pname=s.nextLine();
			System.out.println("Enter the age");
			int page=s.nextInt();
			s.nextLine();
			System.out.println("Enter the gender");
			String pgender=s.nextLine();
			System.out.println("Enter the address");
			String paddr=s.nextLine();
			
			System.out.println("Enter the Employee ID");
			int empid=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Company name");
			String ecmpname=s.nextLine();
			System.out.println("Enter the Qualification");
			String equal=s.nextLine();
			System.out.println("Enter the salary");
			int esal=s.nextInt();
			s.nextLine();
			
			System.out.println("Enter the Teacher ID");
			int t_id=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Department");
			String t_dep=s.nextLine();
			System.out.println("Enter the Subject");
			String t_sub=s.nextLine();
			T[i]= new Teacher(pname,page,pgender,paddr,empid,equal,ecmpname,esal,t_id,t_dep,t_sub );
		}
	
		System.out.println("DETAILS");
		for(int i=0;i<n;i++){
			System.out.println("Teacher"+(i+1));
			T[i].display();
		}

	}

}
