package buzz.yixiaobai.bridgepattern01;

/**
 * 桥接模式-接口
 * @author yixiaobai
 * @create 2022/04/18 下午2:33
 */
public interface Brand {
    // 开机
    void open();
    // 关机
    void close();
    // 打电话
    void call();

}
