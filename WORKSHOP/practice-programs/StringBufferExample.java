class StringBufferExample {
public static void main(String[] args) {

StringBuffer sb = new StringBuffer("Hello");

string sb.append(" World");
System.out.println("append: " + sb);

sb.insert(5, ",");
System.out.println("insert: " + sb);

sb.replace(6, 11, "Java");
System.out.println("replace: " + sb);

sb.delete(5, 6);
System.out.println("delete: " + sb);

sb.reverse();
System.out.println("reverse: " + sb);

System.out.println("length: " + sb.length());

System.out.println("charAt(2): " + sb.charAt(2));

sb.setCharAt(2, 'X');
System.out.println("setCharAt: " + sb);

System.out.println("substring: " + sb.substring(1, 4));
}
}

Post by Kajal Wankhede
Kajal Wankhede
Created 6 Feb6 Feb
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int k = 1;
        for (int i = 1 ; i < nums.length ; i++){
            if (nums [i] != nums [i-1]){
                nums [k] = nums [i];
                k++;
            }
        }
        return k;
   
}
}