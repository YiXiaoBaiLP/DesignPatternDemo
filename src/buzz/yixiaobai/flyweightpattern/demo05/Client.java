package buzz.yixiaobai.flyweightpattern.demo05;


/**
 * 享元模式-多线程场景（客户端）
 * @author yixiaobai
 * @create 2022/04/21 下午7:58
 */
public class Client {
    public static void main(String[] args){
        // 对象池中初始化4个对象
        SignInfoFactory.getSiginInfo("科目1");
        SignInfoFactory.getSiginInfo("科目2");
        SignInfoFactory.getSiginInfo("科目3");
        SignInfoFactory.getSiginInfo("科目4");

        // 取得对象
        SignInfo signInfo = SignInfoFactory.getSiginInfo("科目1");
        while(true){
            signInfo.setId("ZhangSan");
            signInfo.setLocation("ZhangSan");
            new MultiThread(signInfo).start();
            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            new MultiThread(signInfo).start();
        }
    }
}
