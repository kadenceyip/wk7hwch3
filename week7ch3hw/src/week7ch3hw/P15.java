package week7ch3hw;

public class P15 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		int number = 4326;
		double gasoline = 23.1;
		
		car1.setNumGas(number, gasoline);
	}
}
class Car
{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為"+ num + ", 汽油量設為"+ gas);
	}
	void show()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+ gas);
	}
}
