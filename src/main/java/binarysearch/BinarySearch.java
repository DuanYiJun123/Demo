package binarysearch;

/**
 * @Author yijun.dyj
 * @Date 2020/10/26 9:42 AM
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 4, 23, 45, 55, 76, 99, 102};
        BinarySearch binarySearch = new BinarySearch();
        int i = binarySearch.binarySearchBasic(array, 99);
        System.out.println(i);
    }

    public int binarySearchBasic(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (array[end] == target) {
            return end;
        }
        if (array[start] == target) {
            return start;
        }
        return -1;
    }
}
