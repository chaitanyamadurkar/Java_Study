import java.util.Scanner;
class LoanCalc{
public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in);
    System.out.print("Loan Amount: ");
    double loanAmount=in.nextDouble();
    System.out.print("Number of Years: ");
    int years=in.nextInt();
    System.out.print("Interest rate:");
    double interst = in.nextDouble();

    double monthlyInterestRate = interst / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate /
            (1-1 / Math.pow(1 + monthlyInterestRate, years * 12));
    double totalPayment =  monthlyPayment * 12 * years;

    int lastMonth = years * 12;
    int month = 1;
    System.out.printf("%n %.2f %.2f %.2f","Interest Rate :"+interst+ "%", "  Monthly Payment " +monthlyPayment+"rs.","Total Payment"+totalPayment+"rs.");
    }
}
