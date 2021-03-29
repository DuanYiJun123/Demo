package twopointer;

/**
 * @Author yijun.dyj
 * @Date 2020/10/27 9:39 AM
 **/
public class TwoSum {

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 9, 10, 14, 21, 34};
        TwoSum twoSum = new TwoSum();
        int[] solution = twoSum.solution(array, 19);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }

    public int[] solution(int[] array, int target) {

        if (array == null || array.length == 0) {
            return null;
        }
        int[] result = {-1, -1};
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (array[start] + array[end] < target) {
                start++;
            } else if (array[start] + array[end] > target) {
                end--;
            } else {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            }
        }
        return result;
    }
}
