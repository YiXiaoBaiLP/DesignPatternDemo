package buzz.yixiaobai.compositepattern05;

import java.util.ArrayList;

/**
 * 透明组合模式-树叶节点
 * @author yixiaobai
 * @create 2022/04/18 下午12:05
 */
public class Leaf extends Component{
    @Deprecated
    @Override
    public void add(Component component) throws UnsupportedOperationException {
        // 空实现，直接抛弃一个不支持的异常
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(Component component) throws UnsupportedOperationException{
        // 空实现
        throw new UnsupportedOperationException();
    }
    @Deprecated
    @Override
    public ArrayList<Component> getChildren() throws UnsupportedOperationException{
        // 空实现
        throw new UnsupportedOperationException();
    }
}
