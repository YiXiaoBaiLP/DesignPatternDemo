package buzz.yixiaobai.iteratorpattern.demo01;

import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式-输出类
 * @author yixiaobai
 * @create 2022/04/30 下午7:15
 */
public class OutputImpl {

    // 学院的集合
    List<College> collegeList;

    /**
     * 初始化学院集合
     * @param collegeList
     */
    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院，燃火调用printDepartment 输出各个学院的系
    public void printCollege(){
        // 从 collegeList 取出所有学院，Java中的List集合已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();

        while(iterator.hasNext()) {
            // 取出一个学院
            College college = iterator.next();
            System.out.println("===" + college.getName() + "===");
            // 得到对应迭代器
            printDepartment(college.createIterator());
        }
    }

    // 输出 学院输出 系
    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
