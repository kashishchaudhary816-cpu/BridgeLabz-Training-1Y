import java.util.Scanner;

class switchExample{
public static void main(String args[]){
    Scanner ab = new Scanner(System.in);
	int day = ab.nextInt();
	
	switch(subject){
	  case 1:
	   System.out.println("math");
	   break;
	  case 2:
	   System.out.println("english");
	   break;
	  case 3:
	   System.out.println("physics");
	   break;
	  default:
	   System.out.println("Invalid Subject");
	}
  }
}