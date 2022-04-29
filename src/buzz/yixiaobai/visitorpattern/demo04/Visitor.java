package buzz.yixiaobai.visitorpattern.demo04;

/**
 * 具体的访问者
 * @author yixiaobai
 * @create 2022/04/29 下午5:55
 */
public class Visitor implements IVisitor{

    // 经理的工资的系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    // 员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    // 普通员工工资的总和
    private int commonEmployeeSalary = 0;
    // 部门经理的员工工资总和
    private int managerSalary = 0;

    /**
     * 计算部门经理的工资总和
     * @param salary
     */
    private void calManagerSalary(int salary){
        managerSalary = this.managerSalary + salary * this.MANAGER_COEFFICIENT;
    }

    /**
     * 计算普通员工的工资总和
     * @param salary
     */
    private void calCommonSalary(int salary) {
        commonEmployeeSalary = this.commonEmployeeSalary + salary * this.COMMONEMPLOYEE_COEFFICIENT;
    }

    /**
     * 组合普通员工，打印报表
     * @param commonEmployee
     */
    @Override
    public void visitor(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployeeInfo(commonEmployee));

    }

    /**
     * 组装部门经理信息
     * @param manager
     */
    @Override
    public void visitor(Manager manager){
        System.out.println(this.getManagerInfo(manager));
    }

    /**
     * 组装普通员工信息
     * @return
     */
    @Override
    public int getTotalSalary(){
        return this.commonEmployeeSalary + this.managerSalary;
    }

    /**
     * 组装出基本信息
     * @return
     */
    private String getBasicInfo(Employee employee){
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    /**
     * 组装部门经理的信息
     * @param manager
     * @return
     */
    private String getManagerInfo(Manager manager){
        String baseInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        calManagerSalary(manager.getSalary());
        return baseInfo + otherInfo;
    }

    /**
     * 组装出普通员工信息
     * @return
     */
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        String baseInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        calCommonSalary(commonEmployee.getSalary());
        return baseInfo + otherInfo;
    }
}
