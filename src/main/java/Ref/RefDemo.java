package Ref;

public class RefDemo {

	public static void main(String[] args) {
		
		System.out.println("Learning Method references..");
		
		//provide a implementation of workInter
		
		
		//static method ko refer kiya
		
		//ClassName::methodName
		WorkInter workInter = Stuff::doStuff;
		
		workInter.doTask();
		
		Runnable runnable = Stuff:: threadTask;
		
		Thread d = new Thread(runnable);
		d.start();
		
		
		//reffering non static method 
		//Object :: methodName
		Stuff ob = new Stuff();
		
		Runnable runnable1 = ob::printNumber;
		
		Thread d1 = new Thread(runnable);
		d1.start();
	}
	
}
