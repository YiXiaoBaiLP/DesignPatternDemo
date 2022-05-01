package buzz.yixiaobai.iteratorpattern.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合的具体实现
 * @author yixiaobai
 * @create 2022/04/30 下午6:21
 */
public class InfoCollege implements College {

    List<Department> departmentList;

    /**
     * 初始化List集合
     */
    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全专业", "信息安全专业");
        addDepartment("网络安全专业", "网络安全专业");
        addDepartment("服务器安全专业", "服务器安全专业");
    }

    /**
     * 设置名称
     * @return
     */
    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
    }

    /**
     * 返回一个迭代器，如何遍历此元素
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
