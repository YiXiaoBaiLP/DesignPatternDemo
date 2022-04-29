package buzz.yixiaobai.visitorpattern.demo05;

/**
 * 具体的访问者
 * @author yixiaobai
 * @create 2022/04/29 下午5:55
 */
public class Visitor implements IVisitor {

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
        return baseInfo + otherInfo;
    }

    /**
     * 组装出普通员工信息
     * @return
     */
    private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        String baseInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return baseInfo + otherInfo;
    }
}
