package buzz.yixiaobai.visitorpattern.demo03;

/**
 * 抽象访问者
 * @author yixiaobai
 * @create 2022/04/29 上午3:16
 */
public interface IVisitor {
    // 可以访问哪些对象
    void visit(ConcreteElement1 element1);
    void visit(ConcreteElement2 element2);
}
