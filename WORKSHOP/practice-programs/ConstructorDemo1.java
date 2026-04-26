public class ConstructorDemo{
   int id;
   String name;
   int age;

public ConstructorDemo(){
 System.out.println("Default Constructor");
 }
 public ConstructorDemo(int id.String name,int age){
        this.id = id;
		this.name = name;
		this.age = age;
 }
 void display(){
      System.out.println("id: "+id);
      System.out.println("Name: "+name);
	  System.out.println("Age: "+age);
 }
 public static void main(String[] args){
   ConstructorDemo cd = new ConstructorDemo();
   ConstructorDemo cdd =  new Constructor(1,"gaurav",18);
   cdd.display();
 }
}