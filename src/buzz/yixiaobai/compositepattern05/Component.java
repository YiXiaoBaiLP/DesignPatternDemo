package buzz.yixiaobai.compositepattern05;

import java.util.ArrayList;

/**
 * 透明组合模式-抽象构件
 * @author yixiaobai
 * @create 2022/04/18 下午12:01
 */
public abstract class Component {
    // 个体和整体都具有的共享
    public void doSomething(){
        // 业务实现
    }
    // 增加一个叶子或树枝构件
    public abstract void add(Component component);
    // 删除一个叶子或树枝构件
    public abstract void remove(Component component);
    // 获得分支下的所有叶子构件和树枝构件
    public abstract ArrayList<Component> getChildren();
}
