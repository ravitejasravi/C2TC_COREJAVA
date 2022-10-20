class Student{  
	int id;  
	String name;  
}  

public class StudentDetails {

	public static void main(String[] args) {
		
		Student s1=new Student();  
		
		System.out.println(s1.id);  
		System.out.println(s1.name);
		
		s1.id = 12;
		s1.name = "Ravi";
		
		System.out.println(s1.id);  
		System.out.println(s1.name);
		

	}

}
