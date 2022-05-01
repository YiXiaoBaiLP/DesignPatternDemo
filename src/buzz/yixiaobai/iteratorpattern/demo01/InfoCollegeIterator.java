package buzz.yixiaobai.iteratorpattern.demo01;

import java.util.Iterator;
import java.util.List;

/**
 * @author yixiaobai
 * @create 2022/04/30 下午6:05
 */
public class InfoCollegeIterator implements Iterator {

    //信息工程学院是以List方式存放数据
    List<Department> departmentList;
    // 第几个元素
    int index = -1;

    /**
     * 将元素通过构造函数赋值
     * @param departmentList
     */
    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    /**
     * 判断List中是否有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1){
            return false;
        }else{
            return true;
        }

    }

    /**
     * 获取元素
     * @return
     */
    @Override
    public Object next() {
        index++;
        Department department = departmentList.get(index);
        return department;
    }

    /**
     * 删除方法，默认空实现
     */
    @Override
    public void remove(){

    }
}
