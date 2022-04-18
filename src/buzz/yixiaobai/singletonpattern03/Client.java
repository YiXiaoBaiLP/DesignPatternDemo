package buzz.yixiaobai.singletonpattern03;

/**
 * 单例模式（懒汉式）->客户端
 * @author yixiaobai
 * @create 2022/04/18 下午9:30
 */
public class Client {
    public static void main(String[] args){
        System.out.println("懒汉式：线程不安全");
        // 测试
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();

        System.out.println(singleton01 == singleton02);
        // 两个类的hashCode值相同
        System.out.println("s1.hashCode()：" + singleton01.hashCode());
        System.out.println("s2.hashCode()：" + singleton02.hashCode());
    }
}
