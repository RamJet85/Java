package InterfaceConcept;

public class HSBCBank implements UsBank,BrazilBank{

	@Override
	public void credit() {
		
		System.out.println("Hsbc-credit");
	}

	@Override
	public void debit() {
		
		System.out.println("Hsbc-debit");
	}

	@Override
	public void transfer() {
		
		System.out.println("Hsbc-transfer");
	}
	
	public void Loan()
	{
		System.out.println("Hsbc-loan");
		
	}
	
	public void CarLoan()
	{
		System.out.println("Hsbc-Carloan");
		
	}

	@Override
	public void insurance() {
		
		System.out.println("Hsbc-insurance");
	}

	@Override
	public void mutualfunds() {

		System.out.println("Hsbc-mutualfunds");
		
	}
	
	public static void DHFLloan()
	{
		System.out.println("Hsbc-DHFLloan");
	}
	

}
