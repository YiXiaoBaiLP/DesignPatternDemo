package buzz.yixiaobai.prototypepattern01;

/**
 * @author yixiaobai
 * @create 2022/04/14 下午3:35
 */
public class PrototypeClass implements Cloneable{
    // 覆盖Obejct类的clone方法
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            // 当类找不到的时候触发异常
            e.printStackTrace();
        }

        return prototypeClass;
    }
}
