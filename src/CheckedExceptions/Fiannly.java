package CheckedExceptions;

import java.io.FileNotFoundException;

public class Fiannly {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		{
			// this exception we can handel using throws keyword
			System.out.println("program is start step 1");
			
			System.out.println("program is start step 2");
			
			
			
			try 
			{
				Thread.sleep(1000);
			}
			
			finally
			{
				
			}
	        System.out.println("program is start step 3");
			
			System.out.println("program is start step 4");
			
			
			

		}


	}

}
