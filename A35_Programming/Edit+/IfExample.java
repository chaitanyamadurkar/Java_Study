import java.util.Scanner;
class IfExample 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the char");
	char ch = sc.next().toUpperCase().charAt(0);
		if (ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
		{
		System.out.println(ch+" is an vowel");
		}else{
			System.out.println(ch+" is an consonent");
		}
		
	}
}
