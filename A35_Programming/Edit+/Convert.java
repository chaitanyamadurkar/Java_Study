import java.util.Scanner;
class Convert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("enter the weight in pound: ");
		double weight = sc.nextDouble();
		final double CONV = 25.197/55.5;
		final double KILO = weight * CONV;
		
		System.out.println(KILO);
	}
}
