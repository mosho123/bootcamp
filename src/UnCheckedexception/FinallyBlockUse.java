package UnCheckedexception;

public class FinallyBlockUse {

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		
		try 
		{
		System.out.println(a/b);
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("we can write multiple catch block also ");
		}

		
		
		finally
		{
			System.out.println("finally block will execute alway");
		}
		
		  

	}

	}


