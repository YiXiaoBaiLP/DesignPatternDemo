package buzz.yixiaobai.singletonpattern01;

/**
 * 单例模式（饿汉式）-客户端
 * @author yixiaobai
 * @create 2022/04/18 下午8:50
 */
public class Client {
    public static void main(String[] args) {
        // 测试
        Singleton singleton01 = Singleton.getSingleton();
        Singleton singleton02 = Singleton.getSingleton();
        // 创建类的实例相同吗？
        System.out.println(singleton01 == singleton02);
        // 查看两个类的HashCode
        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());
    }
}
