package StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StudentMain {

	public static void main(String[] args) {
		
		
		
		Address a1 = new Address("Katraj", "Pune", 411046, "Maharashtra");
		List<Address> address = new ArrayList<Address>();
		address.add(a1);

		Student s1 = new Student("Kiran", 56, "7894562423", address);
		List<Student> student = new ArrayList<>();
		student.add(s1);
		
		
		List<String> studentStream = student.stream()
				.flatMap(e-> e.getAddress().stream())
				 .map(Address::getCity)   
				.collect(Collectors.toList());
	    
	    System.out.println(studentStream);
	    
	    
	}
	
}
