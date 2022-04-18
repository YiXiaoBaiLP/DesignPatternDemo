package buzz.yixiaobai.singletonpattern07;

/**
 * 单例模式（静态内部类）-> 推荐使用
 * @author yixiaobai
 * @create 2022/04/19 上午12:52
 */
public class Singleton {
    // 构造器私有化，防止外部new
    private Singleton() {}
    private static Singleton instance;
    // 写一个静态内部类，该类中有一个静态属性Singleton
    // 通过静态内部类，来实例化Singleton
    public static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    // 调用内部类中的实例
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
