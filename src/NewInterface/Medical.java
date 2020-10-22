package NewInterface;

public class Medical implements AusMedical,IndiaMedical,UsMedical {

	public static void main(String[] args) {
		
		Medical md = new Medical();
		
		md.Diagnostics();
		md.Psychologist();
		md.HeartServices();
		md.Hairtransplant();
		md.MedicalBills();
		md.nuero();
		md.Surgen();
		Bodypains();
		
		IndiaMedical cal = new Insurance();
		
		cal.Hairtransplant();
		cal.MedicalBills();
		System.out.println(name);
		
		
			
	 System.out.println("The mediacal bill is "+ medical_bill);
	 
	 System.out.println(name);
	 
	 AusMedical aus = new Medical();
	 
	 aus.Diagnostics();
	
		
	}

	@Override
	public void Diagnostics() {
		
		System.out.println("The diagnostics method");
		
	}

	@Override
	public void Psychologist() {
		System.out.println("The Psychologist method");
		
	}

	@Override
	public void HeartServices() {
		System.out.println("The HeartServices method");
		
	}

	@Override
	public void Hairtransplant() {
		System.out.println("The Hairtransplant method");		
	}

	@Override
	public void MedicalBills() {
		System.out.println("The MedicalBills method");		
	}

	@Override
	public void nuero() {
		System.out.println("The nuero method");		
	}

	@Override
	public void Surgen() {
		System.out.println("The Surgen method");		
	}
	
	public static void Bodypains(){
		
		System.out.println("Body-Pains");
	}
}