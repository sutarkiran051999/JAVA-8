package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String args[])
	{
		 // This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random(); 
  
        // Print the random value using get() 
        System.out.println(randomValue.get()); 
	}
	
}
