package week7ch3hw;

public class P7 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 1313;
		car1.gas = 22.5;
		
		Car car2;
		car2 = new Car();
		
		car2.num = 9876;
		car2.gas = 27.3;
		
		System.out.println("車號是"+ car1.num);
		System.out.println("汽油量是"+ car1.gas);
		
		System.out.println("車號是"+ car2.num);
		System.out.println("汽油量是"+ car2.gas);

	}
}
class Car
{
	int num;
	double gas;

}
