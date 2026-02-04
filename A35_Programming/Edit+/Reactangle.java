import java.util.Scanner;
class Reactangle 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width: ");
		double width = sc.nextDouble();
		System.out.println("Enter the height: ");
		
		double height = sc.nextDouble();
		
		final double AREA = width * height;
		final double PERIMETER = 2*(width+height);
		
		System.out.printf("the area is %.2f: %n ",AREA);
		System.out.printf("the Perimeter is % .2f: " ,PERIMETER);
	}
}
