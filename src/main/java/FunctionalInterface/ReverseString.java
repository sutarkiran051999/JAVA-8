package FunctionalInterface;

public class ReverseString {

	public static void main(String[] args) {
		
		ReverseStringInterface reverse = new ReverseStringInterface() {

			@Override
			public String reverseString(String name) {
			
				String bag="";
				for(int i=name.length()-1;i>=0;i--)
				{
					bag+=name.charAt(i);
				}
				System.out.println(bag);
				return bag;
				
			}
			
		};
		
		reverse.reverseString("NITTIN");
		
	}

}
