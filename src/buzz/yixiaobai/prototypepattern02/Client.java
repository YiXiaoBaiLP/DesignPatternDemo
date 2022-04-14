package buzz.yixiaobai.prototypepattern02;

/**
 * @author yixiaobai
 * @create 2022/04/14 下午4:34
 */
public class Client {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 克隆了一个对象
        Thing cloneThing = thing.clone();
    }
}
