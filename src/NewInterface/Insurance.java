package NewInterface;

public class Insurance extends Medical implements AusMedical,UsMedical{
	
	public void Lifeinsurance(){
		System.out.println("Lifeinsurance");
	}

	
	public void ServiceInsurance()
	{
		System.out.println("ServiceInsurance");
	}
}
