class ConstructorDemo{
int id;
string name;
int age;

public ConstructorDemo(){
  System.out.println("Contructor Program");
  }
Public ConstructorDemo(int id, String name,int age){
  this.id=id;
  this.name= name;
  this.age=age;
}
 void Display(){
	System.out.println("ID:" +id);
	System.out.println("Name" +name);
	System.out.println("Age" +age);
 }
 
 public static void main(String args[]){
    ConstructorDemo cd= new ConstructorDemo(1,"Gaurav",26);
	System.out.println(cd); 
	cd.display();
}

}