package buzz.yixiaobai.visitorpattern.demo05;

/**
 * 部门经理
 * @author yixiaobai
 * @create 2022/04/29 下午5:54
 */
public class Manager extends Employee {

    // 这类人很注重自己的业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    /**
     * 允许访问者访问
     * @param iVisitor
     */
    @Override
    void accept(IVisitor iVisitor) {
        iVisitor.visitor(this);
    }
}
