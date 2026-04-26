import java.util.Scanner;

class ArraySum{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   int n = sc.nextInt();
   
   System.out.println("Enter the number of elements: ");
   int[] arr = new int[n];
   
   System.out.println("Enter array elements: "
   for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
   }
   
   int sum = 0;
   
   for(int i = 0;i<n;i++){
     sum += arr[i];
   }
   
   System.out.println("sum: "+sum);
 }
}

