package AbstarctionConcept;

public class RuralBank implements WorldBank,Nationalbank{
	
	int min_bal =1000;

	public static void main(String[] args) {
		
		RuralBank bank = new RuralBank();
		
		bank.Credit();
		
		bank.Debit();
		
		bank.Amount();
		
		bank.Netcash();
		
		bank.Withdrawal();
		
		bank.Trasfer();
		
		RuralBank.Goldloan(); //static method
		
		bank.Homeloan();
		
		System.out.println(WorldBank.min_bal);
		
		System.out.println(Nationalbank.min_bal);
		
		System.out.println("******************");
		
		Nationalbank nb = new RuralBank();
		
		nb.Netcash();
		
		nb.Withdrawal();
		
		nb.Trasfer();
		
		WorldBank wb = new RuralBank();
		
		wb.Amount();
		
		wb.Credit();
		
		wb.Debit();
		
			
	}
	
    //National bank interface
	@Override
	public void Netcash() {
		System.out.println("Ruralbank--Netcash");
		
	}

	@Override
	public void Withdrawal() {
		System.out.println("Ruralbank--Withdrawal");
		
	}

	@Override
	public void Trasfer() {
		System.out.println("Ruralbank--Transfer");
		
	}

	//World bank Interface
	
	@Override
	public void Credit() {
		System.out.println("Ruralbank--Credit");
		
	}

	@Override
	public void Debit() {
		System.out.println("Ruralbank--Debit");
		
	}

	@Override
	public void Amount() {
		System.out.println("Ruralbank--Amount");
		
	}
	
	//RuralBank class methods
	
	public static void Goldloan()
	{
		System.out.println("Ruralbank--Goldloan");
	}

	public void Homeloan()
	{
		System.out.println("Ruralbank--Homeloan");
	}
	

	

}
