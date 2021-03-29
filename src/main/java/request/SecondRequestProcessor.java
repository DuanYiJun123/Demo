package request;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author yijun.dyj
 * @Date 2019/12/1 3:21 PM
 **/
public class SecondRequestProcessor extends Thread implements IRequestProcess {
    private LinkedBlockingQueue<Request> list = new LinkedBlockingQueue();

    private IRequestProcess nextprocess;

    private boolean isFinish = true;

    public SecondRequestProcessor(IRequestProcess nextprocess) {
        this.nextprocess = nextprocess;
    }

    @Override
    public void run() {
        while (isFinish) {
            try {
                Request take = list.take();
                System.out.println("SecondRequestProcessor process:" + take.toString());
                nextprocess.process(take);
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
