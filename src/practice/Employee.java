package practice;

public class Employee 
{
	String ename;
	int empno;
	
	
	
	
	
	
	 Employee(String ename,int empno) 
	{
		 this.ename=ename;
		 this.empno=empno;
	
	}
	
	
	
	public static void main(String[] args) 
	{
		Employee e=new Employee("soumik", 01);
		System.out.println(e.ename);
		System.out.println(e.empno);
		
	}

}
