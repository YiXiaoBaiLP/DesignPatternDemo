package buzz.yixiaobai.visitorpattern.demo05;

/**
 * 汇总表接口
 * @author yixiaobai
 * @create 2022/04/30 上午12:36
 */
public interface ITotalVisitor extends IVisitor{

    // 统计所有员工工资总和
    void totalSalary();
}
