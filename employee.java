package programs;



public class Employee {

	private int id;

	private int salary;

	public void setsalary(int mysal)

	{

		this.salary=mysal;

		if(salary<10000)

		{

			System.out.println("ERROR");

		}

		else

		{

			System.out.println("salary set to:"+salary);



		}

	}

	public int getsalary()

	{

		return salary;

	}



	public static void main(String[] args) {

		Employee e=new Employee();

		e.setsalary(20000);

		System.out.println(e.getsalary());



	}



}
