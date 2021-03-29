package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2020/10/27 9:54 AM
 **/
public class ThreeSum {

    public static void main(String[] args) {
        int array[] = {0, -1, 1, 0, 2, -1, 3, -2};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> solution = threeSum.solution(array, 0);
        for (int i = 0; i < solution.size(); i++) {
            System.out.println(solution.get(i).toString());
        }

    }

    public List<List<Integer>> solution(int[] array, int target) {

        if (array == null || array.length == 0) {
            return null;
        }

        Arrays.sort(array);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && (array[i] == array[i - 1])) {
                continue;
            }
            int start = i + 1;
            int end = array.length - 1;
            while (start < end) {
                if (array[i] + array[start] + array[end] < target) {
                    start++;
                } else if (array[i] + array[start] + array[end] > target) {
                    end--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(array[i]);
                    list.add(array[start]);
                    list.add(array[end]);
                    result.add(list);
                    start++;
                    end--;
                }
            }
        }
        return result;
    }

}
