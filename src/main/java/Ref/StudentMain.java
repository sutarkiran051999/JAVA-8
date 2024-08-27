package Ref;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("Studying Constructor reference");

//		Provider provider =()->{
//			return new Student();
//		};
        
//		constructor reference 
//		ClassName :: new
		Provider provider = Student :: new;
		Student student = provider.getStudent();
		
		student.display();
	}

}
