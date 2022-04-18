package buzz.yixiaobai.singletonpattern04;

/**
 * 单例模式（懒汉式）->线程安全，同步方法
 * @author yixiaobai
 * @create 2022/04/18 下午9:41
 */
public class Singleton {
    // 构造器私有化，防止外部new
    private Singleton() {}
    private static Singleton instance;
    // 提供一个公有的静态方法，加入同步处理的代码，解决线程安全问题
    // 即懒汉式
    public static synchronized Singleton getInstance() {
        // 当instance为null的时候去初始化
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
