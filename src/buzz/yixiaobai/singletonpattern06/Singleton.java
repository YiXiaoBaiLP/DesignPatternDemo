package buzz.yixiaobai.singletonpattern06;

/**
 * 单例模式-（双重检查）
 * @author yixiaobai
 * @create 2022/04/19 上午12:40
 */
public class Singleton {
    // 构造器私有化，防止外部new
    private Singleton(){}
    // volatile：防止指令重排和实现可见性
    private static volatile Singleton instance;
    // 提供一个公有的静态方法，加入双重检查代码，解决线程安全问题，同时解决懒加载的问题
    // 双重检查同时保证了效率，推荐使用
    public static Singleton getInstance(){
        // 当instance为null的时候执行初始化
        if(null == instance){
            // 加入同步代码块，解决线程安全问题
            synchronized (Singleton.class){
                if(null == instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}