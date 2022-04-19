package buzz.yixiaobai.singletonpattern08;

/**
 * 单例模式（枚举）
 * @author yixiaobai
 * @create 2022/04/19 下午4:36
 */
public class Client {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.SingletonEnum.INSTANCE.getInstance();
        Singleton singleton2 = Singleton.SingletonEnum.INSTANCE.getInstance();

        singleton1.doSomething();
        singleton2.doSomething();
        System.out.println((singleton1 == singleton2) +"\n"+ singleton1.hashCode()+ "\n" + singleton2.hashCode());

    }
}
