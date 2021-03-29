package testc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author yijun.dyj
 * @Date 2020/1/13 7:55 PM
 **/

public class ThreadPool {
    /**
     * 核心线程数
     */
    private static final int CORE_SIZE = 2;

    /**
     * 最大线程数
     */
    private static final int MAX_SIZE = 50;

    /**
     * 空闲线程保持时间，空闲时间大于此时间线程被回收
     */
    private static Long KEEP_ALIVE_TIME_SECOND = 2L;

    /**
     * 线程队列长度
     */
    private static int QUEUE_SIZE = 100000;

    /**
     * 线程执行器
     */
    private static ExecutorService executorService;

    static {
        // 创建自定义线程池，阻塞队列长度与核心线程数相同，队列满了之后线程池抛拒绝接收新任务异常
        executorService = new ThreadPoolExecutor(CORE_SIZE, MAX_SIZE, KEEP_ALIVE_TIME_SECOND,
            TimeUnit.SECONDS, new LinkedBlockingQueue<>(QUEUE_SIZE), new ThreadPoolExecutor
            .AbortPolicy());
    }

    /**
     * 提交任务并执行
     *
     * @param task 执行任务
     * @return 是否提交成功
     */
    public static boolean run(Runnable task) {
        try {
            executorService.submit(task);
            return true;
        } catch (Exception e) {
            System.out.println("任务提交到线程池失败" + e);
            return false;
        }
    }

    public static ExecutorService get() {
        return executorService;
    }

}
