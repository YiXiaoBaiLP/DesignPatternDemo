package buzz.yixiaobai.factorypattern01;

/**
 * 黄色人种
 * @author yixiaobai
 * @create 2022/04/18 下午4:22
 */
public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话，一般都是双字节的");
    }
}
