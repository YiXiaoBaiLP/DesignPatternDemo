package buzz.yixiaobai.visitorpattern.demo04;

/**
 * 抽象访问者
 * @author yixiaobai
 * @create 2022/04/29 下午5:50
 */
public interface IVisitor {
    /**
     * 首先定义我可以访问普通员工
     */
    void visitor(CommonEmployee commonEmployee);

    /**
     * 我还可以访问部门经理
     * @param manager
     */
    void visitor(Manager manager);

    /**
     * 统计所有员工工资总和
     * @return
     */
    int getTotalSalary();
}
