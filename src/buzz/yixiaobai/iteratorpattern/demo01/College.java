package buzz.yixiaobai.iteratorpattern.demo01;

import java.util.Iterator;

/**
 * 学院接口
 * @author yixiaobai
 * @create 2022/04/30 下午6:09
 */
public interface College {

    String getName();

    /** 增加系 */
    void addDepartment(String name, String desc);

    /** 返回一个迭代器，遍历 */
    Iterator createIterator();
}
