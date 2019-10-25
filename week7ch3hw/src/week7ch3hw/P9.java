package week7ch3hw;

public class P12 {


	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.num = 4326;
		car1.gas = 23.1;
		
		car1.show();
	}
}
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是"+ this.num);
		System.out.println("汽油量是"+ this.gas);
	}
	void showCar()
	{
		System.out.println("開始顯示車子的資料");
		this.show();
	}
}
