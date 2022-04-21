package buzz.yixiaobai.flyweightpattern.demo05;

/**
 * 享元模式-多线程场景
 * @author yixiaobai
 * @create 2022/04/21 下午7:56
 */
public class MultiThread extends Thread{

    private SignInfo signInfo;

    public MultiThread(SignInfo signInfo){
        this.signInfo = signInfo;
    }

    public void run(){
        if(!signInfo.getId().equals(signInfo.getLocation())){
            System.out.println("编号：" + signInfo.getId());
            System.out.println("考试地址：" + signInfo.getLocation());
            System.out.println("线程不安全了");
        }
    }
}
