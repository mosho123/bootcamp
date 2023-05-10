package CheckedExceptions;

public class Checked {

	public static void main(String[] args) 
	
	{
		System.out.println("program is start step 1");
		
		System.out.println("program is start step 2");
		
		
		
		try 
		{
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
        System.out.println("program is start step 3");
		
		System.out.println("program is start step 4");
		
		
		

	}

}
