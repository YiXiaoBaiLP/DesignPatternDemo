package buzz.yixiaobai.singletonpattern03;

/**
 * 单例模式（懒汉式）
 * @author yixiaobai
 * @create 2022/04/18 下午9:26
 */
public class Singleton {
    // 构造函数私有化，方式外部new
    private Singleton(){}

    private static Singleton instance;

    // 提供一个共有的静态方法，当使用到该方法时，才去创建instance
    // 及懒汉式（线程不安全）
    public static Singleton getInstance(){
        // 当instance为null的时候初始化
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
