package InterfaceConcept;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println(UsBank.min_bal);
		
		System.out.println(BrazilBank.min_bal);
		
	    HSBCBank.DHFLloan();
		
	
		HSBCBank bank = new HSBCBank();
		
		bank.credit();
		
		bank.debit();
		
		bank.transfer();
		
		bank.Loan();
		
		bank.CarLoan();
		
		bank.insurance();
		
		bank.mutualfunds();
		
		System.out.println("******************");
		
		
		UsBank bk = new HSBCBank();
		
		bk.credit();
		
		bk.debit();
		
		bk.transfer();
		
		System.out.println("******************");
		
		BrazilBank br = new HSBCBank();
		
		br.insurance();
		
		br.mutualfunds();
		
		System.out.println(BrazilBank.min_bal);
		
		
		
	   
		
	 
	  
	  
		
		
		

	}

}
