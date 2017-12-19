import java.util.Scanner;
public class ScannerTest{
 public static void main(String arg[])
{
	Scanner salary=new Scanner(System.in);
	
	

	System.out.println("Enter salary");
	double=salary.nextFloat();

        
	float epf=(s/100*8);
	double etf=(s/100*3);

	

	
	System.out.println("Salary after ETF and EPF is " + (s-(epf+etf)));
	System.out.println("EPF IS "+epf);
	System.out.println("ETF IS "+etf);


}
}