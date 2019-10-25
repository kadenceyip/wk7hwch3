package week7ch3hw;

public class P17 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		car1.setNumGas(4326, 23.1);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查樣本車時得知");
		System.out.println("車號為"+ number + ", 汽油量為"+ gasoline);
	}
}
class Car
{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("檢查車號");
		return num;
	}
	double getGas()
	{
		System.out.println("檢查汽油量");
		return gas;
	}
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為"+num+", 汽油量設為"+gas);
	}
}
