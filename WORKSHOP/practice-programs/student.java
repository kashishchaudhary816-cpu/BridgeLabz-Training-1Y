<<<<<<< HEAD
class Student {
	int id;
	int name;
	int age;
	
	void DisplayDetails(){
		String status = "Active";
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("AGE : "+age);
		System.out.println("STATUS : "status);
	}
	public static void main(String args[]){
		Student s1 = new Student();
		s1.id = 12515000562;
		s1.name = Gaurav Chaudhary;
		s1.age = 18;
		s1.DisplayDetails();
	}
}
=======
public class Student {
    static void displayDetails(int id, String name, int age, String status) {  
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        int id = 101;
        String name = "Gaurav";
        int age = 19;
        String status = "Active";

        displayDetails(id, name, age, status);  
    }
}
>>>>>>> 3e4d239d9854361290b00cf46849472d8c3f13d0
