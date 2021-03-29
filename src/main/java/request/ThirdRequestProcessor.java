package request;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author yijun.dyj
 * @Date 2019/12/1 3:21 PM
 **/
public class ThirdRequestProcessor extends Thread implements IRequestProcess {
    private LinkedBlockingQueue<Request> list = new LinkedBlockingQueue();

    private IRequestProcess nextprocess;

    private boolean isFinish = true;

    public ThirdRequestProcessor(IRequestProcess nextprocess) {
        this.nextprocess = nextprocess;
    }

    @Override
    public void run() {
        while (isFinish) {
            try {
                Request take = list.take();
                System.out.println("ThirdRequestProcessor process:" + take.toString());
                if (nextprocess != null) {
                    nextprocess.process(take);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void process(Request request) {
        list.add(request);
    }
}
