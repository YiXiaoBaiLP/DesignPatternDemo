package buzz.yixiaobai.singletonpattern06;

/**
 * 单例模式（双重检查）
 * @author yixiaobai
 * @create 2022/04/19 上午12:48
 */
public class Client {
    public static void main(String[] args){
        System.out.println("双重检查");
        //测试
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // 创建的类实例相同
        System.out.println(s1 == s2);
        // 两个类的hashCode值相同
        System.out.println("s1.hashCode()" + s1.hashCode());
        System.out.println("s2.hashCode()" + s2.hashCode());
    }
}
