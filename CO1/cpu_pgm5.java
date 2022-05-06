import java.util.*;

public class cpu_pg5 {
	class Processor{
		int core;
		String manu;
		Processor(int cores,String manus){
			core = cores;
			manu = manus;
		}
		void out(){
			System.out.println("No of cores : "+core);
			System.out.println("Manufacturer : "+manu);
		}
	}
	static class RAM{
		static String memory,ram_manufacturer;
		RAM(String memorys,String ram_manufacturers){
			memory = memorys;
			ram_manufacturer = ram_manufacturers;
		}
		void output(){
			System.out.println("Memory : "+memory);
			System.out.println("Manufacturer : "+ram_manufacturer);
		}
	}
	public static void main(String[] args){
		int price,core;
		String manu,memory,ram_manufacturer;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the CPU details");
		System.out.println("Enter the processor details");
		System.out.print("Enter the no of cores");
		core = in.nextInt();
		in.nextLine();
		System.out.print("Enter the manufacturer");
		manu = in.nextLine();
		System.out.println("Enter the RAM details");
		System.out.print("Enter the memory capacity");
		memory = in.nextLine();
		System.out.print("Enter the manufacturer");
		ram_manufacturer = in.nextLine();
		System.out.print("Enter the CPU price");
		price = in.nextInt();
		cpu_pg5 obj1 = new cpu_pg5();
		cpu_pg5.Processor obj2 = obj1.new Processor(core,manu);
		cpu_pg5.RAM obj3 = new cpu_pg5.RAM(memory,ram_manufacturer);
		obj2.out();
		obj3.output();
		System.out.println("Price of the CPU "+price);		
	}
}
