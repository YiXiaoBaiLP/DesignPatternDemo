package buzz.yixiaobai.flyweightpattern.demo03;

/**
 * 享元模式-场景类
 * @author yixiaobai
 * @create 2022/04/21 下午7:02
 */
public class Client {
    public static void main(String[] args){
        // 初始化对象池
        for(int i = 0; i < 4; i++){
            String subject = "科目" + (i + 1);
            // 初始化地址
            for(int j = 0; j < 30; j++){
                String key = subject + "考试地点" +(j + 1);
                SignInfoFactory.getSiginInfo(key);
            }
        }
        SignInfo signinfo1 = SignInfoFactory.getSiginInfo("科目1考试地点1");
        SignInfo signinfo2 = SignInfoFactory.getSiginInfo("科目2考试地点2");
    }
}
