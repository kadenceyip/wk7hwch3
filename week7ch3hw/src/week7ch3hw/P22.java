package week7ch3hw;

public class P22 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setNumGas(4326, 23.1);
		car1.show();
		
		System.out.println("試輸入不正確汽油量(-5)");
		
		car1.setNumGas(4326, -5);
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g)
	{
		if(g>0 && g<100)
		{
			num = n;
			gas = g;
			System.out.println("車號設為"+num+", 汽油量設為"+gas);
		}
		else
		{
			System.out.println(g+"不是正確的汽油量");
			System.out.println("無法更改汽油量");
		}
	}
	public void show()
	{
		System.out.println("車號為"+this.num);
		System.out.println("汽油量為"+this.gas);
	}
}