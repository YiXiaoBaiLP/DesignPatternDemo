package buzz.yixiaobai.singletonpattern02;

import buzz.yixiaobai.singletonpattern01.Singleton;

/**
 * 单例模式（饿汉式）->静态代码块模式
 * @author yixiaobai
 * @create 2022/04/18 下午9:01
 */
public class Client {
    public static void main(String[] args){
        // 测试
        Singleton singleton01 = Singleton.getSingleton();
        Singleton singleton02 = Singleton.getSingleton();

        System.out.println(singleton01 == singleton02);

        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());

    }
}
