package buzz.yixiaobai.facadepattern02;

/**
 * 外观模式-门面对象
 * @author yixiaobai
 * @create 2022/04/21 上午10:46
 */
public class Facade {

    // 被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    // 提供个外部访问的方法
    public void methodA(){
        this.a.doSomethingA();
    }

    public void methodB(){
        this.b.doSomethingB();
    }

    public void methodC(){
        this.c.doSomething();
    }
}
