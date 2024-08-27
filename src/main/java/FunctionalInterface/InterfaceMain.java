package FunctionalInterface;

@FunctionalInterface
interface Shapes {

	 int CalculateArea(int length,int width); // In Functional Interface there is only one method which is abstract by default and Default and static methods are there but we can access them by the default and static keyword. 
	 
	 
	 
	 default int Devision(int length,int width) {
		return length/width;
	}
	 
	 default int Addtion(int length,int width) {
			return length+width;
		}
	 
	 default int Subtraction(int length,int width) {
			return length-width;
		}
	 
}

//___----------------------------------------------------Inner Class Demo------------------------------------------------------



class OuterClass{
class InnerClass
{
	public int PerimetreOfRectriangle(int length,int width)
	{
		int perimeter = 2+(length*width);
		return perimeter;
		
	}
}
}




public class InterfaceMain { 
	
public static void main(String args[])
{
	Shapes shape = (int length, int width) -> length*width; // Lambda Expression
			
			int area = shape.CalculateArea(10, 5);
			System.out.println(area);
			
			int add = shape.Addtion(5,6);
			System.out.println(add);
			
			int sub = shape.Subtraction(5,6);
			System.out.println(sub);
				
			int div = shape.Devision(5,6);
			System.out.println(div);
			
	
	Shapes shape1 = new Shapes()
			{

				@Override
				public int CalculateArea(int length, int width) {
					int area = length*width;
					return area;
				}      
		        
			};
			
			System.out.println(shape1.CalculateArea(8,6));
			

			
//-------------------------------------------Inner Class _____-------------------------------------------------		
			
			
			OuterClass outerObject = new OuterClass();
			OuterClass.InnerClass innerObject = outerObject.new InnerClass();
			
			
			System.out.println("Area of a Rectrinagle");
			System.out.println(innerObject.PerimetreOfRectriangle(5, 6));
			
			
}
	
}

