package buzz.yixiaobai.visitorpattern.demo02;

/**
 * 普通员工
 * @author yixiaobai
 * @create 2022/04/29 上午1:13
 */
public class CommonEmployee extends Employee{
    // 工作内容，这非常重要，以后的职业规划就是靠它了
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 我允许访问者访问
     * @param iVisitor
     */
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
