package buzz.yixiaobai.singletonpattern01;

import java.security.Signature;

/**
 * 单例模式（饿汉式）静态方法
 * @author yixiaobai
 * @create 2022/04/18 下午8:46
 */
public class Singleton {

    // 1、构造器私有化，防止外部new
    private Singleton(){}
    // 2、本类内部创建对象实例
    private final static Singleton singleton = new Singleton();
    // 3、提供一个公有的静态方法，返回实例对象
    public static Singleton getSingleton(){
        return singleton;
    }
}
