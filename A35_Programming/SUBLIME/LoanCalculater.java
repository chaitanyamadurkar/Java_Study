import java.util.Scanner;
class LoanCalculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (; ; ) {
			System.out.println("\n **** WELCOME **** ");
			System.out.println("Amount : ");
			double amount = sc.nextDouble();
			if (amount< 1000 || amount > 100000) {
				System.out.println("\n INCVALID AMOUNT");
				continue;	
			}
			System.out.println("RATE OF INTERSES PER MONTH :");
			double interest = sc.nextDouble();
			if (interest<1 || interest>30) {
				System.out.println("\n INVALID INTEREST!");
				continue;	
			}
			System.out.println("LOAN TENURE(Months) :");
			int tenure = sc.nextInt();
			if (tenure<3 || tenure> 36) {
				System.out.println("INVALID TENURE!");
				continue;
				
			}
			double monthInt = (amount/100)* interest;
			double totalIntAmt = monthInt* tenure;
			double emi = amount+ totalIntAmt;
			double totalAmount = amount+ totalIntAmt;

			System.out.println("\n monthly emi :" + emi);
			System.out.println("\n principle amount :" + amount);
			System.out.println("\n total intrest :" + totalIntAmt);
			System.out.println("\n total amount :" + totalAmount);
		}
	}
}