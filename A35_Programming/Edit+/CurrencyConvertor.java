import java.util.Scanner;
class CurrencyConvertor
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// infiniteLoop

		for (; ; ) {
			System.out.println("\n WELCOME");
			System.out.println("********** CURRENCY CONVERTOR **********\n");
			System.out.println("Enter the anount(INR): ");
			double amount = sc.nextDouble();

			System.out.println("1.USE \n2.EUR \n3.KWD \n4.GBP \n5.JPY \n6.KRW \n7.AUD \n8.RUB \n9.PKR \n10.ZAR");
			System.out.println("Enter the currency conveting :");
			String resp = sc.next().toUpperCase();

			boolean assump = true;
			double convertedAmount = 0;

			if (resp.equals("USD")) {
				convertedAmount = amount/90.21;	
			}else if (resp.equals("EUR")) {
				convertedAmount = amount/106.53;	
			}else if (resp.equals("KWD")) {
				convertedAmount = amount/293.61;	
			}else if (resp.equals("GBP")) {
				convertedAmount = amount/123.30;	
			}else if (resp.equals("JPY")) {
				convertedAmount = amount/0.57;	
			}else if (resp.equals("KRW")) {
				convertedAmount = amount/0.06;	
			}else if (resp.equals("AUD")) {
				convertedAmount = amount/63.24;
			}else if (resp.equals("RUB")) {
				convertedAmount = amount/1.17;
			}else if (resp.equals("PKR")) {
                convertedAmount = amount/0.32;
			}else if (resp.equals("ZAR")) {
            	convertedAmount = amount/5.64;
            }else {
            	assump = false;
            	System.out.println("\n INVALID CURRENCY");
            }if (assump) {
            	System.out.printf("%n%20.2f INR = %.2f%s%n", amount,convertedAmount,resp);
            	
            }
		}
	}
}