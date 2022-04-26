package buzz.yixiaobai.templatepattern.demo02;

/**
 * 模版方法模式-场景类
 * @author yixiaobai
 * @create 2022/04/26 下午3:59
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        // 调用模版方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
