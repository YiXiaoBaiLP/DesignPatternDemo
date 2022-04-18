package buzz.yixiaobai.abstractfactorypattern01;

/**
 * 抽象工程模式-客户端
 * @author yixiaobai
 * @create 2022/04/18 下午6:44
 */
public class Client {
    public static void main(String[] args){
        // 定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        // 生产A1产品
        AbstractProductA a1 = creator1.abstractProductA();
        a1.doSomething();

        // 生产A2产品
        AbstractProductA a2 = creator2.abstractProductA();
        a2.doSomething();

        // 生产B1产品
        AbstractProductB b1 = creator1.abstractProductB();
        b1.doSomething();

        // 生产B2产品
        AbstractProductB b2 = creator2.abstractProductB();
        b2.doSomething();
        /** 业务处理 */
    }
}
