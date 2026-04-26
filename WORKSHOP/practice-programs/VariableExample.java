class VariableExample{
int id =26;

String name="Gaurav";

int rollNo;

static int age = 18;

void display() {
String status="active";
System.out.println("status"+status);
}

public static void main(String args[])
{
	
	VariableExample var = new VariableExample();
	System.out.println(name + age );
	var.display();
	
	var.rollNo = 515000562;
}
}