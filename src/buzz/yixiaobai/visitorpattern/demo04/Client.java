package buzz.yixiaobai.visitorpattern.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式-场景类
 * @author yixiaobai
 * @create 2022/04/29 下午6:13
 */
public class Client {
    public static void main(String[] args) {
        IVisitor iVisitor = new Visitor();

        for(Employee emp : mockEmployee()){
            emp.accept(iVisitor);
        }
        System.out.println("本公司的月工资总额为：" + iVisitor.getTotalSalary());
    }

    /**
     * 模拟出公司的人员情况，我们可以想象这个数据是通过持久层传递过来的
     * @return
     */
    private static List<Employee> mockEmployee() {
        List<Employee> empList  = new ArrayList<>();
        // 产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);

        // 产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);

        // 再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上都是负值，但是我会拍马屁鸭！");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);

        return empList;
    }
}
