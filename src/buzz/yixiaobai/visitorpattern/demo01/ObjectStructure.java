package buzz.yixiaobai.visitorpattern.demo01;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yixiaobai
 * @create 2022/04/27 下午8:00
 */
public class ObjectStructure {

    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();


    // 增加到list
    public void attach(Person p){
        persons.add(p);
    }

    /**
     * 移除
     * @param p
     */
    public void detach(Person p) {
        persons.remove(p);
    }

    /**
     * 显示评分情况
     * @param action
     */
    public void display(Action action){
        for(Person p : persons){
            p.accept(action);
        }
    }
}
