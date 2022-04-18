package buzz.yixiaobai.factorypattern01;

/**
 * 黑色人种
 * @author yixiaobai
 * @create 2022/04/18 下午4:21
 */
public class BlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑人种的肤色颜色都是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话，一般人听不懂...");
    }
}
