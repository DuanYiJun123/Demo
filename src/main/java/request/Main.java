package request;

/**
 * @Author yijun.dyj
 * @Date 2019/12/1 3:29 PM
 **/
public class Main {

    IRequestProcess firstProcessor;

    private void setUp() {
        ThirdRequestProcessor thirdRequestProcessor = new ThirdRequestProcessor(null);
        SecondRequestProcessor secondRequestProcessor = new SecondRequestProcessor(thirdRequestProcessor);
        FirstRequestProcessor firstRequestProcessor = new FirstRequestProcessor(secondRequestProcessor);
        this.firstProcessor = firstRequestProcessor;
        firstRequestProcessor.start();
        secondRequestProcessor.start();
        thirdRequestProcessor.start();
    }

    public static void main(String[] args) {

        Request request = new Request();
        request.setName("testName");
        request.setValue("testValue");
        Main m = new Main();
        m.setUp();

        m.firstProcessor.process(request);

    }
}
