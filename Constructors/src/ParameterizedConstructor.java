class Student4 { 
	
    int id;  
    String name;
    
    Student4(){
    	System.out.println("Default will be executed");
    }
      
    Student4(int i,String n) {
    	
    id = i;  
    name = n;  
    
    }
    
    void display(){
    	
    	System.out.println(id+" "+name);
    	
    }  

}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Student4 s1 = new Student4(12,"Ravi");  
	    Student4 s2 = new Student4(13,"Teja");
	    Student4 s3 = new Student4(); 
	     
	    s1.display();  
	    s2.display();
	    s3.display();
	}

}
