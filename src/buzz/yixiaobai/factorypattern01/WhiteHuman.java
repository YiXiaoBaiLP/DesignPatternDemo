package buzz.yixiaobai.factorypattern01;

/**
 * 白色人种
 * @author yixiaobai
 * @create 2022/04/18 下午4:24
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种的肤色是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节");
    }
}
