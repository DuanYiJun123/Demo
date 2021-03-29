package recommand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author yijun.dyj
 * @Date 2020/10/22 9:48 AM
 * <p>
 * 视频图片散列
 **/
public class RecommandTest {

    public static void main(String[] args) {
        List<String> videoAndPicList = new ArrayList<>();
        videoAndPicList.add("v_1");
        videoAndPicList.add("v_2");
        videoAndPicList.add("p_1");
        videoAndPicList.add("p_2");
        videoAndPicList.add("p_3");
        videoAndPicList.add("p_4");
        videoAndPicList.add("v_3");
        videoAndPicList.add("v_4");
        videoAndPicList.add("v_5");
        videoAndPicList.add("v_6");
        videoAndPicList.add("v_7");
        videoAndPicList.add("v_8");

        RecommandTest test = new RecommandTest();
        List<String> recommandResult = test.getRecommandResult(videoAndPicList, 3);
        for (String s : recommandResult) {
            System.out.println(s);
        }
    }

    public List<String> getRecommandResult(List<String> videoAndPicList, int maxInterval) {
        if (videoAndPicList == null || videoAndPicList.size() == 0) {
            return null;
        }
        List<String> result = new ArrayList<>();
        Queue<String> video = new LinkedList<>();
        Queue<String> pic = new LinkedList<>();
        int index = 0;
        boolean isPic = false;
        while (!videoAndPicList.isEmpty() && !isPic) {
            if (isVideo(videoAndPicList.get(index))) {
                result.add(videoAndPicList.get(index));
                index++;
            } else {
                isPic = true;
            }
        }

        while (index < videoAndPicList.size()) {
            if (isVideo(videoAndPicList.get(index))) {
                ((LinkedList<String>)video).add(videoAndPicList.get(index));
            } else {
                ((LinkedList<String>)pic).add(videoAndPicList.get(index));
            }
            index++;
        }

        int currentSize = result.size();
        while (!video.isEmpty() && !pic.isEmpty()) {
            if (currentSize >= maxInterval) {
                result.add(pic.poll());
                currentSize = 0;
            } else {
                result.add(video.poll());
                currentSize++;
            }
        }

        while (!video.isEmpty()) {
            result.add(video.poll());
        }

        if (currentSize >= maxInterval && !pic.isEmpty()) {
            result.add(pic.poll());
        }
        return result;
    }

    private boolean isVideo(String x) {
        if (x.contains("v")) {
            return true;
        }
        return false;
    }

}
