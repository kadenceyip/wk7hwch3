package week7ch3hw;

public class P47 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		int number = 4326;
		double gasoline = 23.1;
		String str = "一號車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	private String name;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "沒有名字";
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為"+num+", 汽油量設為"+gas);
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("車名設為"+name);
	}
	public void show()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("車名為"+name);
	}
}


	

