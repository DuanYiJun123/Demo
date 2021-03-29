package qsort;

/**
 * @Author yijun.dyj
 * @Date 2020/5/7 10:51 AM
 **/
public class Maop {

    public static int[] ssort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {4, 23, 1, 5, 88, 43, 90, 543, 321, 67, 85};

        int[] ssort = ssort(arr);
        for (int i = 0; i < ssort.length; i++) {
            System.out.println(ssort[i]);
        }
    }
}
