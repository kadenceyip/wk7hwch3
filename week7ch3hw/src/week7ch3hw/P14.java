package week7ch3hw;

public class P14 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setNum(4326);
		car1.setGas(23.1);
	}
}
class Car
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("車號設為"+ num);
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("汽油量設為"+ gas);
	}
}