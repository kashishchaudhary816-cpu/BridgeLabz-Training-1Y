import java.util.Scanner;

class MethodExample{
static int Add(int a, int b){
System.out.println("Sum: " +(a+b));
return a+b;
} 
int Substraction(int a, int b){
System.out.println("Substraction: "+(a-b));
return a-b;
}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

Add(a,b);
Substraction(a,b);
 }
}