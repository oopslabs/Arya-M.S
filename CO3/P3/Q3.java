import java.util.*;
public class Person{
	String Name,Gender,Address;
	int Age;
	Person(String a,int d,String b,String c){
		this.Name=a;
		this.Gender=b;
		this.Address=c;
		this.Age=d;
	}
}
class Employee extends Person{
	int Emp_id,salary;
	String Comp_name,qual;
	Employee(String a,int d,String b,String c,int p,String q,String t,int u)
	{
		super(a,b,c,d);
		this.Emp_id=p;
		this.qual=q;
		this.Comp_name=t;
		this.salary=u;
	}
}
class Teacher extends Employee{
	int teach_id;
	String subj,dep;
	Teacher(String a,int d,String b,String c,int p,String q,String t,int u,int v,String w,String x)
	{
	super(a,d,b,c,p,q,t,u);
	this.teach_id=v;
	this.subj=w;
	this.dep=x;
	}
	}
void display() {
	System.out.println("NAME:"+Name+"\nAGE:"+Age+"\nGENDER:"+Gender+"\nADDRESS"+Address+"\nEMPLOYEE ID:"+Emp_id+"\nCOMPANY NAME:"+Comp_name+"SALARY:"+salary+"\QUALIFICATION:"+qual+"\nTEACHER ID:"+teach_id+"\nDEPARTMENT:"+dep+"\nSUBJECT:"+subj);
}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=s.nextInt();
		s.nextLine();
		
		Teacher T[]= new Teacher[n];
		for(int i=0;i<n;i++){
			System.out.println("Teacher "+(i+1));
			System.out.println("Enter the name");
			String a=s.nextLine();
			System.out.println("Enter the age");
			int d=s.nextInt();
			s.nextLine();
			System.out.println("Enter the gender");
			String b=s.nextLine();
			System.out.println("Enter the address");
			String c=s.nextLine();
			
			System.out.println("Enter the Employee ID");
			int p=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Company name");
			String t=s.nextLine();
			System.out.println("Enter the Qualification");
			String q=s.nextLine();
			System.out.println("Enter the salary");
			int u=s.nextInt();
			s.nextLine();
			
			System.out.println("Enter the Teacher ID");
			int v=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Department");
			String x=s.nextLine();
			System.out.println("Enter the Subject");
			String w=s.nextLine();
			T[i]= new Teacher(a,d,b,c,p,t,q,u,v,x,w);
		}
	
		System.out.println("DETAILS");
		for(int i=0;i<n;i++){
			System.out.println("Teacher"+(i+1));
			T[i].display();
		}

	}

}
