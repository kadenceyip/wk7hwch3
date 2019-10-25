package week7ch3hw;

public class P24 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setCar(4326, 23.1);
		car1.show();
		
		System.out.println("只變更車號");
		car1.setCar(1028);
		car1.show();
		
		System.out.println("只變更汽油量");
		car1.setCar(29.6);
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("車號設為"+num);
	}
	public void setCar(double g)
	{
		gas = g;
		System.out.println("汽油量設為"+gas);
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為"+num+", 汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號為"+this.num);
		System.out.println("汽油量為"+this.gas);
	}
}