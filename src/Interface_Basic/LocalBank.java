package Interface_Basic;

public class LocalBank implements HdfcBank,IndianBank,YesBank{

	public static void main(String[] args) {
		
		
		LocalBank bank = new LocalBank();
		
		bank.IMFS();
		
		ApprovalLoan();
		
		bank.Benificiery();
		
		bank.CreditCard();
		
		bank.CreditCard();
		
		bank.NEFT();
		
		bank.Transfer();
		
		bank.LoanSecurity();
		
		System.out.println(HdfcBank.min_bal);
		
		System.out.println(IndianBank.bank_bal);
		
		System.out.println(YesBank.c);
		
	}

	@Override
	public void IMFS() {
		
		String a = "100";
		
		int b = 50;
		
		int var = Integer.parseInt(a);
		
		System.out.println(var+b);
			
	}

	@Override
	public void NEFT() {
		System.out.println("Neft-Method");
		
	}

	@Override
	public void Transfer() {
		System.out.println("Transfer-Method");
		
	}

	@Override
	public void Benificiery() {
		System.out.println("Benificiery-Method");
		
	}
	
	public static void ApprovalLoan(){
		System.out.println("LoanApproval-Method");
	}

	@Override
	public void DebitCard() {
		System.out.println("DebitCard-Method");
		
	}

	@Override
	public void CreditCard() {
		System.out.println("CreditCard-Method");
		
	}

	@Override
	public void LoanSecurity() {
		System.out.println("LoanSecurity-Method");
		
	}

}
