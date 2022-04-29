package buzz.yixiaobai.visitorpattern.demo03;

/**
 * 具体的元素类
 * @author yixiaobai
 * @create 2022/04/29 下午2:05
 */
public class ConcreteElement1 extends Element{

    /**
     * 完善业务处理
     */
    @Override
    public void doSomething() {
        // 业务处理
    }

    /**
     * 允许哪个 访问者访问
     * @param iVisitor
     */
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
