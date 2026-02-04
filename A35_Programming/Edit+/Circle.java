import java.util.Scanner;
class Circle
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println( "enter the redius");
	double radius = sc.nextDouble();
	final double PI = 22/7.0;
	final double AREA = PI * (radius * radius);
	final double PARAMETER = 2* PI * radius;
	
	System.out.println("redius :"+ radius+"cm");
	System.out.printf("Area of circle : % .3f cm^2 %n",AREA);
	System.out.printf("Pareameter of circle : % .3f cm^2 %n",PARAMETER);
	

		
	}
}
