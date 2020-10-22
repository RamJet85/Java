package MethodOverriding;

public class Parent extends GrandFather{
	
	public void active()
	{
		System.out.println("Parent is available");
	}

	
	public void Inactive()
	{
		System.out.println("Parent is not available");
	}
	
	public void greyout()
	{
		System.out.println("Parent is greyout state");
	}
	
	
}
