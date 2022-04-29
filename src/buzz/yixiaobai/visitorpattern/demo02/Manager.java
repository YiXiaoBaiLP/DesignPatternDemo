package buzz.yixiaobai.visitorpattern.demo02;

/**
 * @author yixiaobai
 * @create 2022/04/29 上午1:13
 */
public class Manager extends Employee{

    // 这类任人物的职责非常明确：业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    /**
     * 部门经理允许访问者访问
     * @param iVisitor
     */
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
