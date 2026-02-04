import java.util.Scanner;
class AvrageSpeed
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in KM: ");
		Double dist = sc.nextDouble();
		System.out.println("Enter the time in hr: ");
		Double hr = sc.nextDouble();
		System.out.println("Enter the time in miniut: ");
		Double min = sc.nextDouble();
		System.out.println("Enter the time in second: ");
		Double sec = sc.nextDouble();
		
		final double TIME = (hr*3600 + min* 60 + sec )/3600;
		final double MILE = dist/1.6;
		final double SPEED = MILE/TIME;
		final double SP = dist/TIME;
		System.out.println(SPEED+"miles/hour");
	    System.out.println(SP+"km/hr");
	}
}



