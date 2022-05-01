package buzz.yixiaobai.iteratorpattern.demo01;

import java.util.Iterator;

/**
 * @author yixiaobai
 * @create 2022/04/30 下午6:00
 */
public class ComputerCollegeIterator implements Iterator {

    // 这里我们需要知道 Department 是以怎样的方式存放 => 数组的方式存放数据
    Department[] departments;
    // 遍历的位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        } else {
            return true;
        }
    }

    /**
     * 获取下一个元素
     * @return
     */
    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    /**
     * 删除方法，默认空实现
     */
    @Override
    public void remove(){

    }
}
