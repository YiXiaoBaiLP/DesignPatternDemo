package buzz.yixiaobai.adapterpattern01;

/**
 * 适配器-将220V转换成5V
 * @author yixiaobai
 * @create 2022/04/18 下午7:17
 */
public class VoltageAdapter implements IVoltage5V{

    // 被转换的对象
    private IVoltage220V voltage220V;
    // 构造函数，将被转换的对象传入进来
    public VoltageAdapter(IVoltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    /**
     * 具体的转换过程
     * @return 输出5V电流
     */
    @Override
    public int output5v() {
        int src220V = voltage220V.output220V();
        int dst5V = src220V / 44;
        return dst5V;
    }
}
