package buzz.yixiaobai.singletonpattern08;

/**
 * @author yixiaobai
 * @create 2022/04/19 下午4:22
 */
public class Singleton {
    // 私有化构造函数，防止外部new
    private Singleton(){}

    /* 枚举类的源码
    public abstract class Enum<E extends Enum<E>>
        implements Comparable<E>, Serializable
        可以看到，枚举也提供了序列化机制。某些情况，比如我们要通过网络传输一个数据库连接的句柄，会提供很多帮助。
     */
    /*
        首先，在枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，同时每个枚举实例都是static final类型的，
     也就表明只能被实例化一次。在调用构造方法时，我们的单例被实例化。
    也就是说，因为enum中的实例被保证只会被实例化一次，所以我们的INSTANCE也被保证实例化一次。
     */
    public enum SingletonEnum {
        INSTANCE;

        private Singleton singleton;

        SingletonEnum(){
            singleton = new Singleton();
        }

        public  Singleton getInstance(){
            return singleton;
        }
    }

    public void doSomething(){
        System.out.println("我被输出了。。。");
    }
}
