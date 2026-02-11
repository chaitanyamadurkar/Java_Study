import java.util.Scanner;
class SwitchCase{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the charector:");
		char ch = sc.next().toUpperCase().charAt(0);

		switch (ch)
		{
		    case 'A','E','I','O','U': {System.out.println(ch +"its a vowel"); break;}
		    default : {System.out.println(ch+"its a consonent");break;}
		}
	}
}