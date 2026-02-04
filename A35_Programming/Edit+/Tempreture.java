import java.util.Scanner;
class  Tempreture
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temp in celc: ");
		double temp =sc.nextDouble();
		
		final double CEL = (temp*9/5.0) +32;
		System.out.println(CEL);
	}
}
