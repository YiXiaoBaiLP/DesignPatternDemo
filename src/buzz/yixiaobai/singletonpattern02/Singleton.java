package buzz.yixiaobai.singletonpattern02;

/**
 * 单例模式（饿汉式）->静态代码块
 * @author yixiaobai
 * @create 2022/04/18 下午8:56
 */
public class Singleton {
    // 构造私有化，防止外部new
    private Singleton(){}

    // 将初始化逻辑放入静态代码块中
    static{
        instance = new Singleton();
    }
    // 创建静态私有变量 instance
    private static final Singleton instance;

    /**
     * 提供一个共有的静态方法，返回实例对象
     * @return
     */
    public static Singleton getSingleton(){
        return instance;
    }
}
