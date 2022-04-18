package buzz.yixiaobai.compositepattern04;

import java.util.ArrayList;

/**
 * 树枝构件
 * @author yixiaobai
 * @create 2022/04/18 上午12:06
 */
public class Composite extends Component{

    // 构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();
    // 增加一个叶子构件或树枝构件
    public void add(Component component){
        this.componentArrayList.add(component);
    }
    // 删除一个叶子构件或树枝构件
    public void remove(Component component){
        this.componentArrayList.remove(component);
    }
    // 获得分支下的所有构件和树枝构件
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
