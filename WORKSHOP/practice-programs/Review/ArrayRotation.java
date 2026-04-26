import java.util.Arrays;

public class ArrayRotation {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Left Rotation
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Right Rotation
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;

        // Left Rotation
        int[] leftArr = original.clone();
        leftRotate(leftArr, k);
        System.out.println("Left Rotation:  " + Arrays.toString(leftArr));

        // Right Rotation
        int[] rightArr = original.clone();
        rightRotate(rightArr, k);
        System.out.println("Right Rotation: " + Arrays.toString(rightArr));
    }
}
