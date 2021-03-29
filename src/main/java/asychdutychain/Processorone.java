//package asychdutychain;
//
//import java.util.List;
//import java.util.concurrent.BlockingDeque;
//import java.util.concurrent.LinkedBlockingDeque;
//
//public class Processorone implements Handler,Runnable {
//    private String str;
//
//    private boolean flg=true;
//
//    BlockingDeque<String> list=new LinkedBlockingDeque<>();
//
//    private Handler next;
//
//    public Processorone(String str) {
//        this.str = str;
//    }
//
//    @Override
//    public void handle(String name) {
//        if(!list.isEmpty()){
//            list.poll();
//        }
//        System.out.println(list.poll() + "processorone");
//    }
//
//    @Override
//    public void run() {
//        while(flg){
//            list.add(str);
//        }
//
//    }
//}
