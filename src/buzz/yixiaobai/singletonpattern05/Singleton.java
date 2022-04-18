package buzz.yixiaobai.singletonpattern05;

/**
 * 单例模式（懒汉式）
 * @author yixiaobai
 * @create 2022/04/18 下午10:08
 */
public class Singleton {
    // 私有化构造方法，防止外部new
    private Singleton(){}

    private static Singleton instance;

    // 提供一个共有的静态方法
    // 即懒汉式
    public static Singleton getInstance(){
        // 当instance为null时初始化
        if(instance == null){
            // 加入同步处理的代码块，不能解决线程安全的问题
            // 还会引发多实例的问题
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
