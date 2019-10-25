package week7ch3hw;

public class P6 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 1313;
		car1.gas = 22.5;
		
		System.out.println("車號是"+ car1.num);
		System.out.println("汽油量是"+ car1.gas);
	}
}
class Car
{
	int num;
	double gas;

}
