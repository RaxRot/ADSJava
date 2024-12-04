package Search;

public class SearchAlgorithms {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int fastLinearSearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] == key) {
                return left;
            }
            if (arr[right] == key) {
                return right;
            }
            left++;
            right--;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middlePosition = (left + right) / 2;
            int middleNumber= arr[middlePosition];
            if (middleNumber == key) {
                return middlePosition;
            }
            if (key < middleNumber) {
                right = middlePosition - 1;
            }else{
                left = middlePosition + 1;
            }
        }
        return -1;
    }
}
