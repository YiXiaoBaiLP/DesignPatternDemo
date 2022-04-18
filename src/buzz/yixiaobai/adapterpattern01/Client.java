package buzz.yixiaobai.adapterpattern01;

/**
 * 适配器模式-客户端
 * @author yixiaobai
 * @create 2022/04/18 下午7:11
 */
public class Client {
    public static void main(String[] args){
        // 创建一个适配器，传入一个需要转换的类
        // 返回我们需要的结果
        IVoltage5V voltage5V = new VoltageAdapter(new IVoltage220V());
        Phone phone = new Phone();
        phone.charging(voltage5V);
    }
}
