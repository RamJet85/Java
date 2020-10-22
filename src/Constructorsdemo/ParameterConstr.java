package Constructorsdemo;

public class ParameterConstr {
	
	int no;
	
	String name;
	
	String city;
	
	char Male;
	
	ParameterConstr(int i, String n){
		
		no=i;
		name = n;
		System.out.println("1 st value is ");
		System.out.println("Name: "+name +" No: "+no);
		}
	
	ParameterConstr(String b ) {
		
		city =b;
		System.out.println("2 rd value is ");
		System.out.println(city);
	}
	
    ParameterConstr(int i, String n,String c,char r){
		
		no=i;
		name = n;
		city =c;
		Male =r;
		System.out.println("3 rd value is ");
		System.out.println("Name:--> "+name +" No:--> " +no+"City:-->"+ city +"Gender:-->"+Male);
		}
	
	

	public static void main(String[] args) {

		//ParameterConstr ctr = new ParameterConstr(15, "Ram");
		
		//ParameterConstr ctr1 = new ParameterConstr("Hyd");
		
		ParameterConstr ctr= new ParameterConstr(101, "Ram", "HYD", 'M');
		
		ParameterConstr ctr1 = new ParameterConstr("Hyd");
		
		ParameterConstr ctr2 = new ParameterConstr(585, "Ravi");
		
		
		
	
		
		
		
		
		
		
		
		 
    		
		
	}

}
