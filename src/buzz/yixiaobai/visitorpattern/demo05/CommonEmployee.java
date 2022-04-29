package buzz.yixiaobai.visitorpattern.demo05;

/**
 * 普通员工
 * @author yixiaobai
 * @create 2022/04/29 下午5:55
 */
public class CommonEmployee extends Employee {

    // 对于这类人来说，任务是很重要的
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
