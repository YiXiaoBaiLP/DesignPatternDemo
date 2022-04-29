package buzz.yixiaobai.visitorpattern.demo03;

/**
 * 具体元素
 * @author yixiaobai
 * @create 2022/04/29 下午2:07
 */
public class ConcreteElement2 extends Element{

    /**
     * 完善业务逻辑
     */
    @Override
    public void doSomething() {
        // 业务处理
    }

    /**
     * 允许哪个访问者可以访问
     * @param iVisitor
     */
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
