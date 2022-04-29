package buzz.yixiaobai.visitorpattern.demo02;

/**
 * 访问者接口
 * @author yixiaobai
 * @create 2022/04/29 上午1:09
 */
public interface IVisitor {

    /**
     * 首先，定义我可以访问普通员工
     */
    void visit(CommonEmployee commonEmployee);

    /**
     * 其次，定义我还可以访问部门经理
     * @param manager
     */
    void visit(Manager manager);
}
