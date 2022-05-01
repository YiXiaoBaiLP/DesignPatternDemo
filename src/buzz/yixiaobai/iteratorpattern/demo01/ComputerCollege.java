package buzz.yixiaobai.iteratorpattern.demo01;

import java.util.Iterator;

/**
 * 学院的具体实现
 * @author yixiaobai
 * @create 2022/04/30 下午6:10
 */
public class ComputerCollege implements College{

    Department[] departments;
    // 保存当前数组的对象个数
    int numOfDepartment = 0;

    @Override
    public String getName() {
        return "计算机学院";
    }

    /**
     * 初始话系数组数组
     */
    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业", "Java专业");
        addDepartment("PHP专业", "PHP专业");
        addDepartment("大数据专业", "大数据专业");
    }

    /**
     * 添加学院
     * @param name
     * @param desc
     */
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment++] = department;
    }

    /**
     * 返回一个迭代器
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
