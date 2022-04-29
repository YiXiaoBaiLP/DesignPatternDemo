package buzz.yixiaobai.visitorpattern.demo05;

/**
 * 具体汇总表
 * @author yixiaobai
 * @create 2022/04/30 上午12:53
 */
public class TotalVisitor implements ITotalVisitor{
    // 部门经理的工资系数是5
    private final static int MANAGER_COEFEICIENT = 5;
    // 普通员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFEICIENT = 2;
    // 普通员工的工资总和
    private int commonTotalSalary = 0;
    // 部门经理的工资总和
    private int managerTotalSalary = 0;

    /**
     * 工资总和
     */
    @Override
    public void totalSalary() {
        System.out.println("本公司的月工资总额是：" + (this.commonTotalSalary + this.managerTotalSalary));
    }

    /**
     * 访问普通员工，计算工资总额
     * @param commonEmployee
     */
    @Override
    public void visitor(CommonEmployee commonEmployee) {
        this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary() * COMMONEMPLOYEE_COEFEICIENT;
    }

    /**
     * 访问部门经理，计算工资总和
     * @param manager
     */
    @Override
    public void visitor(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary() * MANAGER_COEFEICIENT;
    }
}
