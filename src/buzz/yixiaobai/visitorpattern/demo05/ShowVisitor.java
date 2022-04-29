package buzz.yixiaobai.visitorpattern.demo05;

/**
 * 具体展示类
 * @author yixiaobai
 * @create 2022/04/30 上午12:39
 */
public class ShowVisitor implements IShowVisitor{
    // 报表内容
    private String info = "";

    /**
     * 打印出报表
     */
    @Override
    public void report() {
        System.out.println(this.info);
    }

    /**
     * 访问普通员工，组装信息
     * @param commonEmployee
     */
    @Override
    public void visitor(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee)
                + "工作：" + commonEmployee.getJob() + "\t\n";
    }

    /**
     * 访问经理，然后组装信息
     * @param manager
     */
    @Override
    public void visitor(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + "业绩："
                + manager.getPerformance() + "\t\n";
    }

    /**
     * 组装出基本信息
     * @return
     */
    private String getBasicInfo(Employee employee){
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：");
        sb.append(employee.getName());
        sb.append("\t");
        sb.append("性别：");
        sb.append(employee.getSex() == Employee.FEMALE ? "女" : "男");
        sb.append("\t");
        sb.append("薪水");
        sb.append(employee.getSalary());
        sb.append("\t");
        return sb.toString();
    }
}
