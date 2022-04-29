package buzz.yixiaobai.visitorpattern.demo03;

/**
 * 具体访问者
 * @author yixiaobai
 * @create 2022/04/29 下午2:10
 */
public class Visitor implements IVisitor{
    /**
     * 访问element1元素
     * @param element1
     */
    @Override
    public void visit(ConcreteElement1 element1) {
        element1.doSomething();
    }

    /**
     * 访问element2元素
     * @param element2
     */
    @Override
    public void visit(ConcreteElement2 element2) {
        element2.doSomething();
    }
}
