//Name: Ahmet
//Project Name: Problems
//Date: 10/1/2021
//Project Description: Solving problems using mainly variables.

public class FormatPractice2 {
	public static void main(String args[]) {
		
		
		//Problem #1
		int male=8;
		int female=12;

		System.out.println("Percentage of males = "+ male+"/20 = %"+(8.00/10)*(50));
		System.out.println("Percentage of females = "+ female+"/20 = %"+(12.00/10)*(50));
		
		System.out.println();
		//Problem #2
	
		
		
		int James=85;
		int Jack=78;
		int Joe=96;
		
		
		String Student1="James";
		String Student2="Jack";
		String Student3="Joe";
		
		
		System.out.println(Student1+" got an "+James);
		System.out.println(Student2+" got an "+Jack);
		System.out.println(Student3+" got an "+Joe);
		System.out.println("\nThe class average on the test was "+(James+Jack+Joe)/3);
		
		System.out.println();
		//Problem #3
		
		
		
		double EmpOneH=39.35;
		double EmpOneS=8.66;
		
		System.out.println("Employee #1");
		System.out.printf("Hours worked= %.2f\n",EmpOneH);
		System.out.printf("Hourly pay rate= %.2f\n",EmpOneS);
		System.out.printf("Gross Pay= %.2f\n",EmpOneH*EmpOneS);
		
		double EmpTwoH=34.50;
		double EmpTwoS=9.23;
		
		System.out.println("Employee #2");
		System.out.printf("Hours worked= %.2f\n",EmpTwoH);
		System.out.printf("Hourly pay rate= %.2f\n",EmpTwoS);
		System.out.printf("Gross Pay= %.2f\n",EmpTwoH*EmpTwoS);
		
	}
}
