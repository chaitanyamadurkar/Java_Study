import java.util.Scanner;
class Resverse{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();
		System.out.println(reversedgt(num));
	}
	public static int reversedgt(int n) {
		
		int z = 0;
		while(n > 0){
		 z = z * 10 + n % 10;    // eg n =122 -> z = 0 + 2 > z =2 ; 	then n/10 > 122 /10 = 12					/
		n = n/10;				//   n = 12 -> z = 2* 10 + 12% 10 = 20 + 2 = 22 then  12/10 = 1
								//  n = 1 ->  z = 22* 10 + 1% 10 = 220 + 1 = 221 then  1/10 = 0 end
	}
	return z;
		
	}
}